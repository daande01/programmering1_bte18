package programmering1_bte18;

import java.util.Scanner;

public class övn22lösning2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("ange ett tal som skall kvadreras:");

		String talString=input.nextLine();

		int tal =Integer.parseInt(talString);

		System.out.println("svar:"+(tal*tal));
	}





}
