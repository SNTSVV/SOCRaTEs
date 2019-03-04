package lu.snt.rsfol;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.google.common.base.Preconditions;

import lu.snt.rsfol.atoms.ExpressionComparison;
import lu.snt.rsfol.atoms.Value;
import lu.snt.rsfol.expression.AbsoluteExpression;
import lu.snt.rsfol.expression.ArithmeticOperator;
import lu.snt.rsfol.expression.BinaryExpression;
import lu.snt.rsfol.expression.CosExpression;
import lu.snt.rsfol.expression.Expression;
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
import lu.snt.rsfol.timedterm.TimedTerm;
import lu.snt.rsfol.timedterm.TimedTermExpression;
import lu.snt.rsfol.timedterm.TimedTermNumber;
import lu.snt.rsfol.timedterm.TimedTermVariable;
import lu.snt.socrates.Oracle;

public class EObject2RSFOL {

	private final Map<String, Integer> mapConstantValue = new HashMap<>();

	public RSFOLFormula eObject2RSFOL(Oracle m) {

		eObject2RSFOL(m.getConstantDefinitions());

		return eObject2RSFOL(m.getRequirement().getFormula());

	}

	public void eObject2RSFOL(lu.snt.socrates.ConstantsDefinition definitions) {
		if (definitions != null) {
			for (lu.snt.socrates.ConstantDefinition def : definitions.getConstants()) {
				eObject2RSFOL(def);
			}
		}
	}

	public void eObject2RSFOL(lu.snt.socrates.ConstantDefinition definitions) {
		mapConstantValue.put(definitions.getConstantid().getName(), Integer.parseInt(definitions.getValue()));
	}

	public Bound eObject2RSFOL(lu.snt.socrates.boundterm e) {
		return new Bound(eObject2RSFOL(e.getRef()), eObject2RSFOL(e.getLeftbound()), eObject2RSFOL(e.getRightbound()),
				e.getL().equals("("), e.getR().equals(")"));
	}

	public RSFOLFormula eObject2RSFOL(lu.snt.socrates.basicformulae e) {

		if (e.getF() instanceof lu.snt.socrates.forAllformula) {
			return eObject2RSFOL((lu.snt.socrates.forAllformula) e.getF());
		}
		if (e.getF() instanceof lu.snt.socrates.existsformula) {
			return eObject2RSFOL((lu.snt.socrates.existsformula) e.getF());
		}
		if (e.getF() instanceof lu.snt.socrates.negationformula) {
			return eObject2RSFOL((lu.snt.socrates.negationformula) e.getF());
		}
		throw new IllegalArgumentException("No option available");

	}

	public RSFOLFormula eObject2RSFOL(lu.snt.socrates.formulab e) {
		RSFOLFormula exp1 = eObject2RSFOL(e.getA());

		if (e.getT() != null) {
			Entry<LOGICOP, RSFOLFormula> expression = eObject2RSFOL(e.getT());
			if (expression.getKey().equals(LOGICOP.IMPL)) {
				exp1 = new BinaryFormula(new NotFormula(exp1), LOGICOP.DISJ, expression.getValue());
			} else {
				if (expression.getKey().equals(LOGICOP.BICOND)) {
					exp1 = new BinaryFormula(new BinaryFormula(exp1, LOGICOP.CONJ, expression.getValue()), LOGICOP.DISJ,
							new BinaryFormula(new NotFormula(exp1), LOGICOP.CONJ,
									new NotFormula(expression.getValue())));
				} else {
					exp1 = new BinaryFormula(exp1, expression.getKey(), expression.getValue());
				}
			}
		}
		return exp1;

	}

	public RSFOLFormula eObject2RSFOL(lu.snt.socrates.term e) {
		RSFOLFormula exp1 = eObject2RSFOL(e.getA());

		if (e.getT() != null) {
			Entry<LOGICOP, RSFOLFormula> expression = eObject2RSFOL(e.getT());
			exp1 = new BinaryFormula(exp1, expression.getKey(), expression.getValue());
		}
		return exp1;
	}

	public Entry<LOGICOP, RSFOLFormula> eObject2RSFOL(lu.snt.socrates.formulabprime e) {
		RSFOLFormula exp1 = eObject2RSFOL(e.getT2());
		if (e.getF() != null) {

			Entry<LOGICOP, RSFOLFormula> expression = eObject2RSFOL(e.getF());
			if (expression.getKey().equals(LOGICOP.IMPL)) {
				exp1 = new BinaryFormula(new NotFormula(exp1), LOGICOP.DISJ, expression.getValue());
			} else {
				if (expression.getKey().equals(LOGICOP.BICOND)) {
					exp1 = new BinaryFormula(new BinaryFormula(exp1, LOGICOP.CONJ, expression.getValue()), LOGICOP.DISJ,
							new BinaryFormula(new NotFormula(exp1), LOGICOP.CONJ,
									new NotFormula(expression.getValue())));
				} else {
					exp1 = new BinaryFormula(exp1, expression.getKey(), expression.getValue());
				}
			}
		}
		return new AbstractMap.SimpleEntry<LOGICOP, RSFOLFormula>(LOGICOP.fromString(e.getOp()), exp1);
	}

