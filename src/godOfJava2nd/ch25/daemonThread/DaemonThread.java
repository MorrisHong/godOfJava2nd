package godOfJava2nd.ch25.daemonThread;

public class DaemonThread extends Thread{
	@Override
	public void run() {
		try {
			Thread.sleep(Long.MAX_VALUE);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
	}
	
}
