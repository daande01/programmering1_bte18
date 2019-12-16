package programmering1_bte18.metoder;

import javax.swing.JOptionPane;

public class Metoder3 {









	public static void main(String[] args) {

		printOrd("hej");

		printFleraOrd("daniel", "är bäst");

		int svar =summa(5,5);

		System.out.println(svar);

		String srader = JOptionPane.showInputDialog("ange rader");

		int rad=Integer.parseInt(srader);

		String skol = JOptionPane.showInputDialog("ange antal kolumner");

		int kol=Integer.parseInt(skol);



		printStarPattern(rad, kol);

	}


	public static void printStarPattern(int rader, int kolumner) {

		for (int i = 0; i < rader; i++) {

			for (int j = 0; j < kolumner; j++) {

				System.out.print("*");

			}

			System.out.println();
		}


	}








	public static int summa(int tal1, int tal2) {


		return tal1+tal2;
	}



	public static void  printFleraOrd(String ord1, String ord2) {

		System.out.println(ord1+" "+ord2);

	}






	private static void printOrd(String string) {

		System.out.println(string);

	}



}
