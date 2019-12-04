package programmering1_bte18.metoder;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Readinput {





	public static int[] readInt(int amount) {

		int[] numbers = new int[amount];

		String input;
		for (int i = 0; i < numbers.length; i++) {

			input = JOptionPane.showInputDialog("ange tal" + (i + 1));

			numbers[i] = Integer.parseInt(input);

		}
		return numbers;
	}

	public static void main(String[] args) {

		int [] n=readInt(4);
		System.out.println(Arrays.toString(n));
	}



}
