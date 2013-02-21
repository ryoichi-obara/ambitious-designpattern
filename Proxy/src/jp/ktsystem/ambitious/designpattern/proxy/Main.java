package jp.ktsystem.ambitious.designpattern.proxy;

public class Main {

	public static void main(String[] args) {

		IfOriginalClass c = create();
		c.exec(1);
	}

	private static IfOriginalClass create() {
		return new ProxyClass();
	}

}
