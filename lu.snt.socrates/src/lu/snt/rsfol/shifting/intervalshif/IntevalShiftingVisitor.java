package lu.snt.rsfol.shifting.intervalshif;

import java.util.HashMap;
import java.util.Map;

import lu.snt.rsfol.Signal;
import lu.snt.rsfol.SignalID;
import lu.snt.rsfol.SignalMatrix;
import lu.snt.rsfol.SignalVector;
import lu.snt.rsfol.Tvariable;
import lu.snt.rsfol.atoms.ExpressionComparison;
import lu.snt.rsfol.atoms.SignalComparison;
import lu.snt.rsfol.atoms.SignalConstantComparison;
import lu.snt.rsfol.atoms.Value;
import lu.snt.rsfol.expression.AbsoluteExpression;
import lu.snt.rsfol.expression.BinaryExpression;
import lu.snt.rsfol.expression.CosExpression;
import lu.snt.rsfol.expression.NormExpression;
import lu.snt.rsfol.expression.SQRTExpression;
import lu.snt.rsfol.expression.SignedExpression;
import lu.snt.rsfol.expression.SinExpression;
import lu.snt.rsfol.formulae.BinaryFormula;
import lu.snt.rsfol.formulae.Bound;
import lu.snt.rsfol.formulae.ExistsFormula;
import lu.snt.rsfol.formulae.ForallFormula;
import lu.snt.rsfol.formulae.NotFormula;
import lu.snt.rsfol.formulae.RSFOLFormula;
import lu.snt.rsfol.timedterm.InfiniteTerm;
import lu.snt.rsfol.timedterm.TimedTermExpression;
import lu.snt.rsfol.timedterm.TimedTermNumber;
import lu.snt.rsfol.visitors.RSFOLVisitor;

public class IntevalShiftingVisitor implements RSFOLVisitor<RSFOLFormula> {

	private Map<RSFOLFormula, Float> timeShiftingmapconstant;
	private Map<Tvariable, Float> timeShiftingmapaddition;

	private Map<Tvariable, Float> shiftValueConstant;

	private float simulationShifting = 0;

	private float maximumUpperBound = 0;
	private float maximumLowerBound = 0;

	/**
	 * @param formula
	 */
	public IntevalShiftingVisitor(RSFOLFormula formula) {

		this.shiftValueConstant = new HashMap<>();
		this.timeShiftingmapconstant = new HashMap<>();
		this.timeShiftingmapaddition = new HashMap<>();

		this.timeShiftingmapconstant = formula.accept(new GetIntervalShiftingDuConstant());
		this.timeShiftingmapaddition = formula.accept(new GetIntervalShiftingDuAddition());

		for (RSFOLFormula e : timeShiftingmapconstant.keySet()) {
			if (e instanceof ForallFormula) {
				ForallFormula f = (ForallFormula) e;
				// if it must be shifted
				if (this.timeShiftingmapconstant.get(f.getFormula()) > 0) {
					if (f.getBound().getRightbound() instanceof TimedTermNumber)
						this.shiftValueConstant.put(
								f.getBound().getTvariable(),
								this.timeShiftingmapconstant.get(f)
										- ((TimedTermNumber) f.getBound().getRightbound()).getNumber());
				}
			}
			if (e instanceof ExistsFormula) {
				ExistsFormula f = (ExistsFormula) e;
				// if it must be shifted
				if (this.timeShiftingmapconstant.get(f.getFormula()) > 0) {
					if (f.getBound().getRightbound() instanceof TimedTermNumber)
						this.shiftValueConstant.put(f.getBound().getTvariable(),
								this.timeShiftingmapconstant.get(f)
										- ((TimedTermNumber) f.getBound().getRightbound()).getNumber());
				}
			}
		}

	}

	public float getSimulationShifting() {
		return simulationShifting;
	}

	public void setSimulationShifting(float simulationShifting) {
		this.simulationShifting = simulationShifting;
	}

	@Override
	public RSFOLFormula visit(SignalID signal) {
		return signal;
	}

	@Override
	public RSFOLFormula visit(Tvariable tvariable) {
		return tvariable;
	}

	@Override
	public RSFOLFormula visit(Signal signal) {

		signal.getTimedTerm().accept(this);

		return signal;
	}

	@Override
	public RSFOLFormula visit(ForallFormula forallFormula) {

		forallFormula.getBound().accept(this);
		forallFormula.getFormula().accept(this);
		return forallFormula;
	}

	@Override
	public RSFOLFormula visit(NotFormula notFormula) {
		notFormula.getSubformula().accept(this);
		return notFormula;
	}

	@Override
	public RSFOLFormula visit(BinaryFormula binaryFormula) {

		binaryFormula.getSubformula1().accept(this);
		binaryFormula.getSubformula2().accept(this);
		return binaryFormula;
	}

