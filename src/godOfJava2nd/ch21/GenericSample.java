package godOfJava2nd.ch21;

public class GenericSample {
	public static void main(String[] args) {
		GenericSample sample = new GenericSample();
		sample.checkCastingDTO();
	}
	public void checkCastingDTO() {
		CastingDTO dto1 = new CastingDTO();
		dto1.setObj(new String());
		
		CastingDTO dto2 = new CastingDTO();
		dto2.setObj(new StringBuffer());
		
		CastingDTO dto3 = new CastingDTO();
		dto3.setObj(new StringBuilder());
	}
}
