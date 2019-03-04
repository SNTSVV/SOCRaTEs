package lu.snt.rsfol.shifting.intervalshif;

import java.util.HashMap;
import java.util.Map;

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
import lu.snt.rsfol.visitors.RSFOLVisitor;

public class GetIntervalShiftingDuAddition implements RSFOLVisitor<Map<Tvariable, Float>> {


	@Override
	public Map<Tvariable, Float> visit(Tvariable tvariable) {
		return new HashMap<>();
	}

	@Override
	public Map<Tvariable, Float> visit(Signal signal) {
		return  new HashMap<>();
	}

	@Override
	public Map<Tvariable, Float> visit(SignalVector signal) {
		return  new HashMap<>();
	}

	@Override
	public Map<Tvariable, Float> visit(SignalMatrix signal) {
		return  new HashMap<>();
	}

	@Override
	public Map<Tvariable, Float> visit(ForallFormula forallFormula) {
		Map<Tvariable, Float> map = new HashMap<>();
		map.putAll(forallFormula.getFormula().accept(this));
		map.putAll(forallFormula.getBound().accept(this));

		return map;
	}

	@Override
	public Map<Tvariable, Float> visit(NotFormula notFormula) {
		Map<Tvariable, Float> map = new HashMap<>();
		map.putAll(notFormula.getSubformula().accept(this));

		return map;
	}

	@Override
	public Map<Tvariable, Float> visit(BinaryFormula binaryFormula) {
		Map<Tvariable, Float> map = new HashMap<>();
		map.putAll(binaryFormula.getSubformula1().accept(this));

		Map<Tvariable, Float> tmp = binaryFormula.getSubformula2().accept(this);
		for (Tvariable id : tmp.keySet()) {
			if(!map.containsKey(id)) {
				map.put(id, tmp.get(id));
			}
			else {
				map.put(id, Math.max(tmp.get(id), map.get(id)));
			}
		}
		return map;
	}

	@Override
	public Map<Tvariable, Float> visit(SignalConstantComparison signalConstantComparison) {

		Map<Tvariable, Float> map = new HashMap<>();
		map.putAll(signalConstantComparison.getSignal().accept(this));
		map.putAll(signalConstantComparison.getValue().accept(this));
		return map;

	}

	@Override
	public Map<Tvariable, Float> visit(SignalComparison signalComparison) {

		Map<Tvariable, Float> map = new HashMap<>();
		map.putAll(signalComparison.getSignal1().accept(this));
		map.putAll(signalComparison.getSignal2().accept(this));

		return map;
	}

	@Override
	public Map<Tvariable, Float> visit(TimedTermExpression timedTermExpression) {
		Map<Tvariable, Float> map = new HashMap<>();
		map.put(timedTermExpression.getTvariable(), timedTermExpression.getMaximumAddedValue());
		return map;
	}

	@Override
	public Map<Tvariable, Float> visit(TimedTermNumber timedTermNumber) {
		return new HashMap<>();
	}

	@Override
	public Map<Tvariable, Float> visit(Bound bound) {
		Map<Tvariable, Float> map = new HashMap<>();
		map.putAll(bound.getLeftbound().accept(this));

		Map<Tvariable, Float> tmp = bound.getRightbound().accept(this);
		for (Tvariable id : tmp.keySet()) {
			if(!map.containsKey(id)) {
				map.put(id, tmp.get(id));
			}
			else {
				map.put(id, Math.max(tmp.get(id), map.get(id)));
			}
		}
		return map;
	}

	@Override
	public Map<Tvariable, Float> visit(InfiniteTerm infiniteTerm) {
		return new HashMap<>();
	}

	@Override
	public Map<Tvariable, Float> visit(BinaryExpression binaryExpression) {
		Map<Tvariable, Float> map = new HashMap<>();
		map.putAll(binaryExpression.getLeftExpression().accept(this));
		map.putAll(binaryExpression.getRightExpression().accept(this));
		return map;
	}

	@Override
	public Map<Tvariable, Float> visit(AbsoluteExpression expression) {
		Map<Tvariable, Float> map = new HashMap<>();
		map.putAll(expression.getSubformula().accept(this));
		map.putAll(expression.getSubformula().accept(this));
		return map;
	}

	@Override
	public Map<Tvariable, Float> visit(NormExpression expression) {
		Map<Tvariable, Float> map = new HashMap<>();
		map.putAll(expression.getSubformula().accept(this));
		map.putAll(expression.getSubformula().accept(this));
		return map;
	}

	@Override
	public Map<Tvariable, Float> visit(SinExpression expression) {
		Map<Tvariable, Float> map = new HashMap<>();
		map.putAll(expression.getSubformula().accept(this));
		return map;
	}

	@Override
	public Map<Tvariable, Float> visit(CosExpression expression) {
		Map<Tvariable, Float> map = new HashMap<>();
		map.putAll(expression.getSubformula().accept(this));
		return map;
	}

	@Override
	public Map<Tvariable, Float> visit(SQRTExpression expression) {
		Map<Tvariable, Float> map = new HashMap<>();
		map.putAll(expression.getSubformula().accept(this));
		return map;
	}

	@Override
	public Map<Tvariable, Float> visit(ExpressionComparison expression) {
		Map<Tvariable, Float> map = new HashMap<>();
		map.putAll(expression.getExpression1().accept(this));
		map.putAll(expression.getExpression2().accept(this));
		return map;
	}

	@Override
	public Map<Tvariable, Float> visit(Value value) {
		return new HashMap<>();
	}

	@Override
	public Map<Tvariable, Float> visit(SignedExpression expression) {
		return new HashMap<>();
	}

	@Override
	public Map<Tvariable, Float> visit(lu.snt.rsfol.SignalID signal) {
		return new HashMap<>();

	}

	@Override
	public Map<Tvariable, Float> visit(ExistsFormula existsFormula) {
		Map<Tvariable, Float> map = new HashMap<>();
		map.putAll(existsFormula.getFormula().accept(this));
		map.putAll(existsFormula.getBound().accept(this));

		return map;
	}
}