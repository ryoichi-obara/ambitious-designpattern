package jp.ktsystem.ambitious.designpattern.sample.obara;

public class JavaPro extends AbstractQuestion {

	@Override
	public Genre getExpart() {
		return Genre.JAVA;
	}

	@Override
	protected String getMessage() {
		return "http://docs.oracle.com/javase/6/docs/api/";
	}

}
