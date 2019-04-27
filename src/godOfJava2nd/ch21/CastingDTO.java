package godOfJava2nd.ch21;

import java.io.Serializable;

public class CastingDTO implements Serializable {
	private Object obj;
	public void setObj(Object obj) {
		this.obj = obj;
	}
	public Object getObj() {
		return obj;
	}
	
}
