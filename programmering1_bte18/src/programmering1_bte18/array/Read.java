package programmering1_bte18.array;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Read {



	public static int[] readord() {

		int []  a = new int [5] ;

		for (int i = 0; i < a.length; i++) {


		String stringtal =	JOptionPane.showInputDialog( "ange ett tal");

		a [i]= Integer.parseInt(stringtal);

		}

		return a;

	}


	public static void main(String[] args) {


		int []b;

		b=readord();

		System.out.println(Arrays.toString(b));


	}






}