	public Entry<LOGICOP, RSFOLFormula> eObject2RSFOL(lu.snt.socrates.termprime e) {
		RSFOLFormula exp1 = eObject2RSFOL(e.getT());
		if (e.getF1() != null) {
			Entry<LOGICOP, RSFOLFormula> expression = eObject2RSFOL(e.getF1());
			if (expression.getKey().equals(LOGICOP.IMPL)) {
				exp1 = new BinaryFormula(new NotFormula(exp1), LOGICOP.DISJ, expression.getValue());
			} else {
				if (expression.getKey().equals(LOGICOP.BICOND)) {
					exp1 = new BinaryFormula(new BinaryFormula(exp1, LOGICOP.CONJ, expression.getValue()), LOGICOP.DISJ,
							new BinaryFormula(new NotFormula(exp1), LOGICOP.CONJ,
									new NotFormula(expression.getValue())));
				} else {
					exp1 = new BinaryFormula(exp1, expression.getKey(), expression.getValue());
				}
			}

		}
		return new AbstractMap.SimpleEntry<LOGICOP, RSFOLFormula>(LOGICOP.fromString(e.getOp()), exp1);
	}

	public RSFOLFormula eObject2RSFOL(lu.snt.socrates.formula e) {

		Preconditions.checkNotNull(e, "The formula e cannot be null");

		if (e.getF() instanceof lu.snt.socrates.basicformulae) {
			return eObject2RSFOL((lu.snt.socrates.basicformulae) e.getF());
		}
		if (e.getF() instanceof lu.snt.socrates.formulab) {
			return eObject2RSFOL((lu.snt.socrates.formulab) e.getF());
		}

		throw new InternalError("No valid alternative for the subformula " + e.getF().getClass());
	}

	public RSFOLFormula eObject2RSFOL(lu.snt.socrates.forAllformula e) {
		return new ForallFormula(eObject2RSFOL(e.getBound()), eObject2RSFOL(e.getForallchild()));
	}

	public RSFOLFormula eObject2RSFOL(lu.snt.socrates.existsformula e) {
		return new ExistsFormula(eObject2RSFOL(e.getBound()), eObject2RSFOL(e.getExistschild()));
	}

	public RSFOLFormula eObject2RSFOL(lu.snt.socrates.negationformula e) {
		return new NotFormula(eObject2RSFOL(e.getNegationchild()));
	}

	public RSFOLFormula eObject2RSFOL(lu.snt.socrates.atom e) {
		if (e.getF() != null) {
			return eObject2RSFOL(e.getF());
		}

		if (e.getS1() != null && e.getS2() != null) {
			/*
			 * if (e.getOp().equals(RELOP.GE.toString())) { return new NotFormula( new
			 * ExpressionComparison(eObject2RSFOL(e.getS1()), RELOP.LEQ,
			 * eObject2RSFOL(e.getS2()))); } if (e.getOp().equals(RELOP.GEQ.toString())) {
			 * return new NotFormula( new ExpressionComparison(eObject2RSFOL(e.getS1()),
			 * RELOP.LE, eObject2RSFOL(e.getS2()))); } if
			 * (e.getOp().equals(RELOP.EQ.toString())) { return new BinaryFormula( new
			 * ExpressionComparison(eObject2RSFOL(e.getS1()), RELOP.LEQ, new
			 * BinaryExpression(eObject2RSFOL(e.getS2()), new Value(tollerance),
			 * ArithmeticOperator.PLUS) ), LOGICOP.CONJ, new
			 * ExpressionComparison(eObject2RSFOL(e.getS1()), RELOP.GEQ, new
			 * BinaryExpression(eObject2RSFOL(e.getS2()), new Value(-tollerance),
			 * ArithmeticOperator.PLUS ))); } if (e.getOp().equals(RELOP.NEQ.toString())) {
			 * return new NotFormula(new BinaryFormula( new
			 * ExpressionComparison(eObject2RSFOL(e.getS1()), RELOP.LEQ,
			 * eObject2RSFOL(e.getS2())), LOGICOP.CONJ, new NotFormula(new
			 * ExpressionComparison(eObject2RSFOL(e.getS1()), RELOP.LE,
			 * eObject2RSFOL(e.getS2()))))); }
			 */
			return new ExpressionComparison(eObject2RSFOL(e.getS1()), RELOP.fromString(e.getOp()),
					eObject2RSFOL(e.getS2()));
		}

		throw new InternalError("No valid alternative for the atom " + e.toString());
	}

