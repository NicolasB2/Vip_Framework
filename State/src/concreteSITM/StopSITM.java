package concreteSITM;

import java.awt.Point;

import productFamilies.IStop;

public class StopSITM implements IStop {

	private String id;
	private Point location;
	
	public StopSITM() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StopSITM(String id, Point location) {
		super();
		this.id = id;
		this.location = location;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Point getLocation() {
		return location;
	}

	public void setLocation(Point location) {
		this.location = location;
	}
	
	
}
