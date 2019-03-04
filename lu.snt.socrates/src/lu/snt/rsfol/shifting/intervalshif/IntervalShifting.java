package lu.snt.rsfol.shifting.intervalshif;

import lu.snt.rsfol.formulae.RSFOLFormula;

public class IntervalShifting {

	private IntevalShiftingVisitor shifted;

	public RSFOLFormula perform(RSFOLFormula f) {
		shifted=new IntevalShiftingVisitor(f);
		return f.accept(shifted);
	}
	
	public float getFormulaShift() {
		return shifted.getSimulationShifting();
		
	}

}
