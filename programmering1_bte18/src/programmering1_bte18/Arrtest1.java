package programmering1_bte18;

import java.util.Arrays;

public class Arrtest1 {

	public static void main(String[] args) {


		int [] array1 = {1,2,3,4,5,6,7,8,9,10};
		int [] array2 = {1,2,3,4,5,6,7,8,9,10};

		int [] arraysumma=new int[10];


		for(int i =0; i<10; i++) {
			arraysumma[i]= array1[i]+ array2[i];

		}
		System.out.println(Arrays.toString(arraysumma));


	}


}
