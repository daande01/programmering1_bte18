package programmering1_bte18.metoder;

public class Palindrom {

	public static boolean palindromTester(String ord) {

		String ordreverse = "";

		for (int i = ord.length()-1; i >= 0; i--) {

			ordreverse += ord.charAt(i);

		}
		if (ord.equals(ordreverse)) {

			return true;
		} else {
			return false;
		}

	}
public static void main(String[] args) {

	System.out.println(palindromTester("anna"));

}
}
