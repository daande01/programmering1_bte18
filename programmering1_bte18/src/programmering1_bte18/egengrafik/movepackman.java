package programmering1_bte18.egengrafik;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class movepackman extends JComponent implements KeyListener {

	int pacy=100;
	int pacx=100;
	int [] xPoints= {100,100,125};
	int [] yPoints= {115,135,125};


	public movepackman() {

		addKeyListener(this);

	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.setColor(Color.YELLOW);
		g.fillOval(pacx, pacy, 50, 50);
		g.setColor(Color.BLACK);
		g.fillPolygon(xPoints, yPoints, 3);

	}




	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode()== KeyEvent.VK_UP) {

			System.out.println("test");

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
