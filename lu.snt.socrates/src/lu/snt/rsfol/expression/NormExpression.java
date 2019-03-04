package lu.snt.rsfol.expression;

import lu.snt.rsfol.formulae.RSFOLFormula;
import lu.snt.rsfol.visitors.RSFOLVisitor;

public class NormExpression implements Expression {

	@Override
	public String toString() {
		return "||" + exp + "||";
	}

	private final Expression exp;

	public NormExpression(Expression exp) {

		this.exp = exp;
	}

	@Override
	public <S> S accept(RSFOLVisitor<S> v) {
		return v.visit(this);
	}

	public Expression getExp() {
		return exp;
	}

	public Expression getSubformula() {
		return exp;
	}
	@Override
	public float getMaximumAddedValue() {
		return exp.getMaximumAddedValue();
	}

	@Override
	public RSFOLFormula pushNegations(boolean negate) {
		return this;
	}

}
