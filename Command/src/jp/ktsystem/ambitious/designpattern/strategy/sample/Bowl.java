package jp.ktsystem.ambitious.designpattern.strategy.sample;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Bowl implements Serializable {

	private IfNoodle noodle;
	private IfSoup soup;
	private List<Topping> topping;

	public Bowl() {
		this.topping = new ArrayList<Topping>();
	}

	public Bowl putNoodle(IfNoodle noodle) {
		if (null != this.noodle)     throw new WrongOperationException(this.noodle);
		if (null != this.soup)       throw new WrongOperationException(this.soup);
		if (!this.topping.isEmpty()) throw new WrongOperationException(this.topping);
		this.noodle = noodle;
		return this;
	}

	public Bowl putSoup(IfSoup soup) {
		if (null == this.noodle)     throw new WrongOperationException(this.noodle);
		if (null != this.soup)       throw new WrongOperationException(this.soup);
		if (!this.topping.isEmpty()) throw new WrongOperationException(this.topping);
		this.soup = soup;
		return this;
	}

	public Bowl addTopping(Topping topping) {
		if (null == this.noodle)     throw new WrongOperationException(this.noodle);
		if (null == this.soup)       throw new WrongOperationException(this.soup);
		this.topping.add(topping);
		return this;
	}

	public void build() {
		//
	}

}
