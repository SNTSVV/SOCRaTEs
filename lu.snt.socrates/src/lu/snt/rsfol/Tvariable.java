package lu.snt.rsfol;

import lu.snt.rsfol.formulae.RSFOLFormula;
import lu.snt.rsfol.visitors.RSFOLVisitor;

public class Tvariable implements RSFOLFormula {

	private final String name;

	public Tvariable(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public <S> S accept(RSFOLVisitor<S> v) {
		return v.visit(this);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Tvariable other = (Tvariable) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return name;
	}

	@Override
	public RSFOLFormula pushNegations(boolean negate) {
		return this;
	}

}
