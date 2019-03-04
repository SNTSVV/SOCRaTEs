package lu.snt.rsfol.formulae;

import com.google.common.base.Preconditions;

import lu.snt.rsfol.LOGICOP;
import lu.snt.rsfol.visitors.RSFOLVisitor;

public class BinaryFormula implements RSFOLFormula {

	private final RSFOLFormula subformula1;
	private final RSFOLFormula subformula2;
	private final LOGICOP op;

	@Override
	public String toString() {
		return "(" + subformula1.toString() + op + subformula2 + ")";
	}

	public BinaryFormula(RSFOLFormula subformula1, LOGICOP op, RSFOLFormula subformula2) {
		Preconditions.checkNotNull(subformula1, "The subformula1 cannot be null");
		Preconditions.checkNotNull(subformula2, "The subformula2 cannot be null");
		
		this.subformula1 = subformula1;
		this.subformula2 = subformula2;
		this.op = op;
	}

	@Override
	public <S> S accept(RSFOLVisitor<S> v) {
		return v.visit(this);
	}

	public RSFOLFormula getSubformula1() {
		return subformula1;
	}

	public RSFOLFormula getSubformula2() {
		return subformula2;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((subformula1 == null) ? 0 : subformula1.hashCode());
		result = prime * result + ((subformula2 == null) ? 0 : subformula2.hashCode());
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
		BinaryFormula other = (BinaryFormula) obj;
		if (subformula1 == null) {
			if (other.subformula1 != null)
				return false;
		} else if (!subformula1.equals(other.subformula1))
			return false;
		if (subformula2 == null) {
			if (other.subformula2 != null)
				return false;
		} else if (!subformula2.equals(other.subformula2))
			return false;
		return true;
	}

	public LOGICOP getOp() {
		return op;
	}

	@Override
	public RSFOLFormula pushNegations(boolean negate) {
		if(negate==false) {
			return this;
		}
		if(op.equals(LOGICOP.CONJ)) {
			return new BinaryFormula(subformula1.pushNegations(true), LOGICOP.DISJ, subformula2.pushNegations(true));
		}
		if(op.equals(LOGICOP.DISJ)) {
			return new BinaryFormula(subformula1.pushNegations(true), LOGICOP.CONJ, subformula2.pushNegations(true));
		}
		throw new IllegalArgumentException("Operation not supported");
	}

}
