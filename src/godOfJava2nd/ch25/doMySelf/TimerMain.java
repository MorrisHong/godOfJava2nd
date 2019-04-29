package godOfJava2nd.ch25.doMySelf;

public class TimerMain {
	public static void main(String[] args) {
		TimerThread tread = new TimerThread();
		tread.start();
	}
}
