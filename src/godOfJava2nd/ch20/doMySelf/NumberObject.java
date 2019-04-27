package godOfJava2nd.ch20.doMySelf;

public class NumberObject {
	public static void main(String[] args) {
		NumberObject sample = new NumberObject();
		String data = "e`1";
		long number = sample.parseLong(data);
		System.out.println(number);
		sample.printOtherBase(number);
	}
	public long parseLong(String data) {
		Long number = -1L;
		
		try {
			number = Long.parseLong(data);
		} catch (NumberFormatException e) {
			System.out.println(data + " is not a number.");
		}
		
		return number;
	}
	public void printOtherBase(long value) {
		String binary = Long.toBinaryString(value);
		String hex = Long.toHexString(value);
		String octal = Long.toOctalString(value);
		
		System.out.println("Origin : " + value);
		System.out.println("Hex : " + hex);
		System.out.println("Octal : " + octal);
	}
}
