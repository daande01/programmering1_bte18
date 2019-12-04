package programmering1_bte18.metoder;
import javax.swing.JOptionPane;

public class Readinput {


	public static String[] readString(int amount) {

		String[] strings = new String[amount];

		String input;
		for (int i = 0; i < strings.length; i++) {

			strings[i] = JOptionPane.showInputDialog("ange tal" + (i + 1));



		}
		return strings;
	}

	public static double[] readDouble(int amount) {

		double[] numbers = new double[amount];

		String input;
		for (int i = 0; i < numbers.length; i++) {

			input = JOptionPane.showInputDialog("ange tal" + (i + 1));

			numbers[i] = Double.parseDouble(input);

		}
		return numbers;
	}


	public static int[] readInt(int amount) {

		int[] numbers = new int[amount];

		String input;
		for (int i = 0; i < numbers.length; i++) {

			input = JOptionPane.showInputDialog("ange tal" + (i + 1));

			numbers[i] = Integer.parseInt(input);

		}
		return numbers;
	}



}
