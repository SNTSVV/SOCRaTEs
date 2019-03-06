package lu.snt.rsfol.expression;

import lu.snt.rsfol.formulae.RSFOLFormula;
import lu.snt.rsfol.visitors.RSFOLVisitor;

public class BinaryExpression implements Expression{

	@Override
	public String toString() {
		return "(" + leftExpression + ")"+op+"(" + rightExpression + ")";
	}

	private Expression leftExpression;
	private Expression rightExpression;
	private ArithmeticOperator op;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((leftExpression == null) ? 0 : leftExpression.hashCode());
		result = prime * result + ((op == null) ? 0 : op.hashCode());
		result = prime * result + ((rightExpression == null) ? 0 : rightExpression.hashCode());
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
		BinaryExpression other = (BinaryExpression) obj;
		if (leftExpression == null) {
			if (other.leftExpression != null)
				return false;
		} else if (!leftExpression.equals(other.leftExpression))
			return false;
		if (op != other.op)
			return false;
		if (rightExpression == null) {
			if (other.rightExpression != null)
				return false;
		} else if (!rightExpression.equals(other.rightExpression))
			return false;
		return true;
	}

	public Expression getLeftExpression() {
		return leftExpression;
	}

	public void setLeftExpression(BinaryExpression leftExpression) {
		this.leftExpression = leftExpression;
	}

	public Expression getRightExpression() {
		return rightExpression;
	}

	public void setRightExpression(BinaryExpression rightExpression) {
		this.rightExpression = rightExpression;
	}

	public ArithmeticOperator getOp() {
		return op;
	}

	public void setOp(ArithmeticOperator op) {
		this.op = op;
	}

	public BinaryExpression(Expression leftExpression, Expression rightExpression, ArithmeticOperator op) {
		super();
		this.leftExpression = leftExpression;
		this.rightExpression = rightExpression;
		this.op = op;
	}

	@Override
	public <S> S accept(RSFOLVisitor<S> v) {
		return v.visit(this);
	}

	@Override
	public float getMaximumAddedValue() {
		return Math.max(leftExpression.getMaximumAddedValue(), 
				(this.op.equals(ArithmeticOperator.MINUS)) ?
				-rightExpression.getMaximumAddedValue() : 
					rightExpression.getMaximumAddedValue()
				);
	}

	@Override
	public RSFOLFormula pushNegations(boolean negate) {
		return this;
	}

	@Override
	public boolean refersToConstantInstant() {
		return leftExpression.refersToConstantInstant() || rightExpression.refersToConstantInstant();
	}
}
