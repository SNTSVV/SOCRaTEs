package lu.snt.rsfol.shifting.intervalshif;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
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

public class GetParentRelation implements RSFOLVisitor<Map<RSFOLFormula, Set<RSFOLFormula>>> {

	@Override
	public Map<RSFOLFormula, Set<RSFOLFormula>> visit(SignalID signal) {
		Map<RSFOLFormula, Set<RSFOLFormula>> map = new HashMap<>();
		map.put(signal, new HashSet<>());
		return map;
	}

	@Override
	public Map<RSFOLFormula, Set<RSFOLFormula>> visit(Tvariable tvariable) {
		Map<RSFOLFormula, Set<RSFOLFormula>> map = new HashMap<>();
		map.put(tvariable, new HashSet<>());
		return map;
	}

	@Override
	public Map<RSFOLFormula, Set<RSFOLFormula>> visit(Signal signal) {
		Map<RSFOLFormula, Set<RSFOLFormula>> map = new HashMap<>();
		map.put(signal, new HashSet<>());
		return map;
	}

	@Override
	public Map<RSFOLFormula, Set<RSFOLFormula>> visit(ForallFormula forallFormula) {
		Map<RSFOLFormula, Set<RSFOLFormula>> map = new HashMap<>();
		map.putAll(forallFormula.getBound().accept(this));
		map.putAll(forallFormula.getFormula().accept(this));

		for (Entry<RSFOLFormula, Set<RSFOLFormula>> e : map.entrySet()) {
			e.getValue().add(forallFormula);
		}

		map.put(forallFormula, new HashSet<>());

		return map;
	}

	@Override
	public Map<RSFOLFormula, Set<RSFOLFormula>> visit(NotFormula notFormula) {
		Map<RSFOLFormula, Set<RSFOLFormula>> map = new HashMap<>();
		map.putAll(notFormula.getSubformula().accept(this));

		for (Entry<RSFOLFormula, Set<RSFOLFormula>> e : map.entrySet()) {
			e.getValue().add(notFormula);
		}

		map.put(notFormula, new HashSet<>());

		return map;
	}

	@Override
	public Map<RSFOLFormula, Set<RSFOLFormula>> visit(BinaryFormula binaryFormula) {
		Map<RSFOLFormula, Set<RSFOLFormula>> map = new HashMap<>();
		map.putAll(binaryFormula.getSubformula1().accept(this));
		map.putAll(binaryFormula.getSubformula2().accept(this));

		for (Entry<RSFOLFormula, Set<RSFOLFormula>> e : map.entrySet()) {
			e.getValue().add(binaryFormula);
		}

		map.put(binaryFormula, new HashSet<>());

		return map;
	}

	@Override
	public Map<RSFOLFormula, Set<RSFOLFormula>> visit(SignalConstantComparison signalConstantComparison) {

		Map<RSFOLFormula, Set<RSFOLFormula>> map = new HashMap<>();
		map.putAll(signalConstantComparison.getSignal().accept(this));

		for (Entry<RSFOLFormula, Set<RSFOLFormula>> e : map.entrySet()) {
			e.getValue().add(signalConstantComparison);
		}

		map.put(signalConstantComparison, new HashSet<>());

		return map;

	}

	@Override
	public Map<RSFOLFormula, Set<RSFOLFormula>> visit(SignalComparison signalComparison) {

		Map<RSFOLFormula, Set<RSFOLFormula>> map = new HashMap<>();
		map.putAll(signalComparison.getSignal1().accept(this));
		map.putAll(signalComparison.getSignal2().accept(this));

		for (Entry<RSFOLFormula, Set<RSFOLFormula>> e : map.entrySet()) {
			e.getValue().add(signalComparison);
		}

		map.put(signalComparison, new HashSet<>());

		return map;
	}

	@Override
	public Map<RSFOLFormula, Set<RSFOLFormula>> visit(TimedTermExpression timedTermExpression) {
		Map<RSFOLFormula, Set<RSFOLFormula>> map = new HashMap<>();
		map.putAll(timedTermExpression.getTvariable().accept(this));

		for (Entry<RSFOLFormula, Set<RSFOLFormula>> e : map.entrySet()) {
			e.getValue().add(timedTermExpression);
		}

		map.put(timedTermExpression, new HashSet<>());

		return map;
	}

	@Override
	public Map<RSFOLFormula, Set<RSFOLFormula>> visit(TimedTermNumber timedTermNumber) {
		Map<RSFOLFormula, Set<RSFOLFormula>> map = new HashMap<>();
		map.put(timedTermNumber, new HashSet<>());

		return map;
	}

