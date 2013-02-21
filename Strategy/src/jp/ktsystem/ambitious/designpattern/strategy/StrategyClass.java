package jp.ktsystem.ambitious.designpattern.strategy;

public class StrategyClass {

	private IfStrategist strategist;

	// ----- Constructor

	public StrategyClass(IfStrategist strategist) {
		this.strategist = strategist;
	}

	// ----- public

	public void exec() {
		strategist.process();
		// and some processes.
	}

	public void changeStrategy(IfStrategist strategist) {
		this.strategist = strategist;
	}

}
