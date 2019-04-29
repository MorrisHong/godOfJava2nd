package godOfJava2nd.ch25.doMySelf;

import java.util.Date;

public class TimerThread extends Thread{
	@Override
	public void run() {
		TimerThread sample = new TimerThread();
		sample.printCurrentTime();
		
	}

	public void printCurrentTime() {
		
		for(int i = 0; i < 10; i++) {
			Date date = new Date();
			System.out.println(date.toString());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
