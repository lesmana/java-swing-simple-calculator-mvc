import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class View {

	Controller controller;

	JLabel result;

	public View() {
	}

	public void setController(Controller controller) {
		this.controller = controller;
	}

	public void show() {
		JFrame frame = new JFrame("calculator mvc");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		JTextField input1 = new JTextField(10);
		JComboBox<String> operand = new JComboBox<String>(new String[] { "+", "-" });
		JTextField input2 = new JTextField(10);
		JButton calcbutton = new JButton("calculate");
		calcbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = input1.getText();
				String op = operand.getItemAt(operand.getSelectedIndex());
				String s2 = input2.getText();
				controller.handleUserInput(s1, op, s2);
			}
		});
		result = new JLabel("    ");
		result.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panel.add(input1);
		panel.add(operand);
		panel.add(input2);
		panel.add(calcbutton);
		panel.add(result);
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
	}

	public void setResult(String res) {
		this.result.setText(res);
	}

}
