package programmering1_bte18.grafikswing;

import java.awt.Toolkit;
import java.time.LocalDateTime;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JOptionPane;

public class Alarm {

	public static void main(String[] args) {

		String t = alarmTid();

		String h = t.substring(0, 2);
		String m = t.substring(3, 5);

		// System.out.println(h+" ---"+m);


		// System.out.println(datorh+" ---"+datorm);

		TimerTask repeatedTask = new TimerTask() {
			@Override
			public void run() {


				int datorh = LocalDateTime.now().getHour();
				int datorm = LocalDateTime.now().getMinute();

				if (datorh == Integer.parseInt(h) && datorm == Integer.parseInt(m)) {

					for (int i = 0; i < 10; i++) {

						Toolkit.getDefaultToolkit().beep();

						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}

			}
		};
		Timer timer = new Timer("Timer");

		long delay = 60000L;
		long period = 60000L;
		timer.scheduleAtFixedRate(repeatedTask, delay, period);

	}

	public static String alarmTid() {

		String tid;
		tid = JOptionPane.showInputDialog("ange tiden på formen 00:00");

		return tid;
	}

}
