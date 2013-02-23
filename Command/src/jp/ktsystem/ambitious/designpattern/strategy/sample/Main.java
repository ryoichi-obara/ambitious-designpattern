package jp.ktsystem.ambitious.designpattern.strategy.sample;

import jp.ktsystem.ambitious.designpattern.strategy.sample.CommandClass.Order;

public class Main {

	public static void main(String[] args) {

		Bowl bowl = CommandClass.createBowlWithNoodle(Order.TANUKI_SOBA);

		System.out.println(bowl.eat());
	}

}
