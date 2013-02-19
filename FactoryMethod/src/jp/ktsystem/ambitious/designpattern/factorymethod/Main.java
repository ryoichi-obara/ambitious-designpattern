package jp.ktsystem.ambitious.designpattern.factorymethod;

import jp.ktsystem.ambitious.designpattern.bean.AbstractClass;

/**
 * <h1>Main class</h1>
 *
 * @author KTSystem_RyoichiObara
 * @since 2013/1/17
 */
public class Main {

	public static void main(String[] argus) {

		AbstractClass c1 = FactoryMethodClass.create();
		c1.commonProcess();

		AbstractClass c2 = FactoryMethodClass.create(1);
		c2.commonProcess();
	}

}
