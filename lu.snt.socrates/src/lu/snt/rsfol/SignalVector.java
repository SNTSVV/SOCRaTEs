package lu.snt.rsfol;

import lu.snt.rsfol.timedterm.TimedTerm;
import lu.snt.rsfol.visitors.RSFOLVisitor;

public class SignalVector extends Signal {

	
	private final int index;
	
	
	public SignalVector(SignalID signalID, TimedTerm timedTerm,int index) {
		super(signalID, timedTerm);
		this.index=index;
	}
	
	@Override
	public <S> S accept(RSFOLVisitor<S> v) {
		return v.visit(this);
	}

	


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + index;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		SignalVector other = (SignalVector) obj;
		if (index != other.index)
			return false;
		return true;
	}

	public int getIndex() {
		return index;
	}
	@Override
	public String toString() {
		return this.getSignalID() +"["+index+"]"+"(" + this.getTimedTerm() + ")";
	}
}
