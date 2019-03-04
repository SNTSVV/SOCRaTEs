package lu.snt.rsfol.shifting.timeshifting;

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

public class GetFormulaeWithT implements RSFOLVisitor<Map<Tvariable, Set<RSFOLFormula>>> {

	@Override
	public Map<Tvariable, Set<RSFOLFormula>> visit(SignalID signal) {
		return new HashMap<>();
	}



	@Override
	public Map<Tvariable, Set<RSFOLFormula>> visit(Tvariable tvariable) {
		return new HashMap<>();

	}

	@Override
	public Map<Tvariable, Set<RSFOLFormula>> visit(Signal signal) {
		return signal.getTimedTerm().accept(this);
	}

	@Override
	public Map<Tvariable, Set<RSFOLFormula>> visit(ForallFormula forallFormula) {
		HashMap<Tvariable, Set<RSFOLFormula>> mp = new HashMap<>();
		for (Entry<Tvariable, Set<RSFOLFormula>> e : forallFormula.getBound().accept(this).entrySet()) {
			if (!mp.containsKey(e.getKey())) {
				mp.put(e.getKey(), new HashSet<>());
			}
			mp.get(e.getKey()).addAll(e.getValue());
		}

		for (Entry<Tvariable, Set<RSFOLFormula>> e : forallFormula.getFormula().accept(this).entrySet()) {
			if (!mp.containsKey(e.getKey())) {
				mp.put(e.getKey(), new HashSet<>());
			}
			mp.get(e.getKey()).addAll(e.getValue());
		}

		return mp;
	}


	@Override
	public Map<Tvariable, Set<RSFOLFormula>> visit(NotFormula notFormula) {
		return notFormula.getSubformula().accept(this);
	}

	@Override
	public Map<Tvariable, Set<RSFOLFormula>> visit(BinaryFormula binaryFormula) {
		HashMap<Tvariable, Set<RSFOLFormula>> mp = new HashMap<>();

		for (Entry<Tvariable, Set<RSFOLFormula>> e : binaryFormula.getSubformula1().accept(this).entrySet()) {
			if (!mp.containsKey(e.getKey())) {
				mp.put(e.getKey(), new HashSet<>());
			}
			mp.get(e.getKey()).addAll(e.getValue());
		}

		for (Entry<Tvariable, Set<RSFOLFormula>> e : binaryFormula.getSubformula2().accept(this).entrySet()) {
			if (!mp.containsKey(e.getKey())) {
				mp.put(e.getKey(), new HashSet<>());
			}
			mp.get(e.getKey()).addAll(e.getValue());
		}

		return mp;
	}

	@Override
	public Map<Tvariable, Set<RSFOLFormula>> visit(SignalConstantComparison signalConstantComparison) {
		return signalConstantComparison.getSignal().accept(this);
	}

	@Override
	public Map<Tvariable, Set<RSFOLFormula>> visit(SignalComparison signalComparison) {

		HashMap<Tvariable, Set<RSFOLFormula>> mp = new HashMap<>();

		for (Entry<Tvariable, Set<RSFOLFormula>> e : signalComparison.getSignal1().accept(this).entrySet()) {
			if (!mp.containsKey(e.getKey())) {
				mp.put(e.getKey(), new HashSet<>());
			}
			mp.get(e.getKey()).addAll(e.getValue());
		}

		for (Entry<Tvariable, Set<RSFOLFormula>> e : signalComparison.getSignal2().accept(this).entrySet()) {
			if (!mp.containsKey(e.getKey())) {
				mp.put(e.getKey(), new HashSet<>());
			}
			mp.get(e.getKey()).addAll(e.getValue());
		}

		return mp;
	}

	@Override
	public Map<Tvariable, Set<RSFOLFormula>> visit(TimedTermExpression timedTermExpression) {
		HashMap<Tvariable, Set<RSFOLFormula>> mp = new HashMap<>();
		mp.put(timedTermExpression.getTvariable(), new HashSet<>());
		mp.get(timedTermExpression.getTvariable()).add(timedTermExpression);
		return mp;
	}

	@Override
	public Map<Tvariable, Set<RSFOLFormula>> visit(TimedTermNumber timedTermNumber) {
		return new HashMap<>();
	}

	@Override
	public Map<Tvariable, Set<RSFOLFormula>> visit(Bound bound) {
		HashMap<Tvariable, Set<RSFOLFormula>> mp = new HashMap<>();
		mp.put(bound.getTvariable(), new HashSet<>());
		mp.get(bound.getTvariable()).add(bound);

		return mp;
	}



