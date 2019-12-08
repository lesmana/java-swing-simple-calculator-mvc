import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class View {

	JTextField input1;
	JComboBox<String> operand;
	JTextField input2;
	JButton calcbutton;
	JLabel result;

	public View() {
		input1 = new JTextField(10);
		operand = new JComboBox<String>(new String[] { "+", "-" });
		input2 = new JTextField(10);
		calcbutton = new JButton("calculate");
		result = new JLabel("    ");
	}

	public void show() {
		JFrame frame = new JFrame("calculator mvc");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
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

}
