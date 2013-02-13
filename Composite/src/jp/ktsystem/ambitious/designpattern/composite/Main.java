package jp.ktsystem.ambitious.designpattern.composite;

import java.util.List;

/**
 * <h1>Main class</h1>
 *
 * @author KTSystem_RyoichiObara
 * @since 2013/1/17
 */
public class Main {

	public static void main(String[] argus) {

		TreeClass tree = process();

		search(tree, "key");
	}

	protected static String search(TreeClass tree, String keyword) {
		List<LeafClass> leaves = tree.getLeaves();
		for (LeafClass leaf : leaves) {
			if (leaf.getField1().equals(keyword)) {
				return keyword;
			}
		}

		List<TreeClass> childTrees = tree.getChildTrees();
		for (TreeClass childTree : childTrees) {
			String result = search(childTree, keyword);
			if (null != result) return result;
		}

		return null;
	}



	// ----- Private

	/**
	 * Example: Operate some process, and Returned value as tree class.
	 * @return TreeClass 
	 */
	private static TreeClass process() {
		return new TreeClass();
	}

}
