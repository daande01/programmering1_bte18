package programmering1_bte18.metoder;
public class Callbyvalue {

	public static int subtraktion(int i , int k) {

		k=100;
		i=100;

		return i-k;
	}

	public static void main(String[] args) {

			int a= 10;
			int b= 2;
			subtraktion(a, b);
			System.out.println(a+b);

	}



}
