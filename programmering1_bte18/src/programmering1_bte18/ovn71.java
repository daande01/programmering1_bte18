package programmering1_bte18;

import javax.swing.JOptionPane;

public class ovn71 {

	public static void main(String[] args) {

		String stringålder = JOptionPane.showInputDialog("ange din ålder");

		int intålder = Integer.parseInt(stringålder);

		if (intålder > 12) {

			System.out.println("får deltaga");

		} else {

			System.out.println("får ej deltaga");
		}

	}

}
