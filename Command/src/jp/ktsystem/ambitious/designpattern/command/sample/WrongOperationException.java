package jp.ktsystem.ambitious.designpattern.command.sample;

public class WrongOperationException extends RuntimeException {

	private static final long serialVersionUID = 9029690924012422113L;

	private final Object reason;

	// ----- Constructor

	public WrongOperationException(Object reason) {
		this.reason = reason;
	}

	// ----- Getter

	public Object getReason() {
		return reason;
	}

}
