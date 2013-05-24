package jp.ktsystem.ambitious.designpattern.mediator.sample.bean;

import java.io.Serializable;
import java.util.List;

public class WorkPackage implements Serializable {

	// st

	private static final long serialVersionUID = -3399294368854211475L;

	// mem

	private final List<Activity> activities;

	// con

	public WorkPackage(List<Activity> activities) {
		this.activities = activities;
	}

	// gs

	public List<Activity> getActivities() {
		return activities;
	}

}
