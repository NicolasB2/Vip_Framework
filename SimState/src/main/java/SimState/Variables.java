package SimState;

import java.util.HashMap;
import java.util.Hashtable;

public class Variables {
	
	private HashMap<String, Object> headersVariables;
//	private ProbabilisticDistribution probabilisticDistribution;

	public Variables() {
		headersVariables = new HashMap<>();
	}
	
	public void addVariables(String[] headers) {
		for (int i = 0; i < headers.length; i++) {
			headersVariables.put(headers[i], "");
		}
	}
	
	public void addVariable(String variable,String type, Hashtable<String,Object>args) { 
		//AbstractRealDistribution distribution = probabilisticDistribution.typeHandler(type, args);
		headersVariables.put(variable, "");
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
		}
//		else if (headersVariables.get(variable) instanceof AbstractRealDistribution) {
//			AbstractRealDistribution value = (AbstractRealDistribution) headersVariables.get(variable);
//			return value
//		}
		return null;
	}
	
	public Object[] getVariablesHeaders() {
		return  headersVariables.keySet().toArray();
	}

//	public ProbabilisticDistribution getProbabilisticDistribution() {
//		return probabilisticDistribution;
//	}
//
//	public void setProbabilisticDistribution(ProbabilisticDistribution probabilisticDistribution) {
//		this.probabilisticDistribution = probabilisticDistribution;
//	}
	
}
