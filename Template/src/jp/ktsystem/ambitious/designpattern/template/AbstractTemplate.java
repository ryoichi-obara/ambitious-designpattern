package jp.ktsystem.ambitious.designpattern.template;

public abstract class AbstractTemplate {

	public void execute() throws Exception {
		initialize();
		try {
			execMain();
		} finally {
			afterExec();
		}
	}

	protected abstract void initialize();
	protected abstract void execMain();
	protected abstract void afterExec();

}
