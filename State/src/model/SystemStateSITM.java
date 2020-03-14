package model;

import concreteSITM.BusSITM;
import concreteSITM.EstationSITM;
import concreteSITM.PlaneSITM;
import concreteSITM.RouteSITM;
import concreteSITM.StopSITM;
import productFamilies.IBus;
import productFamilies.IEstation;
import productFamilies.IPlane;
import productFamilies.IRoute;
import productFamilies.IStop;

public class SystemStateSITM extends SystemStateProducte {

	private IBus findBusById(String id) {
		
		for (int i = 0; i < buses.size(); i++) {
			BusSITM concreteBus = (BusSITM)buses.get(i);
			if (concreteBus.getLicencePlate().equals(id)) {
				return concreteBus;
			}
		}
		return null;
	}
	
	private IPlane findPlanesById(String id) {
		for (int i = 0; i < planes.size(); i++) {
			PlaneSITM concretePlane = (PlaneSITM)planes.get(i);
			if (concretePlane.getId().equals(id)) {
				return concretePlane;
			}
		}
		return null;
	}
	
	private IEstation findEstationsById(String id) {
		for (int i = 0; i < estations.size(); i++) {
			EstationSITM concreteEstation = (EstationSITM)estations.get(i);
			if (concreteEstation.getName().equals(id)) {
				return concreteEstation;
			}
		}
		return null;
	}
	
	private IRoute findRoutesById(String id) {
		for (int i = 0; i < routes.size(); i++) {
			RouteSITM concreteRoute = (RouteSITM)routes.get(i);
			if (concreteRoute.getId().equals(id)) {
				return concreteRoute;
			}
		}
		return null;
	}
	
	private IStop findStopsById(String id) {
		for (int i = 0; i < stops.size(); i++) {
			StopSITM concreteStop = (StopSITM)stops.get(i);
			if (concreteStop.getId().equals(id)) {
				return concreteStop;
			}
		}
		return null;
	}
}
