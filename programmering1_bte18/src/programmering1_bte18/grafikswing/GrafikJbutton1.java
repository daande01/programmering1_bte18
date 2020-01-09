package programmering1_bte18.grafikswing;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GrafikJbutton1 extends JFrame {

	JButton b1 = new JButton("send form");
	JLabel l1 = new JLabel("start text");
	private int tal=0;

	public GrafikJbutton1() {

		this.setLayout(new FlowLayout());

		add(b1);
		add(l1);
		setVisible(true);
		setSize(new Dimension(1000, 1000));

		b1.addActionListener(e -> {

			l1.setText("test");

		});

	}

	public static void main(String[] args) {

		new GrafikJbutton1();
	}

}
