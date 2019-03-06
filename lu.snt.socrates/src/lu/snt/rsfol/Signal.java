package lu.snt.rsfol;

import lu.snt.rsfol.expression.Expression;
import lu.snt.rsfol.formulae.RSFOLFormula;
import lu.snt.rsfol.timedterm.TimedTerm;
import lu.snt.rsfol.visitors.RSFOLVisitor;

public class Signal  implements Expression, RSFOLFormula{

	private SignalID signalID;
	private TimedTerm timedTerm;

	public Signal(SignalID signalID, TimedTerm timedTerm) {
		this.setSignalID(signalID);
		this.setTimedTerm(timedTerm);
	}

	public SignalID getSignalID() {
		return signalID;
	}

	public void setSignalID(SignalID signalID) {
		this.signalID = signalID;
	}

	public TimedTerm getTimedTerm() {
		return timedTerm;
	}

	public void setTimedTerm(TimedTerm timedTerm) {
		this.timedTerm = timedTerm;
	}

	public <S> S accept(RSFOLVisitor<S> v) {
		return v.visit(this);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((signalID == null) ? 0 : signalID.hashCode());
		result = prime * result + ((timedTerm == null) ? 0 : timedTerm.hashCode());
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
		Signal other = (Signal) obj;
		if (signalID == null) {
			if (other.signalID != null)
				return false;
		} else if (!signalID.equals(other.signalID))
			return false;
		if (timedTerm == null) {
			if (other.timedTerm != null)
				return false;
		} else if (!timedTerm.equals(other.timedTerm))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return signalID + "(" + timedTerm + ")";
	}

	@Override
	public float getMaximumAddedValue() {
		return timedTerm.getMaximumAddedValue();
	}

	@Override
	public RSFOLFormula pushNegations(boolean negate) {
		return this;
	}

	@Override
	public boolean refersToConstantInstant() {
		return this.timedTerm.refersToConstantInstant();
	}
	

}
