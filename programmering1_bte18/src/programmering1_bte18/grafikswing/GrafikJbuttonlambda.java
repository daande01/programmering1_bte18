package programmering1_bte18.grafikswing;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GrafikJbuttonlambda extends JFrame { // �rver egenskaper fr�n jframe denna klass blir allts� ett f�nster

	JButton b1 = new JButton("send form"); // skapar ett knapp objekt och skapar en referensvariabel till knappobjektet
											// s� att jag i framtiden kan p�verka knappen eller lyssna p� knappen.
	JLabel l1 = new JLabel("start text"); // skapa en ruta som jag kan l�gga in text i samt en referens till den
	private int tal = 0;

	public GrafikJbuttonlambda() { // detta �r en konstruktor som k�r direkt n�r jag skapar ett objekt av klassen.

		this.setLayout(new FlowLayout()); // s�tter layout , definerar allts� hur objekten skall hamna i f�nstret , flow
											// layout betydet att objekten hamnar eftervarandra om de finns plats i
											// f�nstret

		add(b1); // l�gger till knappen b1 till f�nstret
		add(l1); // l�gger till labeln l1 till f�nstret
		setVisible(true); // g�r allt synligt
		setSize(new Dimension(1000, 1000)); // s�tter storlek p� f�nstret

		b1.addActionListener(e -> { // skapar en lyssnare med lambda utryck detta �r enklare �n actionperformed
									// varianten som finns i en annan fil h�r p� github, f�r delen �r att allt som
									// h�r till denna knapp blir samlat p� ett och samma st�lle i koden bla

			l1.setText("test"); // �ndrar texten i l1 om n�gon tryckt p� b1

		});

	}

	public static void main(String[] args) {

		new GrafikJbuttonlambda(); // skapar ett objekt av denna klass vilket leder till att konstruktorn k�r
									// vilket leder till att f�nstret och de olika objekten ritas ut.
	}

}
