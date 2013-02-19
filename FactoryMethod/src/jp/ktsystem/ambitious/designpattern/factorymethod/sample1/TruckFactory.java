package jp.ktsystem.ambitious.designpattern.factorymethod.sample1;

/**
 * <h1>Factory class for Sample of (Abstract)Factory pattern.</h1>
 *
 * @author KTSystem_RyoichiObara
 * @since 2013/1/21
 */
public class TruckFactory extends AbstractCarFactory {

	@Override
	public Car createCar() {
		return new CarTruck();
	}

}
