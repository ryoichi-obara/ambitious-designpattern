package jp.ktsystem.ambitious.designpattern.prototype;

import jp.ktsystem.ambitious.designpattern.prototype.sample.Answer;
import jp.ktsystem.ambitious.designpattern.prototype.sample.CircleArea;
import jp.ktsystem.ambitious.designpattern.prototype.sample.IfCircleArea;

public class Client {

	public static void main(String[] args) {

		double radius = 10;

		IfCircleArea circleArea = new CircleArea();
		Answer ans = circleArea.calcCircle(radius);

		print(ans);

		ans.multiply(radius);
//		ans.multiply(4.0/3.0);
		ans.multiply(4);
		ans.divide(3.0);

		print(ans);
	}

	private static void print(Answer ans) {
		System.out.println(ans.getAns().toString());
	}

}
