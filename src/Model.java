public class Model {

	public Model() {
	}

	public int calculate(int i1, String op, int i2) {
		int res;
		switch (op) {
		case "+":
			res = i1 + i2;
			break;
		case "-":
			res = i1 - i2;
			break;
		default:
			throw new RuntimeException("impossible operator");
		}
		return res;
	}

}
