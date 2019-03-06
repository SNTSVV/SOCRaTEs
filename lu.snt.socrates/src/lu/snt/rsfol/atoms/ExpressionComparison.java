package lu.snt.rsfol.atoms;

import com.google.common.base.Preconditions;

import lu.snt.rsfol.RELOP;
import lu.snt.rsfol.expression.Expression;
import lu.snt.rsfol.formulae.RSFOLFormula;
import lu.snt.rsfol.visitors.RSFOLVisitor;

public class ExpressionComparison implements Atom{

	private final Expression expression1;
	private final Expression expression2;

	private final RELOP op;

	public ExpressionComparison(Expression expression1, RELOP op, Expression expression2) {
		Preconditions.checkNotNull(expression1, "Expression 1 cannot be null");
		Preconditions.checkNotNull(expression2, "Expression 2 cannot be null");
		this.expression1 = expression1;
		this.expression2 = expression2;
		this.op = op;
	}
	
	@Override
	public <S> S accept(RSFOLVisitor<S> v) {
		return v.visit(this);
	}
	
	public Expression getExpression1() {
		return expression1;
	}

	public Expression getExpression2() {
		return expression2;
	}

	public RELOP getOp() {
		return op;
	}
	
	@Override
	public String toString() {
		return "(" + expression1.toString() + op.toString() + expression2.toString() + ")";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((expression1 == null) ? 0 : expression1.hashCode());
		result = prime * result + ((expression2 == null) ? 0 : expression2.hashCode());
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
		ExpressionComparison other = (ExpressionComparison) obj;
		if (expression1 == null) {
			if (other.expression1 != null)
				return false;
		} else if (!expression1.equals(other.expression1))
			return false;
		if (expression2 == null) {
			if (other.expression2 != null)
				return false;
		} else if (!expression2.equals(other.expression2))
			return false;
		if (op != other.op)
			return false;
		return true;
	}

	@Override
	public RSFOLFormula pushNegations(boolean negate) {
		if(negate==false) {
			return this;
		}
		if(op==RELOP.EQ) {
			return new ExpressionComparison(expression1, RELOP.NEQ, expression2);
		}
		if(op==RELOP.GE) {
			return new ExpressionComparison(expression1, RELOP.LEQ, expression2);
		}
		if(op==RELOP.GEQ) {
			return new ExpressionComparison(expression1, RELOP.LE, expression2);
		}
		if(op==RELOP.LE) {
			return new ExpressionComparison(expression1, RELOP.GEQ, expression2);
		}
		if(op==RELOP.LEQ) {
			return new ExpressionComparison(expression1, RELOP.GE, expression2);
		}
		if(op==RELOP.NEQ) {
			return new ExpressionComparison(expression1, RELOP.EQ, expression2);
		}
		throw new IllegalArgumentException("Operation not supported");
	
	}

	@Override
	public boolean refersToConstantInstant() {
		return expression1.refersToConstantInstant() || expression2.refersToConstantInstant();
	}

	

	
}
