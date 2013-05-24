package jp.ktsystem.ambitious.designpattern.mediator.sample.bean;

import java.io.Serializable;

public class Member implements Serializable {

	// st

	private static final long serialVersionUID = -190101067929503428L;

	// mem

	private int skillLevel;

	// con

	public Member(int skillLevel) {
		this.skillLevel = skillLevel;
	}

	// pub

	public void levelUp() {
		skillLevel++;
	}

	// gs

	public int getSkillLevel() {
		return skillLevel;
	}

}
