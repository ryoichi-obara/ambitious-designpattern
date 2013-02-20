package jp.ktsystem.ambitious.designpattern.proxy;

public class Main {

	public static void main(String[] args) {

		IfOriginalClass c = obtainProcessClass();
		c.exec(1);
	}

	private static IfOriginalClass obtainProcessClass() {
		return new ProxyClass();
	}

}
