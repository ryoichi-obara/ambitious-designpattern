package jp.ktsystem.ambitious.designpattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * <h1>Main class</h1>
 *
 * @author KTSystem_RyoichiObara
 * @since 2013/1/18
 */
public class Main {

	public static void main(String[] argus) {

		// コメントを修正
		IteratorClass i = obtainIterator();

		while (i.hasNext()) {

			// 中のデータ構造や個数にとらわれない処理が書ける。
			i.next();
		}
	}



	// ----- Private

	/**
	 * Example: Operate some process, and Returned value as Iterator class.
	 * @return IteratorClass 
	 */
	private static IteratorClass obtainIterator() {

		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("A");
		list.add("B");
		list.add("b");
		list.add("C");
		return new IteratorClass(list);
	}

}
