package programmering1_bte18.loopar;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Looptest {

	public static void main(String[] args) {

		int[] tal = new int[5]; // skapar array

		for (int i = 0; i < 5; i++) {  // loopar 5 varv 0-4

			String s = JOptionPane.showInputDialog("ange ett tal");// läser in 5 tal och lagrar tillfälligt

			tal[i] = Integer.parseInt(s); //omvandlar till int

		}


		int störstatalet = Integer.MIN_VALUE; // skapar variabel med lågt värde
		int k = 0; // skapar räknare
		while (k < 5) {

			if (tal[k] > störstatalet) {
				störstatalet = tal[k];
			}
			k++;
		}









		int minstatalet = Integer.MAX_VALUE; // skapar variabel med lågt värde
		 k = 0; // skapar räknare
		while (k < 5) {

			if (tal[k] < minstatalet) {
				minstatalet = tal[k];
			}
			k++;
		}

		System.out.println(Arrays.toString(tal) + "störstatalet är " + störstatalet+" mintalet är "+minstatalet);

	}
}
