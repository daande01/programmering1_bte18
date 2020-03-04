package programmering1_bte18.egengrafik;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.Timer;

public class boll2key extends JComponent implements KeyListener {
	int x = 100;
	int y = 100;
	int xv = 1;
	int yv = 1;
	static Timer t;

	public boll2key() {
		this.addKeyListener(this);
		this.setPreferredSize(new Dimension(400, 400));
		t = new Timer(20, e -> {

			update();

		});
		t.start();
	}

	public void update() {

		// yv=yv+2;

		y = y + yv;
		x = x + xv;
		if (y >= 300) {

			yv = -yv;

		} else if (y <= 0) {

			yv = yv * -1;
			y = 0;
		}

		if (x >= 300) {

			xv = -xv;

		} else if (x <= 0) {

			xv = xv * -1;

		}

		this.repaint();

	}

	@Override
	protected void paintComponent(Graphics g) {

		super.paintComponent(g);
		g.setColor(Color.black);
		g.fillOval(x, y, 100, 100);
	}

	public static void main(String[] args) {

		JFrame f = new JFrame("test");

		f.setLayout(new FlowLayout());
		f.setContentPane(new boll2key());
		f.setVisible(true);
		f.pack();

	}

	@Override
	public void keyPressed(KeyEvent e) {

		int key = e.getKeyCode();

		if (key == KeyEvent.VK_UP) {

			y = y - 10;

		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public boolean isFocusTraversable() {
		return true;
	}

}
