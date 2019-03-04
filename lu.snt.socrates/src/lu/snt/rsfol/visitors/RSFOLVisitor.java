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

public interface RSFOLVisitor<S> {

	/**
	 * returns the output name and the corversion String
	 * @param signal
	 * @return
	 */
	public S visit(SignalID signal);


	public S visit(Tvariable tvariable);

	public S visit(Signal signal);

	public S visit(ForallFormula forallFormula);


	public S visit(NotFormula notFormula);

	public S visit(BinaryFormula binaryFormula);

	public S visit(SignalConstantComparison signalConstantComparison);

	public S visit(SignalComparison signalComparison);

	public S visit(TimedTermExpression timedTermExpression);

	public S visit(TimedTermNumber timedTermNumber);

	public S visit(Bound bound);

	public S visit(InfiniteTerm infiniteTerm);

	public S visit(BinaryExpression binaryExpression);


	public S visit(AbsoluteExpression modulusExpression);


	public S visit(NormExpression normExpression);

	public S visit(SinExpression sinExpression);

	public S visit(CosExpression cosExpression);


	public S visit(SQRTExpression sqrtExpression);


	public S visit(SignalVector signalVector);


	public S visit(SignalMatrix signalMatrix);


	public S visit(ExpressionComparison expressionComparison);


	public S visit(Value value);


	public S visit(SignedExpression signedExpression);


	public S visit(ExistsFormula existsFormula);
}
