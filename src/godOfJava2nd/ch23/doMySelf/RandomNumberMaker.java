package godOfJava2nd.ch23.doMySelf;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomNumberMaker {
	public static void main(String[] args) {
		RandomNumberMaker maker = new RandomNumberMaker();
		for(int i = 0; i < 10; i++) {
			Set<Integer> set = maker.getSixNumber();
			System.out.println(set);
		}
	}
	
	public HashSet<Integer> getSixNumber(){
		HashSet<Integer> set = new HashSet<>();
		Random random = new Random();
		
		while(set.size() <= 6) {
			int num = random.nextInt(45);
			set.add(num);
		}
		
		return set;
	}
}
