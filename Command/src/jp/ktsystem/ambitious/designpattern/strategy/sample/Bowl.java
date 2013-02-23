package jp.ktsystem.ambitious.designpattern.strategy.sample;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Bowl implements Serializable {

	private static final long serialVersionUID = 6651030530734488578L;

	private IfNoodle noodle;
	private IfSoup soup;
	private List<Topping> topping;

	private boolean complete = false;

	public Bowl() {
		this.topping = new ArrayList<Topping>();
	}

	public Bowl putNoodle(IfNoodle noodle) {
		if (complete) throw new WrongOperationException("complete");
		if (null != this.noodle)     throw new WrongOperationException(this.noodle);
		if (null != this.soup)       throw new WrongOperationException(this.soup);
		if (!this.topping.isEmpty()) throw new WrongOperationException(this.topping);
		this.noodle = noodle;
		return this;
	}

	public Bowl putSoup(IfSoup soup) {
		if (complete) throw new WrongOperationException("complete");
		if (null == this.noodle)     throw new WrongOperationException(this.noodle);
		if (null != this.soup)       throw new WrongOperationException(this.soup);
		if (!this.topping.isEmpty()) throw new WrongOperationException(this.topping);
		this.soup = soup;
		return this;
	}

	public Bowl addTopping(Topping topping) {
		if (complete) throw new WrongOperationException("complete");
		if (null == this.noodle)     throw new WrongOperationException(this.noodle);
		if (null == this.soup)       throw new WrongOperationException(this.soup);
		this.topping.add(topping);
		return this;
	}

	public String eat() {
		//
		this.complete = true;

		StringBuilder s = new StringBuilder();

		s.append(noodle.getName()).append(" in ").append(soup.getName());

		if (!topping.isEmpty()) s.append(" with ");
		for (Topping t : topping) {
			s.append(t.getName()).append(", ");
		}
		if (!topping.isEmpty()) s.setLength(s.length() - ", ".length());

		s.append(".");

		return s.toString();
	}

}
