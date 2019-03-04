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

public class RSFOL2Size implements RSFOLVisitor<Integer> {

	@Override
	public Integer visit(SignalID signal) {
		return 0;
	}

	@Override
	public Integer visit(Tvariable tvariable) {
		return 0;
	}

	@Override
	public Integer visit(Signal signal) {
		return signal.getSignalID().accept(this)+signal.getTimedTerm().accept(this);
	}

	@Override
	public Integer visit(ForallFormula forallFormula) {
		return 1+forallFormula.getBound().accept(this)+forallFormula.getFormula().accept(this);
	}

	@Override
	public Integer visit(NotFormula notFormula) {
		return 1+notFormula.getSubformula().accept(this);
	}

	@Override
	public Integer visit(BinaryFormula binaryFormula) {
		return 1+binaryFormula.getSubformula1().accept(this)+binaryFormula.getSubformula2().accept(this);
	}

	@Override
	public Integer visit(SignalConstantComparison signalConstantComparison) {
		return 1+signalConstantComparison.getSignal().accept(this);
	}

	@Override
	public Integer visit(SignalComparison signalComparison) {
		return 1+signalComparison.getSignal1().accept(this)+signalComparison.getSignal2().accept(this);
	}

	@Override
	public Integer visit(TimedTermExpression timedTermExpression) {
		return 1+timedTermExpression.getTvariable().accept(this);
	}

	@Override
	public Integer visit(TimedTermNumber timedTermNumber) {
		return 0;
	}

	@Override
	public Integer visit(Bound bound) {
		return bound.getLeftbound().accept(this)+bound.getRightbound().accept(this);
	}

	@Override
	public Integer visit(InfiniteTerm infiniteTerm) {
		return 0;
	}

	@Override
	public Integer visit(BinaryExpression binaryExpression) {
		return 1+binaryExpression.getLeftExpression().accept(this)+binaryExpression.getRightExpression().accept(this);
	}

	@Override
	public Integer visit(AbsoluteExpression modulusExpression) {
		return 1+modulusExpression.getSubformula().accept(this);
	}

	@Override
	public Integer visit(NormExpression normExpression) {
		return 1+normExpression.getSubformula().accept(this);
	}

	@Override
	public Integer visit(SinExpression sinExpression) {
		return 1+sinExpression.getSubformula().accept(this);
	}

	@Override
	public Integer visit(CosExpression cosExpression) {
		return 1+cosExpression.getSubformula().accept(this);
	}

	@Override
	public Integer visit(SQRTExpression sqrtExpression) {
		return 1+sqrtExpression.getSubformula().accept(this);
	}

	@Override
	public Integer visit(SignalVector signalVector) {
		return 0;
	}

	@Override
	public Integer visit(SignalMatrix signalMatrix) {
		return 0;
	}

	@Override
	public Integer visit(ExpressionComparison expressionComparison) {
		return 1+expressionComparison.getExpression1().accept(this)+expressionComparison.getExpression2().accept(this);
	}

	@Override
	public Integer visit(Value value) {
		return 0;
	}

	@Override
	public Integer visit(SignedExpression signedExpression) {
		return 1+signedExpression.getExp().accept(this);
	}

	@Override
	public Integer visit(ExistsFormula existsFormula) {
		return 1+existsFormula.getBound().accept(this)+existsFormula.getFormula().accept(this);
	}
}
