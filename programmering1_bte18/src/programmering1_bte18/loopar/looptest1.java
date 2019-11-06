package programmering1_bte18.loopar;

public class looptest1 {

	public static void main(String[] args) {

		int summa = 1;
		int lön = 1;
		int dagar = 0;

		while (summa <= 1000000) {

			lön = lön * 2;

			summa = summa + lön;
			System.out.println(summa);
			dagar++;
		}

		System.err.println(summa + "efter " + dagar + "dagar");

	}

}
