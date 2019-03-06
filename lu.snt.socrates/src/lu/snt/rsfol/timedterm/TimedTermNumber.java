package lu.snt.rsfol.timedterm;

import lu.snt.rsfol.expression.ArithmeticOperator;
import lu.snt.rsfol.expression.Expression;
import lu.snt.rsfol.formulae.RSFOLFormula;
import lu.snt.rsfol.visitors.RSFOLVisitor;

public class TimedTermNumber implements TimedTerm {

	  final double THRESHOLD = .0001;
	  
	private float number;

	public TimedTermNumber(float number) {
		this.number = number;
	}

	@Override
	public <S> S accept(RSFOLVisitor<S> v) {
		return v.visit(this);
	}

	@Override
	public String toString() {
		return Float.toString(number);
	}

	public float getNumber() {
		return number;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.hashCode(number);
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
		TimedTermNumber other = (TimedTermNumber) obj;
		if (Math.abs(number - other.number) > THRESHOLD)
				
			return false;
		return true;
	}



	@Override
	public void compose(Expression value, ArithmeticOperator op) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float getMaximumAddedValue() {
		return this.number;
	}

	@Override
	public void shift(float value) {
		this.number=this.number+value;
		
	}

	@Override
	public RSFOLFormula pushNegations(boolean negate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean refersToConstantInstant() {
		return true;
	}

}
