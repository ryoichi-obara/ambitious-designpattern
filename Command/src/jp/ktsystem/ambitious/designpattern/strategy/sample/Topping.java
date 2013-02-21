package jp.ktsystem.ambitious.designpattern.strategy.sample;

import java.io.Serializable;

public class Topping implements Serializable {

	private static final long serialVersionUID = -1268392710052700746L;

	private String name;

	// ----- Constructor

	public Topping(String name) {
		this.name = name;
	}

	// ----- Getter

	public String getName() {
		return name;
	}

}
