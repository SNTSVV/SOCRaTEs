package lu.snt.rsfol.atoms;

import lu.snt.rsfol.RELOP;
import lu.snt.rsfol.Signal;
import lu.snt.rsfol.formulae.RSFOLFormula;
import lu.snt.rsfol.visitors.RSFOLVisitor;

public class SignalComparison implements Atom {

	private final Signal signal1;

	private final RELOP op;
	private final Signal signal2;

	public SignalComparison(Signal signal1, RELOP op, Signal signal2) {
		this.signal1 = signal1;
		this.signal2 = signal2;
		this.op = op;
	}

	@Override
	public String toString() {
		return "SignalComparison [signal1=" + signal1 + ", op=" + op + ", signal2=" + signal2 + "]";
	}

	@Override
	public <S> S accept(RSFOLVisitor<S> v) {
		return v.visit(this);
	}

	public Signal getSignal2() {
		return signal2;
	}

	public Signal getSignal1() {
		return signal1;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((op == null) ? 0 : op.hashCode());
		result = prime * result + ((signal1 == null) ? 0 : signal1.hashCode());
		result = prime * result + ((signal2 == null) ? 0 : signal2.hashCode());
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
		SignalComparison other = (SignalComparison) obj;
		if (op != other.op)
			return false;
		if (signal1 == null) {
			if (other.signal1 != null)
				return false;
		} else if (!signal1.equals(other.signal1))
			return false;
		if (signal2 == null) {
			if (other.signal2 != null)
				return false;
		} else if (!signal2.equals(other.signal2))
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
			return new ExpressionComparison(signal1, RELOP.NEQ, signal2);
		}
		if(op==RELOP.GE) {
			return new ExpressionComparison(signal1, RELOP.LEQ, signal2);
		}
		if(op==RELOP.GEQ) {
			return new ExpressionComparison(signal1, RELOP.LE, signal2);
		}
		if(op==RELOP.LE) {
			return new ExpressionComparison(signal1, RELOP.GEQ, signal2);
		}
		if(op==RELOP.LEQ) {
			return new ExpressionComparison(signal1, RELOP.GE, signal2);
		}
		if(op==RELOP.NEQ) {
			return new ExpressionComparison(signal1, RELOP.EQ, signal2);
		}
		throw new IllegalArgumentException("Operation not supported");
	}

}
