package godOfJava2nd.ch21;

import java.io.Serializable;

public class CastingDTO<T> implements Serializable {
	private T obj;
	public void setObj(T obj) {
		this.obj = obj;
	}
	public Object getObj() {
		return obj;
	}
	
}
