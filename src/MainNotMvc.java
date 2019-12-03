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

public class MainNotMvc {

	public static void main(String[] args) {
		JFrame frame = new JFrame("calculator not mvc");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		JTextField input1 = new JTextField(10);
		JComboBox<String> operand = new JComboBox<String>(new String[] { "+", "-" });
		JTextField input2 = new JTextField(10);
		JButton calcbutton = new JButton("calculate");
		JLabel result = new JLabel("    ");
		result.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		calcbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i1 = Integer.parseInt(input1.getText());
				String op = operand.getItemAt(operand.getSelectedIndex());
				int i2 = Integer.parseInt(input2.getText());
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
				result.setText(String.valueOf(res));
			}
		});
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
