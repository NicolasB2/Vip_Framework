package model;

import concreteSITM.BusSITM;
import concreteSITM.EstationSITM;
import concreteSITM.PlanSITM;
import concreteSITM.RouteSITM;
import concreteSITM.StopSITM;
import productFamilies.IBus;
import productFamilies.IEstation;
import productFamilies.IPlan;
import productFamilies.IRoute;
import productFamilies.IStop;

public class SystemStateSITM extends SystemStateProducte {

	private IBus findBusById(String id) {

		for (int i = 0; i < buses.size(); i++) {
			BusSITM concreteBus = (BusSITM) buses.get(i);
			if (concreteBus.getLicencePlate().equals(id)) {
				return concreteBus;
			}
		}
		return null;
	}

	private IPlan findPlanesById(String id) {
		for (int i = 0; i < plans.size(); i++) {
			PlanSITM concretePlane = (PlanSITM) plans.get(i);
			if (concretePlane.getId().equals(id)) {
				return concretePlane;
			}
		}
		return null;
	}

	private IEstation findEstationsById(String id) {
		for (int i = 0; i < estations.size(); i++) {
			EstationSITM concreteEstation = (EstationSITM) estations.get(i);
			if (concreteEstation.getName().equals(id)) {
				return concreteEstation;
			}
		}
		return null;
	}

	private IRoute findRoutesById(String id) {
		for (int i = 0; i < routes.size(); i++) {
			RouteSITM concreteRoute = (RouteSITM) routes.get(i);
			if (concreteRoute.getId().equals(id)) {
				return concreteRoute;
			}
		}
		return null;
	}

	private IStop findStopsById(String id) {
		for (int i = 0; i < stops.size(); i++) {
			StopSITM concreteStop = (StopSITM) stops.get(i);
			if (concreteStop.getId().equals(id)) {
				return concreteStop;
			}
		}
		return null;
	}

	private void updateBusById(String id) {

		for (int i = 0; i < buses.size(); i++) {
			BusSITM concreteBus = (BusSITM) buses.get(i);
			if (concreteBus.getLicencePlate().equals(id)) {
				
			}
		}
	}

	private void updatePlanesById(String id) {
		for (int i = 0; i < plans.size(); i++) {
			PlanSITM concretePlane = (PlanSITM) plans.get(i);
			if (concretePlane.getId().equals(id)) {

			}
		}

	}

	private void updateEstationsById(String id) {
		for (int i = 0; i < estations.size(); i++) {
			EstationSITM concreteEstation = (EstationSITM) estations.get(i);
			if (concreteEstation.getName().equals(id)) {
				
			}
		}
		
	}

	private void updateRoutesById(String id) {
		for (int i = 0; i < routes.size(); i++) {
			RouteSITM concreteRoute = (RouteSITM) routes.get(i);
			if (concreteRoute.getId().equals(id)) {
				
			}
		}
		
	}

	private void updateStopsById(String id) {
		for (int i = 0; i < stops.size(); i++) {
			StopSITM concreteStop = (StopSITM) stops.get(i);
			if (concreteStop.getId().equals(id)) {
				
			}
		}
		
	}

	private void addBus(BusSITM bus) {
		buses.add(bus);
	}

	private void addEstation(EstationSITM estation) {
		estations.add(estation);
	}

	private void addPlane(PlanSITM plane) {
		plans.add(plane);
	}

	private void addRoute(RouteSITM route) {
		routes.add(route);
	}

	private void addStop(StopSITM stop) {
		stops.add(stop);
	}

}
