package factories;

import java.util.ArrayList;

import model.SystemStateProducte;
import productFamilies.IBus;
import productFamilies.IEstation;
import productFamilies.IPlane;
import productFamilies.IRoute;
import productFamilies.IStop;

public abstract class AbstractModelFactory {
	
	public SystemStateProducte createProduct(String type) {
		createBus();
		createEstations();
		createPlanes();
		createRoutes();
		createStops();
		return null;
	}
	
	private ArrayList<IBus> createBus(){
		return null;
	}
	
	private ArrayList<IEstation> createEstations(){
		return null;
	}
	
	private ArrayList<IPlane> createPlanes(){
		return null;
	}
	
	private ArrayList<IRoute> createRoutes(){
		return null;
	}
	
	private ArrayList<IStop> createStops(){
		return null;
	}

}
