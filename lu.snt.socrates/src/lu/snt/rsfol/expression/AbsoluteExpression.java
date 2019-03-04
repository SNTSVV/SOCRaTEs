package lu.snt.rsfol.expression;

import lu.snt.rsfol.formulae.RSFOLFormula;
import lu.snt.rsfol.visitors.RSFOLVisitor;

public class AbsoluteExpression implements Expression {

	private final Expression exp;
	
	public AbsoluteExpression(Expression exp) {
		
		this.exp=exp;
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((exp == null) ? 0 : exp.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AbsoluteExpression other = (AbsoluteExpression) obj;
		if (exp == null) {
			if (other.exp != null)
				return false;
		} else if (!exp.equals(other.exp))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "|" + exp + "|";
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
