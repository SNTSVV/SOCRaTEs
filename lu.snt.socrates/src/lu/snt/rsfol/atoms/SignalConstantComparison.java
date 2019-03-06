package lu.snt.rsfol.atoms;

import lu.snt.rsfol.RELOP;
import lu.snt.rsfol.expression.Expression;
import lu.snt.rsfol.formulae.RSFOLFormula;
import lu.snt.rsfol.visitors.RSFOLVisitor;

public class SignalConstantComparison  implements Atom {

	private final Expression signal;

	@Override
	public String toString() {
		return "("+signal.toString() + op.toString() + value+")";
	}

	private final RELOP op;

	private final Value value;

	public SignalConstantComparison(Expression signal, RELOP op, Value value) {
		this.signal = signal;
		this.value = value;
		this.op = op;
	}

	@Override
	public <S> S accept(RSFOLVisitor<S> v) {
		return v.visit(this);
	}

	public Expression getSignal() {
		return signal;
	}

	public Value getValue() {
		return value;
	}



	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((op == null) ? 0 : op.hashCode());
		result = prime * result + ((signal == null) ? 0 : signal.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
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
		SignalConstantComparison other = (SignalConstantComparison) obj;
		if (op != other.op)
			return false;
		if (signal == null) {
			if (other.signal != null)
				return false;
		} else if (!signal.equals(other.signal))
			return false;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}

	public RELOP getOp() {
		return op;
	}

	@Override
	public RSFOLFormula pushNegations(boolean negate) {
		if(negate==false) {
			return this;
		}
		if(op==RELOP.EQ) {
			return new ExpressionComparison(signal, RELOP.NEQ, value);
		}
		if(op==RELOP.GE) {
			return new ExpressionComparison(signal, RELOP.LEQ, value);
		}
		if(op==RELOP.GEQ) {
			return new ExpressionComparison(signal, RELOP.LE, value);
		}
		if(op==RELOP.LE) {
			return new ExpressionComparison(signal, RELOP.GEQ, value);
		}
		if(op==RELOP.LEQ) {
			return new ExpressionComparison(signal, RELOP.GE, value);
		}
		if(op==RELOP.NEQ) {
			return new ExpressionComparison(signal, RELOP.EQ, value);
		}
		throw new IllegalArgumentException("Operation not supported");
	}

	@Override
	public boolean refersToConstantInstant() {
		return signal.refersToConstantInstant();
	}

}
