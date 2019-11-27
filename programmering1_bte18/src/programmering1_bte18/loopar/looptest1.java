package programmering1_bte18.loopar;

public class looptest1 {

	public static void main(String[] args) {

		int summa = 1; // deklarerar en variabel samt initsierar den
		int lön = 1;
		int dagar = 0;

		while (summa <= 1000000) { // så länge som summan är mindre eller lika med en miljon

			lön = lön * 2;  // lönen dubblas

			summa = summa + lön;  // förmögenhet + lön = summa
			System.out.println(summa);
			dagar++;
		}

		System.err.println(summa + "efter " + dagar + "dagar");

	}

}
