package jp.ktsystem.ambitious.designpattern.singleton;

/**
 * <h1>Singleton pattern.</h1>
 *
 * メソッドをstaticで定義しない理由：クラスが抽象化できなくなり、クラス間の結合が強くなるため。
 *
 * @author KTSystem_RyoichiObara
 * @since 2013/1/17
 */
public class SingletonClass {

	/** Instance. */
	private static SingletonClass instance = new SingletonClass();

	/**
	 * Private constructor.<br>
	 */
	private SingletonClass() {
		// インスタンス化を防ぐ
	}

	/**
	 * Get singleton instance.<br>
	 * @return SingletonClass
	 */
	public static SingletonClass getInstance() {
		return instance;
	}

	/**
	 * 目的の処理.<br>
	 */
	public void execute() {
		// 目的の処理
	}

}
