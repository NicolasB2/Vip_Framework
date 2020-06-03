package state.SITPProduct;

import java.util.ArrayList;

import state.SystemStateProduct;
import state.ProductInterface.AbstracModelFactory;
import state.ProductInterface.IBus;
import state.ProductInterface.IPlan;
import state.ProductInterface.IRute;
import state.ProductInterface.IStop;

public class SITPConcreteFactory implements AbstracModelFactory {

	@Override
	public SystemStateProduct createProduct(int type) {
		return null;
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

}