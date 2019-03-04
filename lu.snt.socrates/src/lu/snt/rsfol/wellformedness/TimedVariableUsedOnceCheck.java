package lu.snt.rsfol.wellformedness;

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

public class TimedVariableUsedOnceCheck implements RSFOLVisitor<Boolean> {

	private Set<Tvariable> variablesUsedInOneBound;
	
	public TimedVariableUsedOnceCheck() {
		this.variablesUsedInOneBound=new HashSet<>();
	}

	@Override
	public Boolean visit(SignalID signal) {
		return true;
	}

	@Override
	public Boolean visit(Tvariable tvariable) {
		return true;
	}

	@Override
	public Boolean visit(Signal signal) {
		return true;
	}

	@Override
	public Boolean visit(ForallFormula forallFormula) {
		return forallFormula.getBound().accept(this)&& forallFormula.getFormula().accept(this);
	}

	@Override
	public Boolean visit(NotFormula notFormula) {
		return notFormula.getSubformula().accept(this);
	}

	@Override
	public Boolean visit(BinaryFormula binaryFormula) {
		return binaryFormula.getSubformula1().accept(this) && binaryFormula.getSubformula2().accept(this);
	}

	@Override
	public Boolean visit(SignalConstantComparison signalConstantComparison) {
		return true;
	}

	@Override
	public Boolean visit(SignalComparison signalComparison) {
		return true;
	}

	@Override
	public Boolean visit(TimedTermExpression timedTermExpression) {
		return true;
	}

	@Override
	public Boolean visit(TimedTermNumber timedTermNumber) {
		return true;
	}

	@Override
	public Boolean visit(Bound bound) {
		if(this.variablesUsedInOneBound.contains(bound.getTvariable())) {
			return false;
		}
		else {
			this.variablesUsedInOneBound.add(bound.getTvariable());
			return true;
		}
	}

	@Override
	public Boolean visit(InfiniteTerm infiniteTerm) {
		return true;
	}

	@Override
	public Boolean visit(BinaryExpression binaryExpression) {
		return true;
	}

	@Override
	public Boolean visit(AbsoluteExpression modulusExpression) {
		return true;
	}

	@Override
	public Boolean visit(NormExpression normExpression) {
		return true;
	}

	@Override
	public Boolean visit(SinExpression sinExpression) {
		return true;
	}

	@Override
	public Boolean visit(CosExpression cosExpression) {
		return true;
	}

	@Override
	public Boolean visit(SQRTExpression sqrtExpression) {
		return true;
	}

	@Override
	public Boolean visit(SignalVector signalVector) {
		return true;
	}

	@Override
	public Boolean visit(SignalMatrix signalMatrix) {
		return true;
	}

	@Override
	public Boolean visit(ExpressionComparison expressionComparison) {
		return true;
	}

	@Override
	public Boolean visit(Value value) {
		return true;
	}

	@Override
	public Boolean visit(SignedExpression signedExpression) {
		return true;
	}

	@Override
	public Boolean visit(ExistsFormula existsFormula) {
		return existsFormula.getBound().accept(this)&& existsFormula.getFormula().accept(this);
	}
	
	

}
