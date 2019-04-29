package godOfJava2nd.ch25.support;

public class RunSupportThreads {
	public static void main(String[] args) {
		RunSupportThreads sample = new RunSupportThreads();
//		sample.checkThreadState1();
		sample.checkThreadJoin();
	}
	public void checkThreadState1() {
		SleepThread thread = new SleepThread(2000);
		try {
			System.out.println("thread state : " +thread.getState());
			thread.start();
			System.out.println("thread state(after start) : " + thread.getState());
			
			Thread.sleep(1000);
			System.out.println("thread state(after 1sec) : " +thread.getState());
			
			thread.join();
			thread.interrupt();
			System.out.println("thread state(after join) : "+thread.getState());
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
	}
	public void checkThreadJoin() {
		SleepThread thread = new SleepThread(2000);
		try {
			thread.start();
			thread.join(2000);
			thread.interrupt();
			System.out.println("thread state : "+thread.getState());
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
	}
}
