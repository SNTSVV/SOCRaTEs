package lu.snt.rsfol.formulae;

import lu.snt.rsfol.Tvariable;
import lu.snt.rsfol.timedterm.TimedTerm;
import lu.snt.rsfol.visitors.RSFOLVisitor;

public class Bound implements RSFOLFormula {
	private TimedTerm leftbound;
	private TimedTerm rightbound;

	private Tvariable tvariable;

	private final boolean lopen;
	private final boolean ropen;
	public Bound(Tvariable tvariable, TimedTerm leftbound, TimedTerm rightbound, boolean lopen, boolean ropen) {
		this.setTvariable(tvariable);
		this.setLeftbound(leftbound);
		this.setRightbound(rightbound);
		this.lopen=lopen;
		this.ropen=ropen;
	}

	public TimedTerm getLeftbound() {
		return leftbound;
	}

	public void setLeftbound(TimedTerm leftbound) {
		this.leftbound = leftbound;
	}

	public TimedTerm getRightbound() {
		return rightbound;
	}

	public void setRightbound(TimedTerm rightbound) {
		this.rightbound = rightbound;
	}

	public Tvariable getTvariable() {
		return tvariable;
	}

	public void setTvariable(Tvariable tvariable) {
		this.tvariable = tvariable;
	}

	@Override
	public <S> S accept(RSFOLVisitor<S> v) {
		return v.visit(this);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((leftbound == null) ? 0 : leftbound.hashCode());
		result = prime * result + ((rightbound == null) ? 0 : rightbound.hashCode());
		result = prime * result + ((tvariable == null) ? 0 : tvariable.hashCode());
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
		Bound other = (Bound) obj;
		if (leftbound == null) {
			if (other.leftbound != null)
				return false;
		} else if (!leftbound.equals(other.leftbound))
			return false;
		if (rightbound == null) {
			if (other.rightbound != null)
				return false;
		} else if (!rightbound.equals(other.rightbound))
			return false;
		if (tvariable == null) {
			if (other.tvariable != null)
				return false;
		} else if (!tvariable.equals(other.tvariable))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "for all "+tvariable + ":" + (lopen ? "(" : "[") + leftbound + "," + rightbound + (ropen ? ")" : "]");
	}

	public boolean isLopen() {
		return lopen;
	}

	public boolean isRopen() {
		return ropen;
	}

	@Override
	public RSFOLFormula pushNegations(boolean negate) {
		return this;
	}

}
