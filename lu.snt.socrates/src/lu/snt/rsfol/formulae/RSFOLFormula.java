package lu.snt.rsfol.formulae;

import lu.snt.rsfol.visitors.RSFOLVisitor;

public interface RSFOLFormula {
	public <S> S accept(RSFOLVisitor<S> v);
	
	public RSFOLFormula pushNegations(boolean negate);

}
