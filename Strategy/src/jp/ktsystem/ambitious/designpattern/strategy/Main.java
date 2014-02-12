package jp.ktsystem.ambitious.designpattern.strategy;

public class Main {

	/**
	 * @param args やっぱり酒井だよー
	 */
	public static void main(String[] args) {

		StrategyClass c = create(new StrategistA());
		c.exec();

		c.changeStrategy(new StrategistB());
		c.exec();
	}

	private static StrategyClass create(IfStrategist strategist) {
		return new StrategyClass(strategist);
	}

	// 別ブランチ間で同じクラス、別の場所に変更を加えて、競合テスト　＠　酒井　2014/2/12 add
}
