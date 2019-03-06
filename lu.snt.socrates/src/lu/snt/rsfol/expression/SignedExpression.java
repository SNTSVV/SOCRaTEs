package lu.snt.rsfol.expression;

import lu.snt.rsfol.formulae.RSFOLFormula;
import lu.snt.rsfol.visitors.RSFOLVisitor;

public class SignedExpression implements Expression {

	public ArithmeticOperator getOp() {
		return op;
	}

	public void setOp(ArithmeticOperator op) {
		this.op = op;
	}

	public Expression getExp() {
		return exp;
	}

	private ArithmeticOperator op;
	
	

	private final Expression exp;

	public SignedExpression(Expression exp, ArithmeticOperator op) {
		this.op=op;
		this.exp = exp;
	}
	
	@Override
	public <S> S accept(RSFOLVisitor<S> v) {
		return v.visit(this);
	}

	@Override
	public String toString() {
		return  op .toString()+ exp.toString();
	}
	
	@Override
	public int hashCode() {
		if(op.equals(ArithmeticOperator.PLUS)) {
			return exp.hashCode();
		}
		final int prime = 31;
		int result = 1;
		result = prime * result + ((exp == null) ? 0 : exp.hashCode());
		result = prime * result + ((op == null) ? 0 : op.hashCode());
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
		SignedExpression other = (SignedExpression) obj;
		if (exp == null) {
			if (other.exp != null)
				return false;
		} else if (!exp.equals(other.exp))
			return false;
		if (op != other.op)
			return false;
		return true;
	}

	@Override
	public float getMaximumAddedValue() {
		return exp.getMaximumAddedValue();
	}

	@Override
	public RSFOLFormula pushNegations(boolean negate) {
		return this;
	}
	@Override
	public boolean refersToConstantInstant() {
		return this.exp.refersToConstantInstant();
	}
}
