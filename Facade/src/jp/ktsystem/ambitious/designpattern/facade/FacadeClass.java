package jp.ktsystem.ambitious.designpattern.facade;

public class FacadeClass {

	private FacadeClass() {}

	public static void execute() {

		try {
			// ややこしい処理
			LogicA1 a1 = new LogicA1();
			a1.execute();
	
			LogicA2 a2 = new LogicA2();
			a2.execute();
	
			LogicA3 a3 = new LogicA3();
			a3.execute();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
