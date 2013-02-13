package jp.ktsystem.ambitious.designpattern.builder;

public class Main {

	public static void main(String[] argus) {
		new Builder("1").add("2").add("3").build();
	}

}
