package programmering1_bte18.grafikswing;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Bildväxlare extends JFrame {

	JLabel bild = new JLabel(new ImageIcon("bild.jpg"), JLabel.LEFT);
	JButton b = new JButton("byt bild");

	public Bildväxlare() {

		setLayout(new FlowLayout());

		add(bild);
		add(b);
		setVisible(true);
		pack();
		b.addActionListener(e -> {

			if (bild.getIcon().toString().equals("bild.jpg")) {

				bild.setIcon(new ImageIcon("bild1.png"));

			} else if (bild.getIcon().toString().equals("bild1.png")) {

				bild.setIcon(new ImageIcon("bild.jpg"));

			}

		});

	}

	public static void main(String[] args) {

		new Bildväxlare();

	}

}
