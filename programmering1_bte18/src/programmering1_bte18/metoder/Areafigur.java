package programmering1_bte18.metoder;

public class Areafigur {

	final static int  triangel=1;
	final static int  cirkel=3;
	final static int  kvadrat=2;

	public static double figArea(int h, int b, int r, int fig) {

		// 1 triangel, 2 kvadrat , 3 cirkel

		double area = 0;
		if (fig == 2) {

			area = h * b;

		} else if (fig == 1) {

			area = b * h / 2.0;

		} else {

			area = Math.PI * Math.pow(r, 2);

		}

		return area;

	}

	public static void main(String[] args) {

		double svar=figArea(2, 10, 10, triangel);
		System.out.println(svar);
	}

}
