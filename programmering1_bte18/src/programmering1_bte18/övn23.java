package programmering1_bte18;

import javax.swing.JOptionPane;

public class övn23 {

	public static void main(String[] args) {

		String ålderString = JOptionPane.showInputDialog("ange din ålder");

		int age = Integer.parseInt(ålderString);

		double d = age / 10.0;

		int i = (int) d;

		int jämt = i * 10 + 10;

		int kvar = jämt - age;

		JOptionPane.showMessageDialog(null, "du fyller " + jämt + "om" + kvar);

	}

}
