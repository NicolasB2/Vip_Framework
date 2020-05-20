package state.ProductInterface;

import java.util.ArrayList;

import state.SystemStateProduct;

public interface AbstracModelFactory {

	SystemStateProduct createProduct(int type);

	ArrayList<IBus> createBus();

	ArrayList<IRute> createRute();

	ArrayList<IStop> createStop();

	ArrayList<IPlan> createPlane();

}