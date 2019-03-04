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

public class GetIntervalShiftingDuConstant implements RSFOLVisitor<Map<RSFOLFormula, Float>> {

	@Override
	public Map<RSFOLFormula, Float> visit(SignalID signal) {
		Map<RSFOLFormula, Float> map = new HashMap<>();
		map.put(signal, (float) 0);
		return map;
	}

	@Override
	public Map<RSFOLFormula, Float> visit(Tvariable tvariable) {
		Map<RSFOLFormula, Float> map = new HashMap<>();
		map.put(tvariable, (float) 0);
		return map;
	}

	@Override
	public Map<RSFOLFormula, Float> visit(Signal signal) {
		Map<RSFOLFormula, Float> map = new HashMap<>();
		map.putAll(signal.getTimedTerm().accept(this));
		map.putAll(signal.getSignalID().accept(this));
		// time is not considered in the computation of du
		map.put(signal, new Float(0));
		return map;
	}

	@Override
	public Map<RSFOLFormula, Float> visit(ForallFormula forallFormula) {
		Map<RSFOLFormula, Float> map = new HashMap<>();
		map.putAll(forallFormula.getFormula().accept(this));
		map.putAll(forallFormula.getBound().accept(this));

		map.put(forallFormula,
				Math.max(
						map.get(forallFormula.getFormula()),
						map.get(forallFormula.getBound())));


		return map;
	}

	

	@Override
	public Map<RSFOLFormula, Float> visit(NotFormula notFormula) {
		Map<RSFOLFormula, Float> map = new HashMap<>();
		map.putAll(notFormula.getSubformula().accept(this));
		map.put(notFormula, map.get(notFormula.getSubformula()));

		return map;
	}

	@Override
	public Map<RSFOLFormula, Float> visit(BinaryFormula binaryFormula) {
		Map<RSFOLFormula, Float> map = new HashMap<>();
		map.putAll(binaryFormula.getSubformula1().accept(this));
		map.putAll(binaryFormula.getSubformula2().accept(this));
		map.put(binaryFormula,
				Math.max(map.get(binaryFormula.getSubformula1()), map.get(binaryFormula.getSubformula2())));

		return map;
	}

	@Override
	public Map<RSFOLFormula, Float> visit(SignalConstantComparison signalConstantComparison) {

		Map<RSFOLFormula, Float> map = new HashMap<>();
		map.putAll(signalConstantComparison.getSignal().accept(this));
		map.putAll(signalConstantComparison.getValue().accept(this));
		map.put(signalConstantComparison, map.get(signalConstantComparison.getSignal()));
		return map;

	}

	@Override
	public Map<RSFOLFormula, Float> visit(SignalComparison signalComparison) {

		Map<RSFOLFormula, Float> map = new HashMap<>();
		map.putAll(signalComparison.getSignal1().accept(this));
		map.putAll(signalComparison.getSignal2().accept(this));
		map.put(signalComparison,
				Math.max(map.get(signalComparison.getSignal1()), map.get(signalComparison.getSignal2())));

		return map;
	}

	@Override
	public Map<RSFOLFormula, Float> visit(TimedTermExpression timedTermExpression) {
		Map<RSFOLFormula, Float> map = new HashMap<>();
		map.putAll(timedTermExpression.getValue().accept(this));
		map.putAll(timedTermExpression.getTvariable().accept(this));
		
		map.put(timedTermExpression,  new Float(0));
		
		return map;
	}

	@Override
	public Map<RSFOLFormula, Float> visit(TimedTermNumber timedTermNumber) {
		Map<RSFOLFormula, Float> map = new HashMap<>();
		map.put(timedTermNumber, timedTermNumber.getNumber());
		return map;
	}

	@Override
	public Map<RSFOLFormula, Float> visit(Bound bound) {
		Map<RSFOLFormula, Float> map = new HashMap<>();
		map.putAll(bound.getRightbound().accept(this));
		map.putAll(bound.getLeftbound().accept(this));
		
		map.put(bound, Math.max(map.get(bound.getRightbound()), map.get(bound.getLeftbound())));
		return map;
	}

	@Override
	public Map<RSFOLFormula, Float> visit(InfiniteTerm infiniteTerm) {
		Map<RSFOLFormula, Float> map = new HashMap<>();
		map.put(infiniteTerm, (float) 0);
		return map;
	}

