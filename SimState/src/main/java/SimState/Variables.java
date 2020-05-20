package SimState;

import java.util.HashMap;
import java.util.Hashtable;

public class Variables {
	
	private HashMap<String, Object> headersVariables;

	public Variables() {
		headersVariables = new HashMap<>();
	}
	
	public void addVariables(String[] headers) {
		for (int i = 0; i < headers.length; i++) {
			headersVariables.put(headers[i], "");
		}
	}
	
	public void addVariable(String variable,String type, Hashtable<String,Object>args) { 
		//Probabilistic distribution its a class from other component
		//this class have to be added in the integration phase
		ProbabilisticDistribution distribution = new ProbabilisticDistribution(type, args);
		headersVariables.put(variable,distribution);
	}
	
	public void deletedVariable(String variable) {
		headersVariables.remove(variable);
	}
	
	public void updateVariable(String variable, String value) {
		headersVariables.replace(variable, value);
	}
	
	public String getVariableValue(String variable) {
		
		if(headersVariables.containsKey(variable)) {
			if (headersVariables.get(variable) instanceof String) {
				String value = (String) headersVariables.get(variable);
				return value;
			}
			
			if (headersVariables.get(variable) instanceof ProbabilisticDistribution) {
				ProbabilisticDistribution value = (ProbabilisticDistribution) headersVariables.get(variable);
				return value.getNextDistributionValue()+"";
			}
		}
		
		return null;
	}
	
	public Object[] getVariablesHeaders() {
		return  headersVariables.keySet().toArray();
	}
	
}
