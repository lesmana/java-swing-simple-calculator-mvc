public class Controller {

	Model model;
	View view;

	public Controller(Model model, View view) {
		this.model = model;
		this.view = view;
	}

	public void handleUserInput(String s1, String op, String s2) {
		int i1 = Integer.parseInt(s1);
		int i2 = Integer.parseInt(s2);
		int res = this.model.calculate(i1, op, i2);
		this.view.setResult(String.valueOf(res));
	}

	public void start() {
		this.view.show();
	}

}
