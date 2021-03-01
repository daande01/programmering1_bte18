package programmering1_bte18.egengrafik;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Arrays;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class movepackman extends JComponent implements KeyListener {

	int pacy=100;
	int pacx=100;
	int [] y=new int[3000];
	int [] x=new int[3000];

	int n=0;
	int [] xPoints= {100,100,125};
	int [] yPoints= {115,135,125};




	public movepackman() {

		for (int i = 1; i < x.length; i++) {

			x[i]=-100;
			y[i]=-100;

		}
		x[0]=100;
		y[0]=100;
		addKeyListener(this);

	}

	@Override
	protected void paintComponent(Graphics g) {
		//super.paintComponent(g);

		g.setColor(Color.YELLOW);

		for (int i = 0; i < x.length; i++) {

			System.out.println(Arrays.toString(y));
		if(x[i] == -100) {
			i=x.length;
		}else {
			g.fillOval(x[i], y[i], 50, 50);
		}

		}



		g.setColor(Color.BLACK);
		g.fillPolygon(xPoints, yPoints, 3);

	}




	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode()== KeyEvent.VK_UP) {
			y[n+1]=y[n]	 + 10;
			x[n+1]=x[n];
			n++;
			pacy-=10;
			repaint();
		}


	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

		if (e.getKeyCode()== KeyEvent.VK_UP) {

			System.out.println("test");

		}

	}

	@Override
	public boolean isFocusTraversable() {
		return true;
	}



	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setBackground(Color.black);
		f.setSize(400,400);
		f.setContentPane(new movepackman());
		f.setVisible(true);



	}




}
