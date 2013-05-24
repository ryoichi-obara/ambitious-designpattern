package jp.ktsystem.ambitious.designpattern.mediator;

import java.util.ArrayList;
import java.util.List;

import jp.ktsystem.ambitious.designpattern.mediator.sample.Mediator;
import jp.ktsystem.ambitious.designpattern.mediator.sample.WBSMediator;
import jp.ktsystem.ambitious.designpattern.mediator.sample.bean.Activity;
import jp.ktsystem.ambitious.designpattern.mediator.sample.bean.Member;
import jp.ktsystem.ambitious.designpattern.mediator.sample.bean.WorkPackage;

public class Main {

	public static void main(String[] args) {

		List<Member> members = new ArrayList<Member>();

		// Kickoff.
		Mediator someProject = new WBSMediator(members);

		// Happen workPackage.
		WorkPackage wp = happenNewWorkPackage();

		someProject.addWorkPackage(wp);

		// Join the project.
		Member freeman = new Member(1);
		someProject.addMember(freeman);
	}

	private static WorkPackage happenNewWorkPackage() {

		List<Activity> activities = new ArrayList<Activity>();

		activities.add(new Activity("act1", 3, 4));
		activities.add(new Activity("act2", 1, 2));

		return new WorkPackage(activities);
	}

}
