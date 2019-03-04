package lu.snt.rsfol.expression;

public enum ArithmeticOperator {
	PLUS("+"), MINUS("-"), PROD("*"), DIV("/");

	private String operator;

	private ArithmeticOperator(String operator) {
		this.setOperator(operator);
	}

	public String getOperator() {
		return operator;
	}

	public String toString() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public static ArithmeticOperator fromString(String text) {
		if (text.equals("+")) {
			return PLUS;
		}
		if (text.equals("-")) {
			return MINUS;
		}
		if (text.equals("*")) {
			return PROD;
		}
		if (text.equals("/")) {
			return DIV;
		}

		throw new IllegalArgumentException("Not viable alternative " + text);
	}
}
