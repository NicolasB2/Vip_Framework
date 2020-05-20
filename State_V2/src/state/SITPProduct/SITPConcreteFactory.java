package state.SITPProduct;

import java.util.ArrayList;

import state.SystemStateProduct;
import state.ProductInterface.AbstracModelFactory;
import state.ProductInterface.IBus;
import state.ProductInterface.IPlan;
import state.ProductInterface.IRute;
import state.ProductInterface.IStop;

public class SITPConcreteFactory implements AbstracModelFactory {

	public void ConcreteSITPFactory() {
		throw new UnsupportedOperationException();
	}

	public SystemStateProduct createProducto(int type) {
		throw new UnsupportedOperationException();
	}

	private ArrayList<IBus> createBuses() {
		throw new UnsupportedOperationException();
	}

	private ArrayList<IRute> createRutes() {
		throw new UnsupportedOperationException();
	}

	private ArrayList<IStop> createStops() {
		throw new UnsupportedOperationException();
	}

	private ArrayList<IPlan> createPlanes() {
		throw new UnsupportedOperationException();
	}

	@Override
	public SystemStateProduct createProduct(int type) {
		return null;
	}

	@Override
	public ArrayList<IBus> createBus() {
		return null;
	}

	@Override
	public ArrayList<IRute> createRute() {
		return null;
	}

	@Override
	public ArrayList<IStop> createStop() {
		return null;
	}

	@Override
	public ArrayList<IPlan> createPlane() {
		return null;
	}

}