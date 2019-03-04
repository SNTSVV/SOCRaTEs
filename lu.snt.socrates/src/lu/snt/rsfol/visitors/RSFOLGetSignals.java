package lu.snt.rsfol.visitors;

import java.util.HashSet;
import java.util.Set;

import lu.snt.rsfol.SignalID;
import lu.snt.rsfol.Signal;
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

public class RSFOLGetSignals implements RSFOLVisitor<Set<SignalID>>{

	@Override
	public Set<SignalID> visit(SignalID SignalID) {
		Set<SignalID> SignalIDs=new HashSet<>();
		SignalIDs.add(SignalID);
		return SignalIDs;
	}

	@Override
	public Set<SignalID> visit(Tvariable tvariable) {
		return new HashSet<>();
	}

	@Override
	public Set<SignalID> visit(Signal signal) {
		Set<SignalID> SignalIDs=new HashSet<>();
		SignalIDs.addAll(signal.getSignalID().accept(this));
		return SignalIDs;
	}

	@Override
	public Set<SignalID> visit(ForallFormula forallFormula) {
		Set<SignalID> SignalIDs=new HashSet<>();
		SignalIDs.addAll(forallFormula.getBound().accept(this));
		SignalIDs.addAll(forallFormula.getFormula().accept(this));
		return SignalIDs;
	}

	@Override
	public Set<SignalID> visit(NotFormula notFormula) {
		Set<SignalID> SignalIDs=new HashSet<>();
		SignalIDs.addAll(notFormula.getSubformula().accept(this));
		return SignalIDs;
	}

	@Override
	public Set<SignalID> visit(BinaryFormula binaryFormula) {
		Set<SignalID> SignalIDs=new HashSet<>();
		SignalIDs.addAll(binaryFormula.getSubformula1().accept(this));
		SignalIDs.addAll(binaryFormula.getSubformula2().accept(this));
		return SignalIDs;
	}

	@Override
	public Set<SignalID> visit(SignalConstantComparison SignalIDConstantComparison) {
		Set<SignalID> SignalIDs=new HashSet<>();
		SignalIDs.addAll(SignalIDConstantComparison.getSignal().accept(this));
		SignalIDs.addAll(SignalIDConstantComparison.getValue().accept(this));
		return SignalIDs;
	}

	@Override
	public Set<SignalID> visit(SignalComparison SignalIDComparison) {
		Set<SignalID> SignalIDs=new HashSet<>();
		SignalIDs.addAll(SignalIDComparison.getSignal1().accept(this));
		SignalIDs.addAll(SignalIDComparison.getSignal2().accept(this));
		return SignalIDs;
	}

	@Override
	public Set<SignalID> visit(TimedTermExpression timedTermExpression) {
		Set<SignalID> SignalIDs=new HashSet<>();
		SignalIDs.addAll(timedTermExpression.getTvariable().accept(this));
		SignalIDs.addAll(timedTermExpression.getValue().accept(this));
		return SignalIDs;
	}

	@Override
	public Set<SignalID> visit(TimedTermNumber timedTermNumber) {
		Set<SignalID> SignalIDs=new HashSet<>();
		return SignalIDs;
	}

	@Override
	public Set<SignalID> visit(Bound bound) {
		Set<SignalID> SignalIDs=new HashSet<>();
		SignalIDs.addAll(bound.getLeftbound().accept(this));
		SignalIDs.addAll(bound.getRightbound().accept(this));
		SignalIDs.addAll(bound.getTvariable().accept(this));
		return SignalIDs;
	}

	@Override
	public Set<SignalID> visit(InfiniteTerm infiniteTerm) {
		Set<SignalID> SignalIDs=new HashSet<>();
		return SignalIDs;
	}

	@Override
	public Set<SignalID> visit(BinaryExpression binaryExpression) {
		Set<SignalID> SignalIDs=new HashSet<>();
		SignalIDs.addAll(binaryExpression.getLeftExpression().accept(this));
		SignalIDs.addAll(binaryExpression.getRightExpression().accept(this));
		return SignalIDs;
	}

	@Override
	public Set<SignalID> visit(AbsoluteExpression modulusExpression) {
		Set<SignalID> SignalIDs=new HashSet<>();
		SignalIDs.addAll(modulusExpression.getSubformula().accept(this));
		return SignalIDs;
	}

	@Override
	public Set<SignalID> visit(NormExpression normExpression) {
		Set<SignalID> SignalIDs=new HashSet<>();
		SignalIDs.addAll(normExpression.getSubformula().accept(this));
		return SignalIDs;
	}

	@Override
	public Set<SignalID> visit(SinExpression sinExpression) {
		Set<SignalID> SignalIDs=new HashSet<>();
		SignalIDs.addAll(sinExpression.getSubformula().accept(this));
		return SignalIDs;
	}

	@Override
	public Set<SignalID> visit(CosExpression cosExpression) {
		Set<SignalID> SignalIDs=new HashSet<>();
		SignalIDs.addAll(cosExpression.getSubformula().accept(this));
		return SignalIDs;
	}

	@Override
	public Set<SignalID> visit(SQRTExpression sqrtExpression) {
		Set<SignalID> SignalIDs=new HashSet<>();
		SignalIDs.addAll(sqrtExpression.getSubformula().accept(this));
		return SignalIDs;
	}

	@Override
	public Set<SignalID> visit(SignalVector SignalIDVector) {
		Set<SignalID> SignalIDs=new HashSet<>();
		SignalIDs.addAll(SignalIDVector.getSignalID().accept(this));
		return SignalIDs;
	}

	@Override
	public Set<SignalID> visit(SignalMatrix SignalIDMatrix) {
		Set<SignalID> SignalIDs=new HashSet<>();
		SignalIDs.addAll(SignalIDMatrix.getSignalID().accept(this));
		return SignalIDs;
	}

	@Override
	public Set<SignalID> visit(ExpressionComparison expressionComparison) {
		Set<SignalID> SignalIDs=new HashSet<>();
		SignalIDs.addAll(expressionComparison.getExpression1().accept(this));
		SignalIDs.addAll(expressionComparison.getExpression2().accept(this));

		return SignalIDs;
	}

	@Override
	public Set<SignalID> visit(Value value) {
		return new HashSet<>();
	}

	@Override
	public Set<SignalID> visit(SignedExpression signedExpression) {
		Set<SignalID> SignalIDs=new HashSet<>();
		SignalIDs.addAll(signedExpression.getExp().accept(this));
		return SignalIDs;
	}

	@Override
	public Set<SignalID> visit(ExistsFormula existsFormula) {
		Set<SignalID> SignalIDs=new HashSet<>();
		SignalIDs.addAll(existsFormula.getBound().accept(this));
		SignalIDs.addAll(existsFormula.getFormula().accept(this));
		return SignalIDs;
	}	
}
