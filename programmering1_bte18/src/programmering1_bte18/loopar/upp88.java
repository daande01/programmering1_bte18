package programmering1_bte18.loopar;

public class upp88 {
	public static void main(String[] args) {

		int år = 0;

		double saldo = 1000;

		for (int i = 0; i < 20; i++) {

			saldo = 1.05 * saldo;

			saldo += 1000;
			år++;
		}

		System.out.println(saldo + " " + år);
	}
}
