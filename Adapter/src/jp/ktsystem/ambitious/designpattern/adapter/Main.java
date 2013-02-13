package jp.ktsystem.ambitious.designpattern.adapter;


/**
 * <h1>Main class</h1>
 *
 * @author KTSystem_RyoichiObara
 * @since 2013/1/18
 */
public class Main {

	public static void main(String[] argus) {

		@SuppressWarnings("unused")
		int num;

		OriginalClass c1 = create(1);
		num = c1.getField1() * c1.getField2(); // Usage

		OriginalClass c2 = create(2);
		num = c2.getField1() * c2.getField2(); // Usage
	}



	// ----- Private

	/**
	 * Example: Factory method.
	 * @param operation Specify class to create.
	 * @return OriginalClass (or adapted class.)
	 */
	private static OriginalClass create(int operation) {

		if (1 == operation) {

			OriginalClass c = new OriginalClass();
			c.setField1(100);
			c.setField1(2);
			return c;

		} else if (2 == operation) {

			AdaptedClass c = new AdaptedClass();
			c.setField(200);
			return new AdapterClass(c);
		}

		throw new RuntimeException();
	}

}
