package programmering1_bte18;

import javax.swing.JOptionPane;

public class övn22lösning3 {

	public static void main(String[] args) {

		String indata=JOptionPane.showInputDialog("ange ett tal som skall kvadreras");

			int tal=Integer.parseInt(indata);

			int  svar=(int) Math.pow(tal, 2);

		JOptionPane.showMessageDialog(null, svar);

	}


}
