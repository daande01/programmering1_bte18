package programmering1_bte18.grafikswing;

public class Hus {   // klass hus

	private boolean dörr = false;  // instansvariabel för dörr

	private int x = 0; // instansvariabel x led
	private int y = 0; // instansvariabel y led
	private int z = 0;  // instansvariabel z led

	public Hus(int xx, int yy, int zz, boolean d) {   //  konstruktor med 4 st inparametrar

		x = xx;  //  tar emot värdet från skapadet av objektet och lägger in det i instansvarabeln
		y = yy;   //  tar emot värdet från skapadet av objektet och lägger in det i instansvarabeln
		z = zz;  //  tar emot värdet från skapadet av objektet och lägger in det i instansvarabeln

		dörr = d; //  tar emot värdet från skapadet av objektet och lägger in det i instansvarabeln

	}

	/*
	 * skriver ut egenskaperna för huset alltså dess instansvariabler.
	 *
	 */

	public  void printhus() {

		System.out.println("x="+x+"y="+y+"z="+z+"dörr="+dörr);
	}

	public static void main(String[] args) {

		Hus h1=new Hus(10, 20, 40, true); // skapar ett objekt och lagrar en referens till objektet i h1 samt skickar in inparametrar

		h1.printhus(); // anropar instansmetoden på objektet h1 .

		Hus h2= new Hus(20,20,20,true);

		h2.printhus();




	}

}
