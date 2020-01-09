package programmering1_bte18.grafikswing;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GrafikJbutton extends JFrame implements ActionListener {

	JButton b1 = new JButton("send form");
	JLabel l1 = new JLabel("start text");

	public GrafikJbutton() {

		this.setLayout(new FlowLayout());

		add(b1);
		add(l1);
		setVisible(true);
		setSize(new Dimension(1000,1000));
		b1.addActionListener(this);

	}

	public static void main(String[] args) {

		new GrafikJbutton();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		l1.setText("ny text");


	}

}
