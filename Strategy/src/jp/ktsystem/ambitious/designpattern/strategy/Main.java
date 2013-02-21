package jp.ktsystem.ambitious.designpattern.strategy;

public class Main {

	public static void main(String[] args) {

		StrategyClass c = create(new StrategistA());
		c.exec();

		c.changeStrategy(new StrategistB());
		c.exec();
	}

	private static StrategyClass create(IfStrategist strategist) {
		return new StrategyClass(strategist);
	}

}
