package programmering1_bte18.metoder;

import java.util.Arrays;

public class Callbyreferance {

	public static void arrFuckUp(int[] a) {

		for (int i = 0; i < a.length; i++) {
			a[i] = 10;
		}

	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 2, 3, 7, 8, 9 };
		arrFuckUp(arr);

		System.out.println(Arrays.toString(arr));

	}

}
