package programmering1_bte18.grafikswing;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Timertest {

	public static void main(String[] args) {

		TimerTask repeatedTask = new TimerTask() {
	        @Override
			public void run() {
	            System.out.println("Task performed on " + new Date());
	        }
	    };
	    Timer timer = new Timer("Timer");

	    long delay  = 1000L;
	    long period = 1000L;
	    timer.scheduleAtFixedRate(repeatedTask, delay, period);






	}


}
