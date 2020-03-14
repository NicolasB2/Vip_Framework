package concreteSITM;

import java.awt.Point;

import productFamilies.IBus;

public class BusSITM implements IBus{

	private String licencePlate;
	private String model;
	private String type;
	private String concessinaire;
	private Point actualPosition;
	private Point nextPosition;
	private Long timeLocation;
	
	public BusSITM() {
	}
	
	public BusSITM(String licencePlate, String model, String concessinaire,String type, Point actualPosition, Point nextPosition,
			Long timeLocation) {
		super();
		this.licencePlate = licencePlate;
		this.model = model;
		this.concessinaire = concessinaire;
		this.actualPosition = actualPosition;
		this.nextPosition = nextPosition;
		this.timeLocation = timeLocation;
	}

	public String getLicencePlate() {
		return licencePlate;
	}

	public void setLicencePlate(String licencePlate) {
		this.licencePlate = licencePlate;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getConcessinaire() {
		return concessinaire;
	}

	public void setConcessinaire(String concessinaire) {
		this.concessinaire = concessinaire;
	}

	public Point getActualPosition() {
		return actualPosition;
	}

	public void setActualPosition(Point actualPosition) {
		this.actualPosition = actualPosition;
	}

	public Point getNextPosition() {
		return nextPosition;
	}

	public void setNextPosition(Point nextPosition) {
		this.nextPosition = nextPosition;
	}

	public Long getTimeLocation() {
		return timeLocation;
	}

	public void setTimeLocation(Long timeLocation) {
		this.timeLocation = timeLocation;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
