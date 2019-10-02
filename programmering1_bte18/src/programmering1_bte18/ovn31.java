package programmering1_bte18;

import java.util.Arrays;
import java.util.Scanner;

public class ovn31 {

	public static void main(String[] args) {

		Scanner input=new  Scanner(System.in);

		int [] tid= new int[4];

		System.out.println("ange antal sekunder");
		tid[0]=input.nextInt();
		System.out.println("ange antal sekunder");
		tid[1]=input.nextInt();
		System.out.println("ange antal sekunder");
		tid[2]=input.nextInt();
		System.out.println("ange antal sekunder");
		tid[3]=input.nextInt();

		System.out.println(tid[0]+" "+tid[1]+" "+tid[2]+" "+tid[3]);

		System.out.println(Arrays.toString(tid));

		for (int i = 0; i < tid.length; i++) {

			System.out.println(tid[i]);
		}

		int i=0;
		while(i<4) {
			System.out.print(tid[i]);
			i=i+1;
		}



	}


}
