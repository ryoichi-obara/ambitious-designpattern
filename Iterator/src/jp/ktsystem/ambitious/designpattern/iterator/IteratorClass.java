package jp.ktsystem.ambitious.designpattern.iterator;

import java.util.List;

/**
 * <h1>Iterator pattern.</h1>
 *
 * @author KTSystem_RyoichiObara
 * @since 2013/1/18
 */
public class IteratorClass {

	/** Inner datas. */
	private List<String> data;
	private int offset;

	// ----- Constructor

	/**
	 * Sample constructor.<br>
	 * @param initialValue
	 */
	public IteratorClass(List<String> initialValue) {
		this.data = initialValue;
		this.offset = 0;
	}

	// ----- Public

	/**
	 * Iterator class has to have next().<br>
	 * @return one of inner data.
	 */
	public String next() {
		String returnValue = data.get(offset);
		offset++;
		return returnValue;
	}

	/**
	 * Iterator class has to have next().<br>
	 * @return Either remains data or not.
	 */
	public boolean hasNext() {
		return (data.size() == offset);
	}

}
