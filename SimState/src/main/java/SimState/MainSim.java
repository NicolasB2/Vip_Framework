package SimState;


public class MainSim {

	public static void main(String[] args) {
		
		Variables v = new Variables();
		String[] dta = {"bus","station","parada"};
		v.addVariables(dta);
		System.out.println(v.getVariablesHeaders()[1]);
		v.updateVariable("bus", "efa654");
		System.out.println("funciono bitches "+ v.getVariableValue("bus"));
	}

}
