package godOfJava2nd.ch25.support;

public class SleepThread extends Thread {
	long sleepTime;
	public SleepThread(long sleepTime) {
		this.sleepTime = sleepTime;
	}
	@Override
	public void run() {
		try {
			System.out.println("Sleeping "+getName());
			Thread.sleep(sleepTime);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
	}
}
