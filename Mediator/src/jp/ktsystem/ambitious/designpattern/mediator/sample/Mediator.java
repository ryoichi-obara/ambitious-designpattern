package jp.ktsystem.ambitious.designpattern.mediator.sample;

import jp.ktsystem.ambitious.designpattern.mediator.sample.bean.Member;
import jp.ktsystem.ambitious.designpattern.mediator.sample.bean.WorkPackage;

public interface Mediator {

	public void addWorkPackage(WorkPackage wp);
	public void addMember(Member member);

	// ついに参加！！

	// まだまだ慣れません。
}
