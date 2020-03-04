package programmering1_bte18.grafikswing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class �kaMinska extends JFrame {

	int number = 0; // instansvariabel
	JButton minska = new JButton("minska"); // skapar ett knapp objekt (minska) �r inparameter till konstruktorn samt
											// skapar referensvariabeln minska
	JButton �ka = new JButton("�ka");
	JLabel taltext = new JLabel("0"); //

	public �kaMinska() { // konstruktor

		setLayout(new FlowLayout()); // var saker skall placeras i fr�nstret och hur

		minska.addActionListener(e -> {

			int tal = --number;

			taltext.setText(" " + tal);

		});
		�ka.addActionListener(e -> {

			int tal = ++number;

			taltext.setText(" " + tal);

		});

		add(minska);
		add(�ka);
		add(taltext);
		setSize(200, 200);
		this.setVisible(true);

	}

	public static void main(String[] args) {

		new �kaMinska();

	}

}
