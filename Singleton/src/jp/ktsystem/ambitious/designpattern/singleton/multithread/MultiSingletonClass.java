package jp.ktsystem.ambitious.designpattern.singleton.multithread;

/**
 * <h1>Singleton pattern for multiple thread.</h1>
 *
 * @author KTSystem_RyoichiObara
 * @since 2013/1/18
 */
public class MultiSingletonClass  {

	/** Instance. */
	private static MultiSingletonClass instance = null;

	/**
	 * Private constructor.<br>
	 */
	private MultiSingletonClass() {
		// インスタンス化を防ぐ
	}

	/**
	 * Get singleton instance.<br>
	 * @return SingletonClass
	 */
	public static synchronized MultiSingletonClass getInstance() {
		if (null == instance) {
			instance = new MultiSingletonClass();
		}
		return instance;
	}

	
	/**
	 * 目的の処理.<br>
	 */
	public void execute() {
		// 目的の処理
	}

}
