package godOfJava2nd.ch25.object;

public class StateThread extends Thread{
	private Object monitor;
	
	public StateThread(Object monitor) {
		this.monitor = monitor;
	}
	@Override
	public void run() {
		try {
			for(int i = 0; i < 10000; i++) {
				String a = "A";
			}
			
			synchronized(monitor) {
				monitor.wait();
			}
			System.out.println(getName() + " is notified");
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