	@Override
	public Map<Tvariable, Set<RSFOLFormula>> visit(InfiniteTerm infiniteTerm) {
		return new HashMap<>();
	}



	@Override
	public Map<Tvariable, Set<RSFOLFormula>> visit(BinaryExpression binaryExpression) {
		HashMap<Tvariable, Set<RSFOLFormula>> mp = new HashMap<>();

		for (Entry<Tvariable, Set<RSFOLFormula>> e : binaryExpression.getLeftExpression().accept(this).entrySet()) {
			if (!mp.containsKey(e.getKey())) {
				mp.put(e.getKey(), new HashSet<>());
			}
			mp.get(e.getKey()).addAll(e.getValue());
		}

		for (Entry<Tvariable, Set<RSFOLFormula>> e : binaryExpression.getRightExpression().accept(this).entrySet()) {
			if (!mp.containsKey(e.getKey())) {
				mp.put(e.getKey(), new HashSet<>());
			}
			mp.get(e.getKey()).addAll(e.getValue());
		}

		return mp;
	}



	@Override
	public Map<Tvariable, Set<RSFOLFormula>> visit(AbsoluteExpression modulusExpression) {
		return modulusExpression.getSubformula().accept(this);
	}



	@Override
	public Map<Tvariable, Set<RSFOLFormula>> visit(NormExpression normExpression) {
		return normExpression.getSubformula().accept(this);
	}

	@Override
	public Map<Tvariable, Set<RSFOLFormula>> visit(SinExpression sinExpression) {
		return sinExpression.getSubformula().accept(this);
	}



	@Override
	public Map<Tvariable, Set<RSFOLFormula>> visit(CosExpression cosExpression) {
		return cosExpression.getSubformula().accept(this);
	}

	@Override
	public Map<Tvariable, Set<RSFOLFormula>> visit(SQRTExpression sqrtExpression) {
		return sqrtExpression.getSubformula().accept(this);
	}



	@Override
	public Map<Tvariable, Set<RSFOLFormula>> visit(SignalVector signalVector) {
		return signalVector.getTimedTerm().accept(this);
	}



	@Override
	public Map<Tvariable, Set<RSFOLFormula>> visit(SignalMatrix signalMatrix) {
		return signalMatrix.getTimedTerm().accept(this);
	}



	@Override
	public Map<Tvariable, Set<RSFOLFormula>> visit(ExpressionComparison expressionComparison) {
		HashMap<Tvariable, Set<RSFOLFormula>> mp = new HashMap<>();

		for (Entry<Tvariable, Set<RSFOLFormula>> e : expressionComparison.getExpression1().accept(this).entrySet()) {
			if (!mp.containsKey(e.getKey())) {
				mp.put(e.getKey(), new HashSet<>());
			}
			mp.get(e.getKey()).addAll(e.getValue());
		}

		for (Entry<Tvariable, Set<RSFOLFormula>> e : expressionComparison.getExpression2().accept(this).entrySet()) {
			if (!mp.containsKey(e.getKey())) {
				mp.put(e.getKey(), new HashSet<>());
			}
			mp.get(e.getKey()).addAll(e.getValue());
		}

		return mp;
	}



	@Override
	public Map<Tvariable, Set<RSFOLFormula>> visit(Value value) {
		return  new HashMap<>();
	}



	@Override
	public Map<Tvariable, Set<RSFOLFormula>> visit(SignedExpression signedExpression) {
		return signedExpression.getExp().accept(this);
	}



	@Override
	public Map<Tvariable, Set<RSFOLFormula>> visit(ExistsFormula existsFormula) {
		HashMap<Tvariable, Set<RSFOLFormula>> mp = new HashMap<>();
		for (Entry<Tvariable, Set<RSFOLFormula>> e : existsFormula.getBound().accept(this).entrySet()) {
			if (!mp.containsKey(e.getKey())) {
				mp.put(e.getKey(), new HashSet<>());
			}
			mp.get(e.getKey()).addAll(e.getValue());
		}

		for (Entry<Tvariable, Set<RSFOLFormula>> e : existsFormula.getFormula().accept(this).entrySet()) {
			if (!mp.containsKey(e.getKey())) {
				mp.put(e.getKey(), new HashSet<>());
			}
			mp.get(e.getKey()).addAll(e.getValue());
		}

		return mp;
	}
}
