package factories;

import java.util.ArrayList;

import model.SystemStateProducte;
import productFamilies.IBus;
import productFamilies.IEstation;
import productFamilies.IPlan;
import productFamilies.IRoute;
import productFamilies.IStop;

public interface AbstractModelFactory {
	
	public SystemStateProducte createProduct(String type);
	public ArrayList<IBus> createBus();
	public ArrayList<IEstation> createEstations();
	public ArrayList<IPlan> createPlanes();
	public ArrayList<IRoute> createRoutes();	
	public ArrayList<IStop> createStops();

}
