package godOfJava2nd.ch23;

import java.util.HashSet;
import java.util.Set;

public class SetSample {
	public static void main(String[] args) {
		SetSample sample = new SetSample();
		String[] cars = new String[] {
				"Tico","Sonata","BMW","Benz",
				"Lexus", "Mustang", "sm5","Mini",
				"sm5","Lexus"
		};
		System.out.println(sample.getCarKinds(cars));
		
	}
	
	public int getCarKinds(String[] cars) {
		if(cars == null) return 0;
		if(cars.length == 1) return 1;
		Set<String> carSet = new HashSet<>();
		for(String car : cars) {
			carSet.add(car);
		}
		
		printCarSet(carSet);
		return carSet.size();
	}
	
	public void printCarSet(Set<String> carSet) {
		for(String car : carSet) {
			System.out.println(car);
		}
	}
}
