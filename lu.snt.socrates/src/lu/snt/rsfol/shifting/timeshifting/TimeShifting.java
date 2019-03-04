package lu.snt.rsfol.shifting.timeshifting;

import lu.snt.rsfol.formulae.RSFOLFormula;

public class TimeShifting {

	public RSFOLFormula perform(RSFOLFormula f) {
		return f.accept(new TimeShiftVisitor(f));

	}
}
