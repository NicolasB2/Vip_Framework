package concreteSITM;

import productFamilies.IRoute;

public class RouteSITM implements IRoute{

	private String id;
	private String name;
	private String dscription;
	public RouteSITM() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RouteSITM(String id, String name, String dscription) {
		super();
		this.id = id;
		this.name = name;
		this.dscription = dscription;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDscription() {
		return dscription;
	}
	public void setDscription(String dscription) {
		this.dscription = dscription;
	}
	
	
}
