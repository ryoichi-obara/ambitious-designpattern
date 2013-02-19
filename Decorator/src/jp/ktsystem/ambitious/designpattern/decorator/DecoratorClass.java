package jp.ktsystem.ambitious.designpattern.decorator;

public class DecoratorClass {

	// Method signature is same as original one.
	public void exec(int i) {

		// We can do some processes here.

		// Original process.
		OriginalClass c = new OriginalClass();
		c.exec(i);

		// We can do some processes here.
	}
}