	@Override
	public Map<RSFOLFormula, Float> visit(BinaryExpression binaryExpression) {
		Map<RSFOLFormula, Float> map = new HashMap<>();
		map.putAll(binaryExpression.getLeftExpression().accept(this));
		map.putAll(binaryExpression.getRightExpression().accept(this));
		map.put(binaryExpression, 
				Math.max(map.get(binaryExpression.getLeftExpression()), 
						map.get(binaryExpression.getRightExpression()))
				);
		return map;
	}

	@Override
	public Map<RSFOLFormula, Float> visit(AbsoluteExpression expression) {
		Map<RSFOLFormula, Float> map = new HashMap<>();
		map.putAll(expression.getSubformula().accept(this));
		map.putAll(expression.getSubformula().accept(this));
		map.put(expression, map.get(expression.getSubformula()
				));
		return map;
	}

	@Override
	public Map<RSFOLFormula, Float> visit(NormExpression expression) {
		Map<RSFOLFormula, Float> map = new HashMap<>();
		map.putAll(expression.getSubformula().accept(this));
		map.putAll(expression.getSubformula().accept(this));
		map.put(expression, map.get(expression.getSubformula()
				));
		return map;
	}

	@Override
	public Map<RSFOLFormula, Float> visit(SinExpression expression) {
		Map<RSFOLFormula, Float> map = new HashMap<>();
		map.putAll(expression.getSubformula().accept(this));
		map.putAll(expression.getSubformula().accept(this));
		map.put(expression, map.get(expression.getSubformula()
				));
		return map;
	}

	@Override
	public Map<RSFOLFormula, Float> visit(CosExpression expression) {
		Map<RSFOLFormula, Float> map = new HashMap<>();
		map.putAll(expression.getSubformula().accept(this));
		map.putAll(expression.getSubformula().accept(this));
		map.put(expression, map.get(expression.getSubformula()
				));
		return map;
	}

	@Override
	public Map<RSFOLFormula, Float> visit(SQRTExpression expression) {
		Map<RSFOLFormula, Float> map = new HashMap<>();
		map.putAll(expression.getSubformula().accept(this));
		map.put(expression, map.get(expression.getSubformula()
				));
		return map;
	}

	@Override
	public Map<RSFOLFormula, Float> visit(SignalVector signal) {
		Map<RSFOLFormula, Float> map = new HashMap<>();
		map.putAll(signal.getTimedTerm().accept(this));
		map.putAll(signal.getSignalID().accept(this));
		map.put(signal, map.get(signal.getTimedTerm()));
		return map;
	}

	@Override
	public Map<RSFOLFormula, Float> visit(SignalMatrix signal) {
		Map<RSFOLFormula, Float> map = new HashMap<>();
		map.putAll(signal.getTimedTerm().accept(this));
		map.putAll(signal.getSignalID().accept(this));
		map.put(signal, map.get(signal.getTimedTerm()));
		return map;
	}

	@Override
	public Map<RSFOLFormula, Float> visit(ExpressionComparison expression) {
		Map<RSFOLFormula, Float> map = new HashMap<>();
		map.putAll(expression.getExpression1().accept(this));
		map.putAll(expression.getExpression2().accept(this));
		map.put(expression, Math.max(map.get(expression.getExpression1()), 
				map.get(expression.getExpression2())));
		return map;
	}

	@Override
	public Map<RSFOLFormula, Float> visit(Value value) {
		Map<RSFOLFormula, Float> map = new HashMap<>();
		map.put(value, new Float(0));
		return map;
	}

	@Override
	public Map<RSFOLFormula, Float> visit(SignedExpression expression) {
		Map<RSFOLFormula, Float> map = new HashMap<>();
		map.putAll(expression.getExp().accept(this));
		map.put(expression, map.get(expression.getExp()
				));
		return map;
	}

	@Override
	public Map<RSFOLFormula, Float> visit(ExistsFormula existsFormula) {
		Map<RSFOLFormula, Float> map = new HashMap<>();
		map.putAll(existsFormula.getFormula().accept(this));
		map.putAll(existsFormula.getBound().accept(this));

		map.put(existsFormula,
				Math.max(
						map.get(existsFormula.getFormula()),
						map.get(existsFormula.getBound())));


		return map;
	}
}