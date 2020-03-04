package programmering1_bte18.grafikswing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ÖkaMinska extends JFrame {

	int number = 0; // instansvariabel
	JButton minska = new JButton("minska"); // skapar ett knapp objekt (minska) är inparameter till konstruktorn samt
											// skapar referensvariabeln minska
	JButton öka = new JButton("öka");
	JLabel taltext = new JLabel("0"); //

	public ÖkaMinska() { // konstruktor

		setLayout(new FlowLayout()); // var saker skall placeras i frönstret och hur

		minska.addActionListener(e -> {

			int tal = --number;

			taltext.setText(" " + tal);

		});
		öka.addActionListener(e -> {

			int tal = ++number;

			taltext.setText(" " + tal);

		});

		add(minska);
		add(öka);
		add(taltext);
		setSize(200, 200);
		this.setVisible(true);

	}

	public static void main(String[] args) {

		new ÖkaMinska();

	}

}
