package lu.snt.rsfol;

public enum LOGICOP {

	CONJ("and"), DISJ("or"), IMPL("implies"), BICOND("iff");

	private final String op;

	private LOGICOP(String op) {
		this.op = op;
	}

	public String toString() {
		return op;
	}

	
	public String getOp() {
		return op;
	}

	public static LOGICOP fromString(String text) {
		if (text.equals("and")) {
			return CONJ;
		}
		if (text.equals("or")) {
			return DISJ;
		}
		if (text.equals( "implies")) {
			return IMPL;
		}
		if (text.equals( "iff")) {
			return BICOND;
		}

		throw new IllegalArgumentException("Not viable alternative " + text);
	}

}
