package godOfJava2nd.ch25.object;

public class RunObjectThreads {
	public static void main(String[] args) {
		RunObjectThreads sample = new RunObjectThreads();
		sample.checkThreadState2();
	}

	public void checkThreadState2() {
		Object monitor = new Object();
		StateThread thread = new StateThread(monitor);
		StateThread thread2 = new StateThread(monitor);
		try {
			System.out.println("thread state="+thread.getState());
			thread.start();
			thread2.start();
			System.out.println("thread state(after start)="+thread.getState());
			
			Thread.sleep(100);
			System.out.println("thread state(after 0.1sec)="+thread.getState());
			
			synchronized(monitor) {
				monitor.notify();
//				monitor.notifyAll();
			}
			Thread.sleep(100);
			System.out.println("thread state(after notify)="+thread.getState());
			
			thread.join();
			thread2.join();
			System.out.println("thread state(after join)="+thread.getState());
			System.out.println("thread2 state(after join)="+thread2.getState());
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