	@Override
	public RSFOLFormula visit(SignalConstantComparison signalConstantComparison) {
		signalConstantComparison.getSignal().accept(this);
		signalConstantComparison.getValue().accept(this);
		return signalConstantComparison;
	}

	@Override
	public RSFOLFormula visit(SignalComparison signalComparison) {
		signalComparison.getSignal1().accept(this);
		signalComparison.getSignal2().accept(this);
		return signalComparison;
	}

	@Override
	public RSFOLFormula visit(TimedTermExpression timedTermExpression) {

		if (shiftValueConstant.containsKey(timedTermExpression.getTvariable())) {
			timedTermExpression.shift(-(shiftValueConstant.get(timedTermExpression.getTvariable())));
		}
		if (timeShiftingmapaddition.containsKey(timedTermExpression.getTvariable())) {
			timedTermExpression.shift(-timeShiftingmapaddition.get(timedTermExpression.getTvariable()));
		}

		return null;
	}

	@Override
	public RSFOLFormula visit(TimedTermNumber timedTermNumber) {
		return timedTermNumber;
	}

	@Override
	public RSFOLFormula visit(Bound bound) {
		if (this.shiftValueConstant.containsKey(bound.getTvariable())) {
			bound.getLeftbound().shift(shiftValueConstant.get(bound.getTvariable()));
			bound.getRightbound().shift(shiftValueConstant.get(bound.getTvariable()));

		}
		if (this.timeShiftingmapaddition.containsKey(bound.getTvariable())) {
			bound.getLeftbound().shift(timeShiftingmapaddition.get(bound.getTvariable()));
			bound.getRightbound().shift(timeShiftingmapaddition.get(bound.getTvariable()));

		}
		bound.getLeftbound().accept(this);
		bound.getRightbound().accept(this);
		if (bound.getRightbound() instanceof InfiniteTerm) {
			simulationShifting = Math.max(simulationShifting, ((InfiniteTerm) bound.getRightbound()).getShiftedValue());

		}
		if (!(maximumUpperBound == -1)) {
			maximumUpperBound = Math.max(maximumUpperBound,
					(bound.getRightbound() instanceof TimedTermNumber)
							? ((TimedTermNumber) bound.getRightbound()).getNumber()
							: 0);
			if(bound.getRightbound() instanceof InfiniteTerm) {
				maximumUpperBound=-1;
			}
		}
		maximumLowerBound = Math.max(maximumLowerBound,
				(bound.getLeftbound() instanceof TimedTermNumber)
						? ((TimedTermNumber) bound.getLeftbound()).getNumber()
						: 0);
		return bound;
	}

	public float getMaximumUpperBound() {
		return maximumUpperBound;
	}

	public float getMaximumLowerBound() {
		return maximumLowerBound;
	}

	@Override
	public RSFOLFormula visit(InfiniteTerm infiniteTerm) {
		return infiniteTerm;
	}

	@Override
	public RSFOLFormula visit(BinaryExpression binaryExpression) {
		binaryExpression.getLeftExpression().accept(this);
		binaryExpression.getRightExpression().accept(this);
		return binaryExpression;
	}

	@Override
	public RSFOLFormula visit(AbsoluteExpression modulusExpression) {
		modulusExpression.getExp().accept(this);
		return modulusExpression;
	}

	@Override
	public RSFOLFormula visit(NormExpression normExpression) {
		normExpression.getExp().accept(this);
		return normExpression;
	}

	@Override
	public RSFOLFormula visit(SinExpression sinExpression) {
		sinExpression.getExp().accept(this);
		return sinExpression;
	}

	@Override
	public RSFOLFormula visit(CosExpression cosExpression) {
		cosExpression.getExp().accept(this);
		return cosExpression;
	}

	@Override
	public RSFOLFormula visit(SQRTExpression sqrtExpression) {
		sqrtExpression.getExp().accept(this);
		return sqrtExpression;
	}

	@Override
	public RSFOLFormula visit(SignalVector signalVector) {
		signalVector.getTimedTerm().accept(this);
		return signalVector;
	}

	@Override
	public RSFOLFormula visit(SignalMatrix signalMatrix) {
		signalMatrix.getTimedTerm().accept(this);
		return signalMatrix;
	}

	@Override
	public RSFOLFormula visit(ExpressionComparison expressionComparison) {
		expressionComparison.getExpression1().accept(this);
		expressionComparison.getExpression2().accept(this);
		return expressionComparison;
	}

	@Override
	public RSFOLFormula visit(Value value) {
		return value;
	}

	@Override
	public RSFOLFormula visit(SignedExpression signedExpression) {
		signedExpression.getExp().accept(this);

		return null;
	}

	@Override
	public RSFOLFormula visit(ExistsFormula existsFormula) {
		existsFormula.getBound().accept(this);
		existsFormula.getFormula().accept(this);
		return existsFormula;
	}
}
