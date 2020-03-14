package model;

import java.util.ArrayList;

import productFamilies.IBus;
import productFamilies.IEstation;
import productFamilies.IPlane;
import productFamilies.IRoute;
import productFamilies.IStop;

public class SystemStateProducte {

	protected ArrayList<IBus>buses;
	protected ArrayList<IPlane> planes;
	protected ArrayList<IEstation> estations;
	protected ArrayList<IRoute> routes;
	protected ArrayList<IStop> stops;
	
	public ArrayList<IBus> getBuses() {
		return buses;
	}
	public void setBuses(ArrayList<IBus> buses) {
		this.buses = buses;
	}
	public ArrayList<IPlane> getPlanes() {
		return planes;
	}
	public void setPlanes(ArrayList<IPlane> planes) {
		this.planes = planes;
	}
	public ArrayList<IEstation> getEstations() {
		return estations;
	}
	public void setEstations(ArrayList<IEstation> estations) {
		this.estations = estations;
	}
	public ArrayList<IRoute> getRoutes() {
		return routes;
	}
	public void setRoutes(ArrayList<IRoute> routes) {
		this.routes = routes;
	}
	public ArrayList<IStop> getStops() {
		return stops;
	}
	public void setStops(ArrayList<IStop> stops) {
		this.stops = stops;
	}
	
	
	
}
