package lu.snt.rsfol.preprocessing;

import java.util.Map.Entry;
import java.util.Set;

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
import lu.snt.rsfol.expression.Expression;
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
import lu.snt.rsfol.timedterm.TimedTerm;
import lu.snt.rsfol.timedterm.TimedTermExpression;
import lu.snt.rsfol.timedterm.TimedTermNumber;
import lu.snt.rsfol.visitors.RSFOLVisitor;

public class Preprocess implements RSFOLVisitor<RSFOLFormula> {

	int newvariablecounter = 0;

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
		return new Signal(signal.getSignalID(), (TimedTerm) signal.getTimedTerm().accept(this));
	}

	@Override
	public RSFOLFormula visit(ForallFormula forallFormula) {
		return new ForallFormula((Bound) forallFormula.getBound().accept(this),
				forallFormula.getFormula().accept(this));
	}

	@Override
	public RSFOLFormula visit(NotFormula notFormula) {
		return new NotFormula(notFormula.getSubformula().accept(this));
	}

	@Override
	public RSFOLFormula visit(BinaryFormula binaryFormula) {
		return new BinaryFormula(binaryFormula.getSubformula1().accept(this), binaryFormula.getOp(),
				binaryFormula.getSubformula2().accept(this));
	}

	@Override
	public RSFOLFormula visit(SignalConstantComparison signalConstantComparison) {
		if (signalConstantComparison.refersToConstantInstant()) {

			Set<Entry<String, Float>> res = signalConstantComparison.accept(new PreprocessVariableCreation());
			RSFOLFormula resf = signalConstantComparison;

			for (Entry<String, Float> e : res) {
				resf = new ForallFormula(new Bound(new Tvariable(e.getKey()), new TimedTermNumber(e.getValue()),
						new TimedTermNumber(e.getValue()), false, false), resf);
			}
			return resf;
		} else {
			return signalConstantComparison;
		}
	}

	@Override
	public RSFOLFormula visit(SignalComparison signalComparison) {
		if (signalComparison.refersToConstantInstant()) {

			Set<Entry<String, Float>> res = signalComparison.accept(new PreprocessVariableCreation());
			RSFOLFormula resf = signalComparison;

			for (Entry<String, Float> e : res) {
				resf = new ForallFormula(new Bound(new Tvariable(e.getKey()), new TimedTermNumber(e.getValue()),
						new TimedTermNumber(e.getValue()), false, false), resf);
			}
			return resf;
		} else {
			return signalComparison;
		}
	}

	@Override
	public RSFOLFormula visit(TimedTermExpression timedTermExpression) {
		return timedTermExpression;
	}

	@Override
	public RSFOLFormula visit(TimedTermNumber timedTermNumber) {
		return timedTermNumber;
	}

	@Override
	public RSFOLFormula visit(Bound bound) {
		return bound;
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
		return new SignalMatrix((SignalID) signalMatrix.getSignalID().accept(this),
				(TimedTerm) signalMatrix.getTimedTerm().accept(this), (int) signalMatrix.getIndex1(),
				(int) signalMatrix.getIndex2());
	}

	@Override
	public RSFOLFormula visit(ExpressionComparison expressionComparison) {
		
		if (expressionComparison.refersToConstantInstant()) {

			Set<Entry<String, Float>> res = expressionComparison.accept(new PreprocessVariableCreation());
			RSFOLFormula resf = expressionComparison;

			for (Entry<String, Float> e : res) {
				resf = new ForallFormula(new Bound(new Tvariable(e.getKey()), new TimedTermNumber(e.getValue()),
						new TimedTermNumber(e.getValue()), false, false), resf);
			}
			return resf;
		} else {
			return expressionComparison;
		}
	}

	@Override
	public RSFOLFormula visit(Value value) {
		return value;
	}

	@Override
	public RSFOLFormula visit(SignedExpression signedExpression) {
		return new SignedExpression((Expression) signedExpression.getExp().accept(this), signedExpression.getOp());
	}

	@Override
	public RSFOLFormula visit(ExistsFormula existsFormula) {
		return new ExistsFormula((Bound) existsFormula.getBound().accept(this),
				existsFormula.getFormula().accept(this));
	}
}
