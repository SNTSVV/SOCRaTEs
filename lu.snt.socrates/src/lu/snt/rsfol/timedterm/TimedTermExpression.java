package lu.snt.rsfol.timedterm;

import com.google.common.base.Preconditions;

import lu.snt.rsfol.Tvariable;
import lu.snt.rsfol.atoms.Value;
import lu.snt.rsfol.expression.ArithmeticOperator;
import lu.snt.rsfol.expression.Expression;
import lu.snt.rsfol.formulae.RSFOLFormula;
import lu.snt.rsfol.visitors.RSFOLVisitor;

public class TimedTermExpression implements TimedTerm {

	private final Tvariable tvariable;
	private ArithmeticOperator operator;
	private Value number;

	public void setOperator(ArithmeticOperator operator) {
		this.operator = operator;
	}

	public Value getValue() {
		return number;
	}

	public void setNumber(Value number) {
		this.number = number;
	}
	
	public void shift(float value) {
		this.number=new Value(number.getVal()+value);
	}

	public TimedTermExpression(Tvariable tvariable, ArithmeticOperator operator, Value f) {
		Preconditions.checkNotNull(operator, "The arithmetic operator cannot be null");
		this.number = f;
		this.tvariable = tvariable;
		this.operator = operator;
	}

	@Override
	public <S> S accept(RSFOLVisitor<S> v) {
		return v.visit(this);
	}

	public ArithmeticOperator getOperator() {
		return operator;
	}

	public Tvariable getTvariable() {
		return tvariable;
	}


	@Override
	public String toString() {
		return tvariable.toString() + operator + number;
	}

	

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		result = prime * result + ((operator == null) ? 0 : operator.hashCode());
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
		TimedTermExpression other = (TimedTermExpression) obj;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		if (operator != other.operator)
			return false;
		if (tvariable == null) {
			if (other.tvariable != null)
				return false;
		} else if (!tvariable.equals(other.tvariable))
			return false;
		return true;
	}

	@Override
	public void compose(Expression value, ArithmeticOperator op) {
		throw new IllegalArgumentException("Not implemented");
		
	}

	@Override
	public float getMaximumAddedValue() {
		return this.number.getMaximumAddedValue();
	}

	@Override
	public RSFOLFormula pushNegations(boolean negate) {
		// TODO Auto-generated method stub
		return null;
	}
}
