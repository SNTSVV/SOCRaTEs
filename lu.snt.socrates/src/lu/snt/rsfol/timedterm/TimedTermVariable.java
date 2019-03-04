package lu.snt.rsfol.timedterm;

import lu.snt.rsfol.Tvariable;
import lu.snt.rsfol.atoms.Value;
import lu.snt.rsfol.expression.ArithmeticOperator;

public class TimedTermVariable extends TimedTermExpression implements TimedTerm {

	public TimedTermVariable(Tvariable tvariable) {
		super(tvariable, ArithmeticOperator.PLUS, 
				new Value(0));
	}


}
