package jp.ktsystem.ambitious.designpattern.factorymethod;

import jp.ktsystem.ambitious.designpattern.bean.AbstractClass;
import jp.ktsystem.ambitious.designpattern.bean.ConcreteClass1;
import jp.ktsystem.ambitious.designpattern.bean.ConcreteClass2;

/**
 * <h1>Factory method pattern.</h1>
 *
 * @author KTSystem_RyoichiObara
 * @since 2013/1/17
 */
public class FactoryMethodClass {

	/**
	 * Simple factory method.<br>
	 * @return AbstractClass; Depends on FactoryMethodClass.
	 */
	public static AbstractClass create() {
		return new ConcreteClass1();
	}

	/**
	 * Simple factory method.<br>
	 *
	 * @param id of concrete class.
	 * @return Concrete class
	 */
	public static AbstractClass create(int id) {

		if (1 == id) {
			return new ConcreteClass1();
		} else if (2 == id) {
			return new ConcreteClass2();
		} else {
			throw new RuntimeException();
		}
	}

}
