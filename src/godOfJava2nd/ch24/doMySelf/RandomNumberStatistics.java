package godOfJava2nd.ch24.doMySelf;

import java.util.Hashtable;
import java.util.Random;
import java.util.Set;

public class RandomNumberStatistics {
	private final int DATA_BOUNDARY = 50;
	Hashtable<Integer, Integer> hashtable = new Hashtable<>();
	
	public static void main(String[] args) {
		RandomNumberStatistics r = new RandomNumberStatistics();
		r.getRandomNumberStatistics();
		
	}
	public void getRandomNumberStatistics() {
		for(int i = 0; i < 5000; i++) {
			Random r = new Random();
			int num = r.nextInt(DATA_BOUNDARY) + 1;
			putCurrentNumber(num);
		}
		printStatistics();
	}
	public void putCurrentNumber(int tempNumber) {
		if(hashtable.containsKey(tempNumber)) {
			hashtable.put(tempNumber, hashtable.get(tempNumber) + 1);
		}else {
			hashtable.put(tempNumber, 1);
		}
	}
	public void printStatistics() {
		Set<Integer> set = hashtable.keySet();
		for(int key : set) {
			System.out.printf("%2d = %5d   ",key, hashtable.get(key));
			if(key % 10 - 1 == 0) System.out.println();
		}
	}
	
}
