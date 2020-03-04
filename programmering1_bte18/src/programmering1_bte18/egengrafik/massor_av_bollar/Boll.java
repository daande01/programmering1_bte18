package programmering1_bte18.egengrafik.massor_av_bollar;

import java.awt.Color;
import java.awt.Graphics;

public class Boll {


	double x=0;
	double y=0;
	double xv=1;
	double yv=1;
	Color cc;


	public Boll(double x,double y , double xv , double yv, Color c) {

		this.x=x;
		this.y=y;
		this.xv=xv;
		this.yv=yv;
		this.cc=c;

	}

	public void rita(Graphics g) {
		g.setColor(cc);
		g.fillOval(x(), y(), 40, 40);

	}


	public int x() {

		return (int) Math.round(x);
	}

	public int y() {
		return (int)Math.round(y);
	}

	public void update() {

		yv=yv+1;

		if (y>400-40) {


			yv=-yv;
		}

		x+=1;
		y+=yv;

	}


}
