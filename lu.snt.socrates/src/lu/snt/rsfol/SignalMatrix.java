package lu.snt.rsfol;

import lu.snt.rsfol.timedterm.TimedTerm;
import lu.snt.rsfol.visitors.RSFOLVisitor;

public class SignalMatrix extends Signal {

	
	private final int index1;
	
	private final int index2;
	
	
	public SignalMatrix(SignalID signalID, TimedTerm timedTerm,int index1, int index2) {
		super(signalID, timedTerm);
		this.index1=index1;
		this.index2=index2;
	}
	
	
	@Override
	public <S> S accept(RSFOLVisitor<S> v) {
		return v.visit(this);
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + index1;
		result = prime * result + index2;
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
		SignalMatrix other = (SignalMatrix) obj;
		if (index1 != other.index1)
			return false;
		if (index2 != other.index2)
			return false;
		return true;
	}


	public int getIndex1() {
		return index1;
	}

	public int getIndex2() {
		return index2;
	}

	@Override
	public String toString() {
		return this.getSignalID() +"["+index1+"]"+"["+index2+"]"+"(" + this.getTimedTerm() + ")";
	}
	

}
