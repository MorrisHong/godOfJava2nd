package godOfJava2nd.ch25.daemonThread;

import godOfJava2nd.ch25.ThreadSample;

public class RunDaemonThreads {
	public static void main(String[] args) {
		RunDaemonThreads sample = new RunDaemonThreads();
		sample.checkThreadProperty();
//		sample.runCommonThread();
		sample.runDaemonThread();
	}

	public void checkThreadProperty() {
		ThreadSample thread1 = new ThreadSample();
		ThreadSample thread2 = new ThreadSample();
		ThreadSample daemonThread = new ThreadSample();

		System.out.println("thread1 id = " + thread1.getId());
		System.out.println("thread2 id = " + thread2.getId());

		System.out.println("thread1 name = " + thread1.getName());
		System.out.println("thread2 name = " + thread2.getName());

		System.out.println("thread1 prioty = " + thread1.getPriority());
		System.out.println("thread2 prioty = " + thread2.getPriority());

		daemonThread.setDaemon(true);
		System.out.println("thread1 isDaemon = " + thread1.isDaemon());
		System.out.println("daemonThread isDaemon = " + daemonThread.isDaemon());
	}

	public void runCommonThread() {
		DaemonThread thread = new DaemonThread();
		thread.start();
	}
	public void runDaemonThread() {
		DaemonThread thread = new DaemonThread();
		thread.setDaemon(true);
		thread.start();
	}
}
