package programmering1_bte18.egengrafik;



import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class e4 extends JComponent {
	public e4() {

	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.BLACK);
		g.fillOval(100, 100, 100, 100);
	}

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setLayout(new FlowLayout());
		f.setContentPane(new e4());
		f.setVisible(true);
		f.setSize(1000, 1000);

	}
}
