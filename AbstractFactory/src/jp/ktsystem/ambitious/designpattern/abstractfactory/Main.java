package jp.ktsystem.ambitious.designpattern.abstractfactory;

public class Main {

	public static void main(String args[]) {

		String s = args[0];

		AbstractFactory factory = createFactory(s);

		ConcreteClass c = new ConcreteClass();
		c.setField1(factory.getField1());
		c.setField1(factory.getField2());
	}

	/**
	 * Depends on s.<br>
	 * @param s String
	 * @return Concrete factory class.
	 */
	private static AbstractFactory createFactory(String s) {

		if ("A".equals(s)) {
			return new AFactory();
		} else if("B".equals(s)) {
			return new BFactory();
		} else {
			return new CFactory();
		}
	}

}
