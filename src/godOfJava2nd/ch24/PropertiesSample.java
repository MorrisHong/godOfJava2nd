package godOfJava2nd.ch24;

import java.util.Properties;
import java.util.Set;

public class PropertiesSample {
	public static void main(String[] args) {
		PropertiesSample sample = new PropertiesSample();
		sample.checkProperties();
	}
	public void checkProperties() {
		Properties prop = System.getProperties();
		Set<Object> keySet = prop.keySet();
		for(Object obj : keySet) {
			System.out.println(obj+" = " +prop.get(obj));
		}
	}
}
