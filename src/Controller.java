import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {

	Model model;
	View view;

	public Controller(Model model, View view) {
		this.model = model;
		this.view = view;
		view.calcbutton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				int i1 = Integer.parseInt(view.input1.getText());
				String op = view.operand.getItemAt(view.operand.getSelectedIndex());
				int i2 = Integer.parseInt(view.input2.getText());
				int res = model.calculate(i1, op, i2);
				view.result.setText(String.valueOf(res));
			}

		});
	}

	public void start() {
		this.view.show();
	}

}
