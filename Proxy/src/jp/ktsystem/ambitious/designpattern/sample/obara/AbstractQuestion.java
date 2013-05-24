package jp.ktsystem.ambitious.designpattern.sample.obara;

public abstract class AbstractQuestion implements Question {

	@Override
	public String ask(Genre genre, String message) {
		if (getExpart() == genre) {
			return getMessage();
		}

		return null;
	}

	protected abstract Genre getExpart();
	protected abstract String getMessage();

}
