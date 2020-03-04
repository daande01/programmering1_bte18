package programmering1_bte18.grafikswing;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Bokking3dprinter extends JFrame {

	JRadioButton b1 = new JRadioButton("skrivare 1");
	JRadioButton b2 = new JRadioButton("skrivare 2");
	JRadioButton b3 = new JRadioButton("skrivare 3");
	ButtonGroup g1 = new ButtonGroup();
	JLabel start = new JLabel("start time");
	JLabel end = new JLabel("end time");
	JTextField starttime = new JTextField(10);
	JTextField endtime = new JTextField(10);
	JPanel p = new JPanel();
	JButton bb = new JButton("boka");
	JLabel svar = new JLabel("");

	public Bokking3dprinter() {

		setLayout(new FlowLayout());
		g1.add(b1);
		g1.add(b2);
		g1.add(b3);

		add(b1);
		add(b2);
		add(b3);
		p.setLayout(new GridLayout(2, 2));
		p.add(start);
		p.add(starttime);
		p.add(end);
		p.add(endtime);
		add(p);
		add(bb);
		add(svar);
		setVisible(true);
		setSize(new Dimension(500, 500));

		bb.addActionListener(e -> {

			String s = starttime.getText();
			String et = endtime.getText();
			String skrivare = "";

			if (b1.isSelected()) {

				skrivare = "skrivare1";

			} else if (b2.isSelected()) {
				skrivare = "skrivare2";
			} else {
				skrivare = "skrivare3";
			}

			svar.setText(s + " " + et + "" + skrivare);
		});

	}

	public static void main(String[] args) {

		new Bokking3dprinter();

	}

}
