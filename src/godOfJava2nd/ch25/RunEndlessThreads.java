package godOfJava2nd.ch25;

public class RunEndlessThreads {
	public static void main(String[] args) {
		RunEndlessThreads sample = new RunEndlessThreads();
		sample.endless();
	}
	public void endless() {
		EndlessThread t = new EndlessThread();
		t.start();
	}
}
