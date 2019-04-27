package godOfJava2nd.ch21;

public class WildcardSample {
	public static void main(String[] args) {
		WildcardSample sample = new WildcardSample();
		sample.callWildcardMethod();
	}
	public void callWildcardMethod() {
		WildcardGeneric<String> wildcard = new WildcardGeneric<>();
		wildcard.setWildcard("A");
		wildcardStringMethod(wildcard);
		
		wildcardMethod(wildcard);
	}
	
	public void wildcardStringMethod(WildcardGeneric<String> wildcard) {
		String value = wildcard.getWildcard();
		System.out.println(value);
	}
	
	public void wildcardMethod(WildcardGeneric<?> wildcard) {
		Object obj = wildcard.getWildcard();
		if(obj instanceof String) {
			String str = (String)obj;
			System.out.println(str);
		}else {
			System.out.println("이건 무슨타입..?");
		}
	}

}
