package programmering1_bte18.egengrafik.flerabollar;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.Timer;

public class Bollbanan extends JComponent {

	private Boll b1;
	private Boll b2;



	public Bollbanan() {

		b1=new Boll(Math.random()*400, Math.random()*400, 0, 3, new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));
		b2=new Boll(Math.random()*400, Math.random()*400, 0, 3, new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));

		Timer t = new Timer(40, e->{
			b1.update();
			b2.update();

			repaint();
		});
		t.start();
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		b1.rita(g);
		b2.rita(g);

	}

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setContentPane(new Bollbanan());
		f.setSize(500,500);
		f.setVisible(true);

	}


}
