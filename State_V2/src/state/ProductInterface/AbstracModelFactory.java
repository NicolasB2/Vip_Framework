package state.ProductInterface;

import state.SystemStateProduct;

public interface AbstracModelFactory {

	SystemStateProduct createProduct(int type);

}