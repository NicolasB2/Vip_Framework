package SimState;

import java.util.HashMap;
import java.util.Set;

public class Variables {
	
	private HashMap<String, String> headersVariables;

	public Variables() {
		headersVariables = new HashMap<>();
	}
	
	public void addVariables(String[] headers) {
		for (int i = 0; i < headers.length; i++) {
			headersVariables.put(headers[i], "");
		}
	}
	
	public void deletedVariable(String variable) {
		headersVariables.remove(variable);
	}
	
	public void updateVariable(String variable, String value) {
		headersVariables.replace(variable, value);
	}
	
	public String getVariableValue(String value) {
		if(headersVariables.containsKey(value)) {
			return headersVariables.get(value);
		}
		return null;
	}
	
	public Object[] getVariablesHeaders() {
		return  headersVariables.keySet().toArray();
	}
}
