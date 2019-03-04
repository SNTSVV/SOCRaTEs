package lu.snt.rsfol;

public enum RELOP {

	GE(">"), LE("<"), EQ("="), LEQ("<="), GEQ(">="), NEQ("!=");

	private final String op;

	private RELOP(String op) {
		this.op = op;
	}

	public String getOp() {
		return op;
	}
	
	public String toString() {
		if(this.equals(RELOP.EQ)) {
			return "==";
		}
		return op;
	}

	public static RELOP fromString(String text) {
		if (text.equals(">")) {
			return GE;
		}
		if (text.equals("<")) {
			return LE;
		}
		if (text.equals("=")) {
			return EQ;
		}
		if (text.equals("<=")) {
			return LEQ;
		}
		if (text.equals(">=")) {
			return GEQ;
		}
		if (text.equals("!=")) {
			return NEQ;
		}
		throw new IllegalArgumentException("Not viable alternative s" + text+"d");
	}
	
	public static RELOP negate(RELOP op) {
		if(op.equals(GE)) {
			return LEQ;
		}
		if(op.equals(GEQ)) {
			return LE;
		}
		if(op.equals(EQ)) {
			return NEQ;
		}
		if(op.equals(NEQ)) {
			return EQ;
		}
		if(op.equals(LE)) {
			return GEQ;
		}
		if(op.equals(LEQ)) {
			return GE;
		}
		throw new IllegalArgumentException("Not supported operator");
	}

}
