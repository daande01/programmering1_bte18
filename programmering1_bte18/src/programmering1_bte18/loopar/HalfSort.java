package programmering1_bte18.loopar;

import java.util.Arrays;

public class HalfSort {

	public static void main(String[] args) {

		int[] i = { 4, 6, 2, 8, 4, 5, 8, 9 };

		for (int j = 0; j < 7; j++) {

			if (i[j] > i[j + 1]) {

				int temp = i[j + 1];
				i[j + 1] = i[j];
				i[j] = temp;

			}

		}

		System.out.println(Arrays.toString(i));

	}

}
