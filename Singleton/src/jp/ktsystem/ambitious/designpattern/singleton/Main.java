package jp.ktsystem.ambitious.designpattern.singleton;

/**
 * <h1>Main class</h1>
 *
 * @author KTSystem_RyoichiObara
 * @since 2013/1/17
 */
public class Main {

	public static void main(String[] argus) {

		// Cannot new SingletonClass();
		SingletonClass.getInstance().execute();
		SingletonClass.getInstance().execute();



		// About static.

		System.out.println(Util.commonProcess());
		System.out.println(ExtUtil.commonProcess());

		Util u = new ExtUtil();
		System.out.println(u.commonProcess());
	}

}
