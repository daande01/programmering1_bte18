package programmering1_bte18.grafikswing;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class grafikjtextfield extends JFrame {

	JTextField f1 = new JTextField(10);
	JTextField f2 = new JTextField(10);
	JLabel l1 = new JLabel();
	JButton b1 = new JButton("beräkna");

	public grafikjtextfield() {

		setLayout(new FlowLayout());
		add(f1);
		add(f2);
		add(b1);
		add(l1);
		setVisible(true);
		setSize(new Dimension(400, 400));

		b1.addActionListener(e -> {

			int i1 = Integer.parseInt(f1.getText());
			int i2 = Integer.parseInt(f2.getText());

			int svar = i1 * i2;

			l1.setText(Integer.toString(svar));

		});

	}

	public static void main(String[] args) {

		new grafikjtextfield();
	}

}
