package programmering1_bte18;

import javax.swing.JOptionPane;

public class bilforsakring {

	public static void main(String[] args) {

		String l = JOptionPane.showInputDialog("längd på ditt fordon");

		int längd = Integer.parseInt(l);

		if (längd < 6) {

			System.out.print("pris : 1000kr");

		}  if (längd >= 6 && längd < 10) {

			System.out.print("pris : 2000kr");

		} else {

			System.out.println("pris :3000kr ");

		}

	}

}
