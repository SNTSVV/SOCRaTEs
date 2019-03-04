package lu.snt.rsfol.shifting.intervalshif;

import java.util.HashSet;
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
import lu.snt.rsfol.visitors.RSFOLVisitor;

public class GetVariableTimedTerms implements RSFOLVisitor<Set<TimedTermExpression>> {

	@Override
	public Set<TimedTermExpression> visit(SignalID signal) {
		return new HashSet<>();
	}

	@Override
	public Set<TimedTermExpression> visit(Tvariable tvariable) {
		return new HashSet<>();
	}

	@Override
	public Set<TimedTermExpression> visit(Signal signal) {
		Set<TimedTermExpression> term = new HashSet<>();
		term.addAll(signal.getTimedTerm().accept(this));
		return term;
	}

	@Override
	public Set<TimedTermExpression> visit(ForallFormula forallFormula) {
		return forallFormula.getFormula().accept(this);
	}

	@Override
	public Set<TimedTermExpression> visit(NotFormula notFormula) {
		return notFormula.getSubformula().accept(this);
	}

	@Override
	public Set<TimedTermExpression> visit(BinaryFormula binaryFormula) {
		Set<TimedTermExpression> term = new HashSet<>();
		term.addAll(binaryFormula.getSubformula1().accept(this));
		term.addAll(binaryFormula.getSubformula2().accept(this));
		return term;
	}

	@Override
	public Set<TimedTermExpression> visit(SignalConstantComparison signalConstantComparison) {
		return signalConstantComparison.getSignal().accept(this);
	}

	@Override
	public Set<TimedTermExpression> visit(SignalComparison signalComparison) {
		return new HashSet<>();
	}

	@Override
	public Set<TimedTermExpression> visit(TimedTermExpression timedTermExpression) {
		HashSet<TimedTermExpression> t = new HashSet<>();
		t.add(timedTermExpression);
		return t;
	}

	@Override
	public Set<TimedTermExpression> visit(TimedTermNumber timedTermNumber) {
		return new HashSet<>();
	}

	@Override
	public Set<TimedTermExpression> visit(Bound bound) {
		return new HashSet<>();
	}

	@Override
	public Set<TimedTermExpression> visit(InfiniteTerm infiniteTerm) {
		return new HashSet<>();
	}

	@Override
	public Set<TimedTermExpression> visit(BinaryExpression binaryExpression) {
		Set<TimedTermExpression> term = new HashSet<>();
		term.addAll(binaryExpression.getLeftExpression().accept(this));
		term.addAll(binaryExpression.getRightExpression().accept(this));		
		return term;
	}

	@Override
	public Set<TimedTermExpression> visit(AbsoluteExpression modulusExpression) {
		return modulusExpression.getSubformula().accept(this);
	}

	@Override
	public Set<TimedTermExpression> visit(NormExpression normExpression) {
		return normExpression.getSubformula().accept(this);
	}

	@Override
	public Set<TimedTermExpression> visit(SinExpression sinExpression) {
		return sinExpression.getSubformula().accept(this);
	}

	@Override
	public Set<TimedTermExpression> visit(CosExpression cosExpression) {
		return cosExpression.getSubformula().accept(this);
	}

	@Override
	public Set<TimedTermExpression> visit(SQRTExpression sqrtExpression) {
		return sqrtExpression.getSubformula().accept(this);
	}

	@Override
	public Set<TimedTermExpression> visit(SignalVector signalVector) {
		return new HashSet<>();
	}

	@Override
	public Set<TimedTermExpression> visit(SignalMatrix signalMatrix) {
		return new HashSet<>();
	}

	@Override
	public Set<TimedTermExpression> visit(ExpressionComparison expressionComparison) {
		return new HashSet<>();
	}

	@Override
	public Set<TimedTermExpression> visit(Value value) {
		return new HashSet<>();
	}

	@Override
	public Set<TimedTermExpression> visit(SignedExpression signedExpression) {
		return new HashSet<>();
	}

	@Override
	public Set<TimedTermExpression> visit(ExistsFormula existsFormula) {
		return existsFormula.getFormula().accept(this);
	}

}
