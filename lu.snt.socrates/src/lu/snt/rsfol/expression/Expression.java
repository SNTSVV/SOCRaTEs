package lu.snt.rsfol.expression;

import lu.snt.rsfol.formulae.RSFOLFormula;

public interface Expression extends RSFOLFormula{

	public float getMaximumAddedValue();
	
	/**
	 * returns true if and only if the expression predicates on a signal whose time term is a constant 
	 * @return true if and only if the expression predicates on a signal whose time term is a constant 
	 */
	public boolean refersToConstantInstant();
}
