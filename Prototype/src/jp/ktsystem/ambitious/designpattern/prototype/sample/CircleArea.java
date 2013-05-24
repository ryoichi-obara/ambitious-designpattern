package jp.ktsystem.ambitious.designpattern.prototype.sample;

import java.math.BigDecimal;

public class CircleArea implements IfCircleArea {

	@Override
	public Answer calcCircle(double radius) {

		double rPower = Math.pow(radius, 2);

		Answer ans = new Answer(rPower);
		ans.setAns(ans.getAns().multiply(new BigDecimal(Math.PI)));

		return ans;
	}
}
