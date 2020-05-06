package state;

import java.util.ArrayList;
@SuppressWarnings("unused")
public class SITMConcreteFactory implements AbstracModelFactory {

	public void ConcreteSITMFactory() {
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