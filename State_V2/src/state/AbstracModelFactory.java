package state;

import java.util.ArrayList;

public interface AbstracModelFactory {

	SystemStateProduct createProduct(int type);

	ArrayList<IBus> createBus();

	ArrayList<IRute> createRute();

	ArrayList<IStop> createStop();

	ArrayList<IPlan> createPlane();

}