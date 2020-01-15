package programmering1_bte18.grafikswing;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GrafikJbuttonlambda extends JFrame {  // ärver egenskaper från jframe denna klass blir alltså ett fönster

	JButton b1 = new JButton("send form"); // skapar ett knapp objekt och skapar en referensvariabel till knappobjektet så att jag i framtiden kan påverka knappen eller lyssna på knappen.
	JLabel l1 = new JLabel("start text");  // skapa en ruta som jag kan lägga in text i samt en referens till den
	private int tal=0;

	public GrafikJbuttonlambda() {   // detta är en konstruktor som kör direkt när jag skapar ett objekt av klassen.

		this.setLayout(new FlowLayout()); // sätter layout , definerar alltså hur objekten skall hamna i fönstret , flow layout betydet att objekten hamnar eftervarandra om de finns plats i fönstret

		add(b1); // lägger till knappen b1 till fönstret
		add(l1); // lägger till labeln l1 till fönstret
		setVisible(true); // gör allt synligt
		setSize(new Dimension(1000, 1000)); // sätter storlek på fönstret

		b1.addActionListener(e -> {    // skapar en lyssnare med lambda utryck detta är enklare än actionperformed varianten som finns i en annan fil här på github, för delen är att allt som hör till denna knapp blir samlat på ett och samma ställe i koden bla

			l1.setText("test"); // ändrar texten i l1 om någon tryckt på b1

		});

	}

	public static void main(String[] args) {

		new GrafikJbuttonlambda(); // skapar ett objekt av denna klass vilket leder till att konstruktorn kör vilket leder till att fönstret och de olika objekten ritas ut.
	}

}
