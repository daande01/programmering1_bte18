package programmering1_bte18.egengrafik.massor_av_bollar;

import java.awt.Color;
import java.awt.Graphics;
import java.util.LinkedList;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.Timer;

public class Bollbanan extends JComponent {



	public LinkedList<Boll> bolllista= new LinkedList<Boll>();

	public Bollbanan() {

		for (int i=0;i<10;i++) {
		bolllista.add(new Boll(Math.random()*400, Math.random()*400, 0, 3, new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255))));
		}



		Timer t = new Timer(40, e->{

			for (Boll boll : bolllista) {

				boll.update();
			}



			repaint();
		});
		t.start();
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		for (Boll boll : bolllista) {

			boll.rita(g);
		}


	}

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setContentPane(new Bollbanan());
		f.setSize(500,500);
		f.setVisible(true);

	}


}
