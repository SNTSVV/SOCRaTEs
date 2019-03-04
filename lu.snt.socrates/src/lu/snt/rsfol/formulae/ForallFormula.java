package lu.snt.rsfol.formulae;

import com.google.common.base.Preconditions;

import lu.snt.rsfol.visitors.RSFOLVisitor;

public class ForallFormula implements RSFOLFormula {

	private RSFOLFormula f;
	private Bound b;

	public ForallFormula(Bound b, RSFOLFormula f) {
		Preconditions.checkNotNull(f, "The subformula cannot be null");
		Preconditions.checkNotNull(b, "The bound cannot be null");

		this.f = f;
		this.b = b;
	}

	@Override
	public <S> S accept(RSFOLVisitor<S> v) {
		return v.visit(this);
	}

	public RSFOLFormula getFormula() {
		return f;
	}

	public Bound getBound() {
		return b;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((b == null) ? 0 : b.hashCode());
		result = prime * result + ((f == null) ? 0 : f.hashCode());
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
		ForallFormula other = (ForallFormula) obj;
		if (b == null) {
			if (other.b != null)
				return false;
		} else if (!b.equals(other.b))
			return false;
		if (f == null) {
			if (other.f != null)
				return false;
		} else if (!f.equals(other.f))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "("+b+"."+f+")";
	}

	@Override
	public RSFOLFormula pushNegations(boolean negate) {
		if(negate==false) {
			return this;
		}
		return new ExistsFormula(b, f.pushNegations(true));
	}

}
