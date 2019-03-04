package lu.snt.rsfol.timedterm;

import lu.snt.rsfol.expression.ArithmeticOperator;
import lu.snt.rsfol.expression.Expression;
import lu.snt.rsfol.formulae.RSFOLFormula;
import lu.snt.rsfol.visitors.RSFOLVisitor;

public interface TimedTerm extends RSFOLFormula {

	public <S> S accept(RSFOLVisitor<S> v);
	
	public void compose(Expression value, ArithmeticOperator op);
	
	public float getMaximumAddedValue();
	
	public void shift(float value);
}
