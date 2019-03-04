package lu.snt.rsfol.formulae;

import com.google.common.base.Preconditions;

import lu.snt.rsfol.visitors.RSFOLVisitor;

public class NotFormula implements RSFOLFormula {

	private final RSFOLFormula subformula;

	public NotFormula(RSFOLFormula subformula) {
		Preconditions.checkNotNull(subformula, "The subformula cannot be null");
		this.subformula = subformula;
	}

	@Override
	public <S> S accept(RSFOLVisitor<S> v) {
		return v.visit(this);
	}

	public RSFOLFormula getSubformula() {
		return subformula;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((subformula == null) ? 0 : subformula.hashCode());
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
		NotFormula other = (NotFormula) obj;
		if (subformula == null) {
			if (other.subformula != null)
				return false;
		} else if (!subformula.equals(other.subformula))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "("+"!" + subformula+")";
	}

	@Override
	public RSFOLFormula pushNegations(boolean negate) {
		if(negate) {
			return subformula;
		}
		else {
			return subformula.pushNegations(true);
		}
	}

}
