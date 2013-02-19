package jp.ktsystem.ambitious.designpattern.bean;

public class Main {

	public static void main(String[] args) {

		AbstractClass c1 = create();
		c1.commonProcess();
	}

	
	private static AbstractClass create() {
		return new ConcreteClass2();
	}
}
