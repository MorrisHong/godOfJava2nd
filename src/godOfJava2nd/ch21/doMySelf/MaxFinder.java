package godOfJava2nd.ch21.doMySelf;

public class MaxFinder {
	public static void main(String[] args) {
		MaxFinder sample = new MaxFinder();
		sample.testGetMax();
		sample.testGetMin();
	}
	public void testGetMax() {
		System.out.println(getMax(1,2,3));
		System.out.println(getMax(3,1,2));
		System.out.println(getMax(2,3,1));
		
		System.out.println(getMax("a","b","c"));
		System.out.println(getMax("b","c","a"));
		System.out.println(getMax("a","b","c"));
	}
	public void testGetMin() {
		System.out.println(getMin(1,2,3));
		System.out.println(getMin(3,1,2));
		System.out.println(getMin(2,3,1));
		
		System.out.println(getMin("a","b","c"));
		System.out.println(getMin("b","c","a"));
		System.out.println(getMin("a","b","c"));

	}
	
	public <T extends Comparable<T>> T getMax(T ... a) {
		T max = a[0];
		for(T tmp : a) {
			if(tmp.compareTo(max) > 0) {
				max = tmp;
			}
		}
		return max;
	}
	
	public <T extends Comparable<T>> T getMin(T ...a) {
		T min = a[0];
		for(T tmp : a) {
			if(tmp.compareTo(min) < 0) {
				min = tmp;
			}
		}
		return min;
	}
}