	public TimedTerm eObject2RSFOL(lu.snt.socrates.timedterm e) {
		if (e.getInf() != null) {
			return new InfiniteTerm();
		}
		if (e.getNumber() != null) {
			return new TimedTermNumber(Integer.parseInt(e.getNumber()));
		}
		/*
		 * if (e.getRef2() != null) { return new
		 * TimedTermNumber(mapConstantValue.get(((lu.snt.socrates.ConstantId)
		 * e.getRef2()).getName()));
		 * 
		 * }
		 */
		if (e.getRef() != null) {
			// here
			if (e.getRef() instanceof lu.snt.socrates.ConstantId) {
				return new TimedTermNumber(mapConstantValue.get(((lu.snt.socrates.ConstantId) e.getRef()).getName()));
			} else {

				if (mapConstantValue.containsKey(((lu.snt.socrates.Tvariable) e.getRef()).getName())) {
					return new TimedTermNumber(
							mapConstantValue.get(((lu.snt.socrates.Tvariable) e.getRef()).getName()));
				}

				if (e.getValue() == null) {
					return new TimedTermVariable(eObject2RSFOL((lu.snt.socrates.Tvariable) e.getRef()));
				}

				if (!(eObject2RSFOL(e.getValue()) instanceof Value)) {
					throw new IllegalArgumentException("You can only put values in a timed term expression");
				}
				return new TimedTermExpression(eObject2RSFOL(((lu.snt.socrates.Tvariable) e.getRef())),
						ArithmeticOperator.fromString(e.getOp()),

						(Value) eObject2RSFOL(e.getValue()));

			}
		}

		throw new InternalError("No valid alternative for the timed term " + e.toString());
	}

	public Expression eObject2RSFOL(lu.snt.socrates.value e) {
		if (e.getFloat() != null) {
			return new Value(Float.parseFloat(e.getFloat()));
		}

		if (e.getRef() != null) {
			return new Value(mapConstantValue.get(((lu.snt.socrates.ConstantId) e.getRef()).getName()));
		}
		if (e.getNumber() != null) {
			return new Value(Integer.parseInt(e.getNumber()));
		}
		if (e.getExp() != null) {
			return eObject2RSFOL(e.getExp());
		}

		throw new IllegalArgumentException("No viable alternative to parse " + e.toString());
	}

	public Expression eObject2RSFOL(lu.snt.socrates.expression e) {
		// if (e.getBasicexpression() != null) {
		// return eObject2RSFOL(e.getBasicexpression());
		// } else {
		return eObject2RSFOL(e.getExpb());
		// }
	}

	public Entry<ArithmeticOperator, Expression> eObject2RSFOL(lu.snt.socrates.expressiontermprime e) {
		Expression exp1 = eObject2RSFOL(e.getT2());
		if (e.getF() != null) {
			Entry<ArithmeticOperator, Expression> expression = eObject2RSFOL(e.getF());
			exp1 = new BinaryExpression(exp1, expression.getValue(), expression.getKey());
		}
		return new AbstractMap.SimpleEntry<ArithmeticOperator, Expression>(ArithmeticOperator.fromString(e.getOp()),
				exp1);
	}

	public Expression eObject2RSFOL(lu.snt.socrates.expressionterm e) {

		Expression exp1 = null;
		if (e.getTerm() instanceof lu.snt.socrates.Basicexpression) {
			exp1 = eObject2RSFOL((lu.snt.socrates.Basicexpression) e.getTerm());
		} else {
			exp1 = eObject2RSFOL((lu.snt.socrates.ExpressionAtom) e.getTerm());
		}

		if (e.getExpprime() != null) {
			Entry<ArithmeticOperator, Expression> expression = eObject2RSFOL(e.getExpprime());
			exp1 = new BinaryExpression(exp1, expression.getValue(), expression.getKey());
		}
		return exp1;
	}

	public Expression eObject2RSFOL(lu.snt.socrates.ExpressionAtom e) {
		if (e.getOp() != null) {
			return new SignedExpression(eObject2RSFOL((lu.snt.socrates.expression) e.getExp()),
					ArithmeticOperator.fromString(e.getOp()));
		}
		if (e.getExp() instanceof lu.snt.socrates.value) {
			return eObject2RSFOL((lu.snt.socrates.value) e.getExp());
		}
		if (e.getExp() instanceof lu.snt.socrates.expression) {
			return eObject2RSFOL((lu.snt.socrates.expression) e.getExp());
		}
		if (e.getExp() instanceof lu.snt.socrates.Signal) {
			return eObject2RSFOL((lu.snt.socrates.Signal) e.getExp());
		}
		throw new IllegalArgumentException("No option available");
	}

