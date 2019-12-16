package programmering1_bte18.metoder;

public class ovn99 {

	public static void main(String[] args) {

		System.out.println(    tärningkast()   );

	}

	public static int tärningkast() {

		int antal = 0;

		for (int i = 0; i < 6000; i++) {

			int rand = (int) (Math.random() * 6 + 1);
			if (rand == 6) {

				antal++;

			}

		}

		return antal;

	}

}
