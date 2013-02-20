package jp.ktsystem.ambitious.designpattern.decorator;

public class DecoratorClass { // Unnecessary to extend.

	// Method signature is same as original one.
	public void exec(int i) {

		// We can do some processes before original process.

		// Original process.
		OriginalClass c = new OriginalClass();
		c.exec(i);

		// We can do some processes after original process.
	}
}
