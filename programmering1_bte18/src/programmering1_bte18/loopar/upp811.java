package programmering1_bte18.loopar;

import javax.swing.JOptionPane;

public class upp811 {

	public static void main(String[] arg) {

		int antalanställda = 0;
		int summmalön = 0;

		boolean loop = true;
		do {

			String sval = JOptionPane.showInputDialog("1: statistik \n 2: mata in nya uppgifter \n 3: avsluta");
			System.out.println(sval);

			switch (sval) {

			case "1":
				if (summmalön!=0  && antalanställda!=0) {
				int medellön = summmalön / antalanställda;

				JOptionPane.showMessageDialog(null, "antal:" + antalanställda + "medellön" + medellön);

				}else {
					int medellön=0;
					JOptionPane.showMessageDialog(null, "antal:" + antalanställda + "medellön" + medellön);

				}


				break;
			case "2":

				int i = JOptionPane.showConfirmDialog(null, "har du antällt en ny person");

				if (i == 0) {

					antalanställda++;
					summmalön += Integer.parseInt(JOptionPane.showInputDialog("lön"));
				}

				break;
			case "3":
				loop = false;
				System.out.println("false");
				break;
			default:
				System.out.println("default");
			}

		} while (loop);
	}
}