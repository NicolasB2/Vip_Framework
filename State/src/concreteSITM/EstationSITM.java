package concreteSITM;

import java.awt.Point;

import productFamilies.IEstation;

public class EstationSITM implements IEstation {

	private String name;
	private Point location;
	
	public EstationSITM() {
	}

	public EstationSITM(String name, Point location) {
		super();
		this.name = name;
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Point getLocation() {
		return location;
	}

	public void setLocation(Point location) {
		this.location = location;
	}
	
	
	
}
