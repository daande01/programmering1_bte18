package programmering1_bte18.metoder;

public class Palindrom {

	public static boolean palindromTester(String ord) {

		String ordreverse = "";
		// 3 -> 0
		for (int i = ord.length() - 1; i >= 0; i--) {

			ordreverse += ord.charAt(i);

		}
		return ord.equals(ordreverse);
	}

	public static void main(String[] args) {


		//System.out.println(palindromTester("anna"));

		String arr[]=Readinput.readString(3);

		for (int i = 0; i < arr.length; i++) {

			System.out.println(palindromTester(arr[i]));

		}


	}
}
