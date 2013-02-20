package jp.ktsystem.ambitious.designpattern.decorator;

public class Main {

	public static void main(String[] args) {

		// Call decorator class from calling source.
		DecoratorClass d = new DecoratorClass();
		d.exec(1);
	}

}
