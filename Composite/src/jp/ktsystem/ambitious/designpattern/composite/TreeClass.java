package jp.ktsystem.ambitious.designpattern.composite;

import java.util.List;

/**
 * <h1>Composite pattern.</h1>
 *
 * @author KTSystem_RyoichiObara
 * @since 2013/1/17
 */
public class TreeClass {

	private List<TreeClass> childTrees;
	private List<LeafClass> leaves;

	// ---- Getter and setter.

	public List<TreeClass> getChildTrees() {
		return childTrees;
	}
	public void setChildTrees(List<TreeClass> childTrees) {
		this.childTrees = childTrees;
	}
	public List<LeafClass> getLeaves() {
		return leaves;
	}
	public void setLeaves(List<LeafClass> leaves) {
		this.leaves = leaves;
	}

}
