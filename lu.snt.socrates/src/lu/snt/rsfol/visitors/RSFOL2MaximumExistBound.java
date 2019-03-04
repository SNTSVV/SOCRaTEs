package lu.snt.rsfol.visitors;

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
import lu.snt.rsfol.timedterm.InfiniteTerm;
import lu.snt.rsfol.timedterm.TimedTermExpression;
import lu.snt.rsfol.timedterm.TimedTermNumber;

public class RSFOL2MaximumExistBound implements RSFOLVisitor<Float> {

	
	@Override
	public Float visit(SignalID signal) {
		return 0f;
	}

	@Override
	public Float visit(Tvariable tvariable) {
		return 0f;
	}

	@Override
	public Float visit(Signal signal) {
		return 0f;
	}
	@Override
	public Float visit(SignalVector signalVector) {
		return 0f;
	}

	@Override
	public Float visit(SignalMatrix signalMatrix) {
		return 0f;
	}

	@Override
	public Float visit(ForallFormula forallFormula) {
		return forallFormula.getFormula().accept(this);
	}

	@Override
	public Float visit(NotFormula notFormula) {
		return notFormula.getSubformula().accept(this);
	}

	@Override
	public Float visit(BinaryFormula binaryFormula) {
		return Math.max(binaryFormula.getSubformula1().accept(this), binaryFormula.getSubformula2().accept(this));
	}

	@Override
	public Float visit(SignalConstantComparison signalConstantComparison) {
		return 0f;
	}

	@Override
	public Float visit(SignalComparison signalComparison) {
		return 0f;
	}

	@Override
	public Float visit(TimedTermExpression timedTermExpression) {
		return timedTermExpression.getValue().getVal();
	}

	@Override
	public Float visit(TimedTermNumber timedTermNumber) {
		return timedTermNumber.getNumber();
	}

	@Override
	public Float visit(Bound bound) {
		return bound.getRightbound().accept(this);
	}

	@Override
	public Float visit(InfiniteTerm infiniteTerm) {
		
		return infiniteTerm.getMaximumAddedValue();
	}

	@Override
	public Float visit(BinaryExpression binaryExpression) {
		return 0f;

	}

	@Override
	public Float visit(AbsoluteExpression modulusExpression) {
		return 0f;

	}

	@Override
	public Float visit(NormExpression normExpression) {
		return 0f;

	}

	@Override
	public Float visit(SinExpression sinExpression) {
		return 0f;
	}

	@Override
	public Float visit(CosExpression cosExpression) {
		return 0f;
	}

	@Override
	public Float visit(SQRTExpression sqrtExpression) {
		return 0f;
	}

	

	@Override
	public Float visit(ExpressionComparison expressionComparison) {
		return 0f;
	}

	@Override
	public Float visit(Value value) {
		return 0f;
	}

	@Override
	public Float visit(SignedExpression signedExpression) {
		return 0f;
	}

	@Override
	public Float visit(ExistsFormula existsFormula) {
		return Math.max(existsFormula.getBound().accept(this), existsFormula.getFormula().accept(this));
	}

}
