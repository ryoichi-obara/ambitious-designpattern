package jp.ktsystem.ambitious.designpattern.sample.obara;

public class Main {

	public static void main(String[] args) {
		Question admin = new Administrator();

		Genre genre = Genre.VBA;
		String message = null;

		String ans = admin.ask(genre, message);
		System.out.println(ans);
	}

}
