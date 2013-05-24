package jp.ktsystem.ambitious.designpattern.mediator.sample;

import java.util.ArrayList;
import java.util.List;

import jp.ktsystem.ambitious.designpattern.mediator.sample.bean.Member;
import jp.ktsystem.ambitious.designpattern.mediator.sample.bean.WorkPackage;

/**
 * <h1>
 *  Mediator パターン サンプル.
 * </h1>
 *
 * 中で全て処理するので、getter/setterも必要ない。外側は投げるだけ。
 * @author Ryoichi Obara
 * @since 2013/5/8
 */
public class WBSMediator implements Mediator {

	private List<WorkPackage> workPackages;
	private List<Member> members;

	// --- Con

	public WBSMediator(List<Member> members) {
		this.workPackages = new ArrayList<WorkPackage>();
		this.members = members;
	}

	// --- Pub

	public void addWorkPackage(WorkPackage wp) {
		workPackages.add(wp);
		// TODO 追加になった仕事を、今居るメンバーの中で、比較的空いている人へアサイン。
	}

	public void addMember(Member member) {
		members.add(member);
		// TODO 新しいメンバーに、今あるタスクの中から未着手のものを、アサインしなおす。
	}

	// --- Getter and Setter

}
