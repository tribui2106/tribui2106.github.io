package yap.commands.common;

import java.util.HashMap;
import java.util.Map;

public class ExecutionContext {
	
	private Map<String,Object> contextList = new HashMap<>();
	
	public void addContext(String key, Object value) {
		contextList.put(key, value);
	}
	
	public Object getContext(String key) {
		return contextList.get(key);		
	}

}
