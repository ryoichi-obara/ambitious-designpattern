package jp.ktsystem.ambitious.designpattern.mediator.sample.bean;

import java.io.Serializable;


public class Activity implements Serializable {

	// st

	private static final long serialVersionUID = 8745173856016072294L;

	// mem

	private final String name;
	private final int difficulty;
	private final int manDay;

	// con

	public Activity(String name, int difficulty, int manDay) {
		this.name = name;
		this.difficulty = difficulty;
		this.manDay = manDay;
	}

	// gs

	public String getName() {
		return name;
	}

	public int getDifficulty() {
		return difficulty;
	}

	public int getManDay() {
		return manDay;
	}

}
