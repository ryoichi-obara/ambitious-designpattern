package jp.ktsystem.ambitious.designpattern.adapter;

/**
 * <h1>Adapter class for adapter pattern.</h1>
 *
 * This class (Adapter class) have to know how to be used.
 *
 * @author KTSystem_RyoichiObara
 * @since 2013/1/18
 */
public class AdapterClass extends OriginalClass {

	private AdaptedClass c;

	public AdapterClass(AdaptedClass adaptedClass) {
		this.c = adaptedClass;
	}

	// ---- Public

	@Override
	public int getField1() {
		return c.getField();
	}

	@Override
	public int getField2() {
		return 1;
	}

	@Override
	public void setField1(int field1) {
		c.setField(field1);
		throw new UnsupportedOperationException(); // FIXME Is it OK?
	}

	@Override
	public void setField2(int field2) {
		c.setField(field2);
		throw new UnsupportedOperationException(); // FIXME Is it OK?
	}

}
