package godOfJava2nd.ch24;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapSample {
	public static void main(String[] args) {
		MapSample sample = new MapSample();
//		sample.checkHashMap();
//		sample.checkKeySet();
//		sample.checkValues();
//		sample.checkHashMapEntry();
		sample.checkContains();
		sample.checkRemove();
	}
	public void checkHashMap() {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("A", "a");
		System.out.println(map.get("A"));
		map.put("A", "n");
		System.out.println(map.get("A"));
	}
	public void checkKeySet() {
		HashMap<String, String> map = new HashMap<>();
		map.put("A","a");
		map.put("C","c");
		map.put("D","d");
		Set<String> set = map.keySet();
		for(String tempKey : set) {
			System.out.println(map.get(tempKey));
		}
	}
	public void checkValues() {
		HashMap<String, String> map = new HashMap<>();
		map.put("A","a");
		map.put("C","c");
		map.put("D","d");
		Collection<String> c = map.values();
		
		for(String tempStr : c) {
			System.out.println(tempStr);
		}
	}
	public void checkHashMapEntry() {
		HashMap<String, String> map = new HashMap<>();
		map.put("A","a");
		map.put("C","c");
		map.put("D","d");
		map.put("B","b");
		
		Set<Map.Entry<String, String>> entry = map.entrySet();
		
		for(Map.Entry<String, String> tempEntry : entry) {
			System.out.println(tempEntry.getKey() + " = " +tempEntry.getValue());
		}
	}
	public void checkContains() {
		HashMap<String, String> map = new HashMap<>();
		map.put("A","a");
		map.put("C","c");
		map.put("D","d");
		map.put("B","b");
		
		System.out.println(map.containsKey("A"));
		System.out.println(map.containsKey("Z"));
		System.out.println(map.containsValue("a"));
		System.out.println(map.containsValue("z"));
	}
	public void checkRemove() {
		HashMap<String, String> map = new HashMap<>();
		map.put("A","a");
		System.out.println(map.size());
		map.remove("A");
		System.out.println(map.size());
	}
}
