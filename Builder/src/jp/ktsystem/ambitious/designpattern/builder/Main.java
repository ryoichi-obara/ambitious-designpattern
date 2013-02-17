package jp.ktsystem.ambitious.designpattern.builder;

public class Main {

	public static void main(String[] argus) {
		Builder b = new Builder("1");
		b.add("2").add("3");
		System.out.println(b.build());
		
		
		
		StringBuilder s = new StringBuilder();
		s.append("a").append("p").append("p").append("l").append("e");

		System.out.println(s.toString());
	}

}