	public Expression eObject2RSFOL(lu.snt.socrates.expressionb e) {
		Expression exp1 = eObject2RSFOL(e.getTerm());

		if (e.getExpprime() != null) {
			Entry<ArithmeticOperator, Expression> expression = eObject2RSFOL(e.getExpprime());
			exp1 = new BinaryExpression(exp1, expression.getValue(), expression.getKey());
		}
		return exp1;

	}

	public Entry<ArithmeticOperator, Expression> eObject2RSFOL(lu.snt.socrates.expressionprime e) {
		Expression exp1 = eObject2RSFOL(e.getT2());
		if (e.getF() != null) {
			Entry<ArithmeticOperator, Expression> expression = eObject2RSFOL(e.getF());
			exp1 = new BinaryExpression(exp1, expression.getValue(), expression.getKey());
		}
		return new AbstractMap.SimpleEntry<ArithmeticOperator, Expression>(ArithmeticOperator.fromString(e.getOp()),
				exp1);

	}

	/*
	 * public Expression eObject2RSFOL(lu.snt.socrates.Term e) { Expression exp =
	 * null; if (e.getExp() instanceof lu.snt.socrates.UnaryExpression) { exp =
	 * eObject2RSFOL((lu.snt.socrates.UnaryExpression) e.getExp()); } else { exp =
	 * eObject2RSFOL((lu.snt.socrates.Expression) e.getExp()); } Expression exp1 =
	 * null; if (e.getExp1() instanceof lu.snt.socrates.UnaryExpression) { exp1 =
	 * eObject2RSFOL((lu.snt.socrates.UnaryExpression) e.getExp1()); } else { if
	 * (e.getExp1() instanceof lu.snt.socrates.Term) { exp1 =
	 * eObject2RSFOL((lu.snt.socrates.Term) e.getExp1()); } else { exp1 =
	 * eObject2RSFOL((lu.snt.socrates.Expression) e.getExp1()); } } return new
	 * BinaryExpression(exp, exp1, ArithmeticOperator.fromString(e.getOp())); }
	 */

	public Expression eObject2RSFOL(lu.snt.socrates.Basicexpression e) {
		if (e.getExp() != null) {

			if (e.getExp() instanceof lu.snt.socrates.AbsEXP) {
				return eObject2RSFOL((lu.snt.socrates.AbsEXP) e.getExp());
			}
			if (e.getExp() instanceof lu.snt.socrates.Normexp) {
				return eObject2RSFOL((lu.snt.socrates.Normexp) e.getExp());
			}
			if (e.getExp() instanceof lu.snt.socrates.Sin) {
				return eObject2RSFOL((lu.snt.socrates.Sin) e.getExp());
			}
			if (e.getExp() instanceof lu.snt.socrates.Cos) {
				return eObject2RSFOL((lu.snt.socrates.Cos) e.getExp());
			}
			if (e.getExp() instanceof lu.snt.socrates.Sqrt) {
				return eObject2RSFOL((lu.snt.socrates.Sqrt) e.getExp());
			}

		}
		throw new IllegalArgumentException("No option available");
	}

	public Expression eObject2RSFOL(lu.snt.socrates.AbsEXP e) {
		return new AbsoluteExpression(eObject2RSFOL(e.getExp1()));
	}

	public Expression eObject2RSFOL(lu.snt.socrates.Normexp e) {
		return new NormExpression(eObject2RSFOL(e.getExp1()));
	}

	public Expression eObject2RSFOL(lu.snt.socrates.Sin e) {
		return new SinExpression(eObject2RSFOL(e.getExp1()));
	}

	public Expression eObject2RSFOL(lu.snt.socrates.Cos e) {
		return new CosExpression(eObject2RSFOL(e.getExp1()));
	}

	public Expression eObject2RSFOL(lu.snt.socrates.Sqrt e) {
		return new SQRTExpression(eObject2RSFOL(e.getExp1()));
	}

	public Signal eObject2RSFOL(lu.snt.socrates.Signal s) {
		if (s.getIndx1() != null && s.getIndx2() != null) {
			return new SignalMatrix(eObject2RSFOL(s.getSignalid()), eObject2RSFOL(s.getTimdedterm()),
					Integer.parseInt(s.getIndx1()), Integer.parseInt(s.getIndx2()));

		}
		if (s.getIndx1() != null) {
			return new SignalVector(eObject2RSFOL(s.getSignalid()), eObject2RSFOL(s.getTimdedterm()),
					Integer.parseInt(s.getIndx1()));
		}

		return new Signal(eObject2RSFOL(s.getSignalid()), eObject2RSFOL(s.getTimdedterm()));
	}

	public SignalID eObject2RSFOL(lu.snt.socrates.SignalID e) {
		return new SignalID(e.getName());
	}

	public Tvariable eObject2RSFOL(lu.snt.socrates.Tvariable e) {
		return new Tvariable(e.getName());
	}

}
