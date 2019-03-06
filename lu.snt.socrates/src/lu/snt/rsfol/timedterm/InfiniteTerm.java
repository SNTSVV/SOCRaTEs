package lu.snt.rsfol.timedterm;

import lu.snt.rsfol.expression.ArithmeticOperator;
import lu.snt.rsfol.expression.Expression;
import lu.snt.rsfol.formulae.RSFOLFormula;
import lu.snt.rsfol.visitors.RSFOLVisitor;

public class InfiniteTerm implements TimedTerm {

	private final String infiniteTerm="inf";
	
	private int value=-1;
	
	private float shiftedValue=0;
	
	public float getShiftedValue() {
		return shiftedValue;
	}

	@Override
	public String toString() {
		return infiniteTerm+ ((shiftedValue!=0) ? "+"+shiftedValue : "");
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((infiniteTerm == null) ? 0 : infiniteTerm.hashCode());
		result = prime * result + Float.floatToIntBits(shiftedValue);
		result = prime * result + value;
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
		InfiniteTerm other = (InfiniteTerm) obj;
		if (infiniteTerm == null) {
			if (other.infiniteTerm != null)
				return false;
		} else if (!infiniteTerm.equals(other.infiniteTerm))
			return false;
		if (Float.floatToIntBits(shiftedValue) != Float.floatToIntBits(other.shiftedValue))
			return false;
		if (value != other.value)
			return false;
		return true;
	}

	@Override
	public <S> S accept(RSFOLVisitor<S> v) {
		return v.visit(this);
	}

	
	@Override
	public void compose(Expression value, ArithmeticOperator op) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float getMaximumAddedValue() {
		return value;
	}

	@Override
	public void shift(float value) {
		shiftedValue=shiftedValue+value;
		
	}

	@Override
	public RSFOLFormula pushNegations(boolean negate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean refersToConstantInstant() {
		return false;
	}

}
