package programmering1_bte18.metoder;

public class Comparestrings {

	public static boolean comstr(String a, String b) {

		if (a.length() != b.length()) {

			return false;

		} else {

			for (int i = 0; i < a.length(); i++) {



				if((a.charAt(i) ) !=( b.charAt(i))) {

					return false;
				}


			}
		}

		return true;

	}

	public static void main(String[] args) {

		boolean svar =comstr("DANIEL", "daniel");

		System.out.println(svar);

		String s = "hej";

		if(s.equals("sdfdfdf"))


	}

}
