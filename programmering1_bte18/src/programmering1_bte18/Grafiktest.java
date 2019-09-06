package programmering1_bte18;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Grafiktest extends JFrame implements ActionListener {


	public Grafiktest() {


		setLayout(new FlowLayout());
		JButton b= new JButton ("hej");
		b.addActionListener(this);
		add(b);
		setVisible(true);
		setSize(200, 200);


	}


	public static void main(String[] args) {

		new Grafiktest();

	}



	@Override
	public void actionPerformed(ActionEvent e) {

		System.out.println("hej");



	}

}
