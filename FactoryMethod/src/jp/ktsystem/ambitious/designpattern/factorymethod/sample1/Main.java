package jp.ktsystem.ambitious.designpattern.factorymethod.sample1;

/**
 * <h1>Sample of (Abstract)Factory pattern.</h1>
 *
 * @author KTSystem_RyoichiObara
 * @since 2013/1/21
 */
public class Main {

	public static void main(String[] argus) {

		AbstractCarFactory carFactory = new BusFactory();
		Car car = carFactory.createCar();
		car.getName();

		AbstractCarFactory truckFactory = new TruckFactory();
		Car truck = truckFactory.createCar();
		truck.getName();

	}

}