	@Override
	public Map<RSFOLFormula, Set<RSFOLFormula>> visit(Bound bound) {
		Map<RSFOLFormula, Set<RSFOLFormula>> map = new HashMap<>();
		map.putAll(bound.getLeftbound().accept(this));
		map.putAll(bound.getRightbound().accept(this));

		for (Entry<RSFOLFormula, Set<RSFOLFormula>> e : map.entrySet()) {
			e.getValue().add(bound);
		}

		map.put(bound, new HashSet<>());

		return map;
	}

	@Override
	public Map<RSFOLFormula, Set<RSFOLFormula>> visit(InfiniteTerm infiniteTerm) {
		Map<RSFOLFormula, Set<RSFOLFormula>> map = new HashMap<>();
		map.put(infiniteTerm, new HashSet<>());

		return map;
	}

	@Override
	public Map<RSFOLFormula, Set<RSFOLFormula>> visit(BinaryExpression binaryExpression) {
		Map<RSFOLFormula, Set<RSFOLFormula>> map = new HashMap<>();
		map.putAll(binaryExpression.getLeftExpression().accept(this));
		map.putAll(binaryExpression.getRightExpression().accept(this));

		map.get(binaryExpression.getLeftExpression()).add(binaryExpression);
		map.get(binaryExpression.getRightExpression()).add(binaryExpression);
		map.put(binaryExpression, new HashSet<>());

		return map;

	}

	@Override
	public Map<RSFOLFormula, Set<RSFOLFormula>> visit(AbsoluteExpression modulusExpression) {
		Map<RSFOLFormula, Set<RSFOLFormula>> map = new HashMap<>();
		map.putAll(modulusExpression.getSubformula().accept(this));
		map.get(modulusExpression.getSubformula()).add(modulusExpression);
		map.put(modulusExpression, new HashSet<>());

		return map;
	}

	@Override
	public Map<RSFOLFormula, Set<RSFOLFormula>> visit(NormExpression normExpression) {
		Map<RSFOLFormula, Set<RSFOLFormula>> map = new HashMap<>();
		map.put(normExpression, new HashSet<>());
		return map;
	}

	@Override
	public Map<RSFOLFormula, Set<RSFOLFormula>> visit(SinExpression sinExpression) {
		Map<RSFOLFormula, Set<RSFOLFormula>> map = new HashMap<>();
		map.put(sinExpression, new HashSet<>());
		return map;
	}

	@Override
	public Map<RSFOLFormula, Set<RSFOLFormula>> visit(CosExpression cosExpression) {
		Map<RSFOLFormula, Set<RSFOLFormula>> map = new HashMap<>();
		map.put(cosExpression, new HashSet<>());
		return map;
	}

	@Override
	public Map<RSFOLFormula, Set<RSFOLFormula>> visit(SQRTExpression sqrtExpression) {
		Map<RSFOLFormula, Set<RSFOLFormula>> map = new HashMap<>();
		map.put(sqrtExpression, new HashSet<>());
		return map;
	}

	@Override
	public Map<RSFOLFormula, Set<RSFOLFormula>> visit(SignalVector signalVector) {
		Map<RSFOLFormula, Set<RSFOLFormula>> map = new HashMap<>();
		map.put(signalVector, new HashSet<>());
		return map;
	}

	@Override
	public Map<RSFOLFormula, Set<RSFOLFormula>> visit(SignalMatrix signalMatrix) {
		Map<RSFOLFormula, Set<RSFOLFormula>> map = new HashMap<>();
		map.put(signalMatrix, new HashSet<>());
		return map;
	}

	@Override
	public Map<RSFOLFormula, Set<RSFOLFormula>> visit(ExpressionComparison expressionComparison) {
		Map<RSFOLFormula, Set<RSFOLFormula>> map = new HashMap<>();
		map.put(expressionComparison, new HashSet<>());
		return map;
	}

	@Override
	public Map<RSFOLFormula, Set<RSFOLFormula>> visit(Value value) {
		Map<RSFOLFormula, Set<RSFOLFormula>> map = new HashMap<>();
		map.put(value, new HashSet<>());
		return map;
	}

	@Override
	public Map<RSFOLFormula, Set<RSFOLFormula>> visit(SignedExpression signedExpression) {
		Map<RSFOLFormula, Set<RSFOLFormula>> map = new HashMap<>();
		map.put(signedExpression, new HashSet<>());
		return map;
	}

	@Override
	public Map<RSFOLFormula, Set<RSFOLFormula>> visit(ExistsFormula existsFormula) {
		Map<RSFOLFormula, Set<RSFOLFormula>> map = new HashMap<>();
		map.putAll(existsFormula.getBound().accept(this));
		map.putAll(existsFormula.getFormula().accept(this));

		for (Entry<RSFOLFormula, Set<RSFOLFormula>> e : map.entrySet()) {
			e.getValue().add(existsFormula);
		}

		map.put(existsFormula, new HashSet<>());

		return map;
	}

}
