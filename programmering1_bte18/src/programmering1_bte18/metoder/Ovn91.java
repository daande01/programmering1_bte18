package programmering1_bte18.metoder;

import java.text.NumberFormat;

public class Ovn91 {

	public static void main(String[] args) {

		double areac=Ovn91.areaBasCylinder(10.786);
		System.out.println(areac);

	}

	public static double areaBasCylinder(Double radie) {

		double area= Math.PI*radie*radie;

		 NumberFormat nF = NumberFormat.getNumberInstance();

		 nF.setMaximumFractionDigits(2);

		 System.out.println(nF.format(area));

		return area;

	}



}
