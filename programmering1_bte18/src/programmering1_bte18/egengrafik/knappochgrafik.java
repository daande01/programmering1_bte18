package programmering1_bte18.egengrafik;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class knappochgrafik extends JComponent {

	int x = 100;
	int y = 100;
	static Timer t;

	public knappochgrafik() {
		this.setPreferredSize(new Dimension(400, 400));
		t = new Timer(20, e -> {
			update();
		});
		t.start();
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.black);
		g.fillRect(x, y, 20, 20);
	}

	private void update() {
		x++;
		y++;
		// System.out.println(x);
		repaint();

	}

	public static void main(String[] args) {

		JFrame f = new JFrame();
		JButton b1 = new JButton("stop");
		JPanel p = new JPanel();
		p.add(new knappochgrafik());
		p.add(b1);
		b1.addActionListener(e -> {

			t.stop();
		});

		f.setContentPane(p);
		f.setVisible(true);
		f.setSize(400, 400);
		f.pack();
	}

}
