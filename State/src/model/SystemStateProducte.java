package model;

import java.util.ArrayList;

import productFamilies.IBus;
import productFamilies.IEstation;
import productFamilies.IPlan;
import productFamilies.IRoute;
import productFamilies.IStop;

public class SystemStateProducte {

	protected ArrayList<IBus>buses;
	protected ArrayList<IPlan> plans;
	protected ArrayList<IEstation> estations;
	protected ArrayList<IRoute> routes;
	protected ArrayList<IStop> stops;
	
	public ArrayList<IBus> getBuses() {
		return buses;
	}
	public void setBuses(ArrayList<IBus> buses) {
		this.buses = buses;
	}
	public ArrayList<IPlan> getPlanes() {
		return plans;
	}
	public void setPlanes(ArrayList<IPlan> planes) {
		this.plans = plans;
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
