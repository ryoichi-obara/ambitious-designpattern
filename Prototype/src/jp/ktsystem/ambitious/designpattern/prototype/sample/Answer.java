package jp.ktsystem.ambitious.designpattern.prototype.sample;

import java.math.BigDecimal;

public class Answer {

	private BigDecimal ans;

	// --- Cons

	public Answer(double d) {
		this.ans = new BigDecimal(d);
	}
	public Answer(BigDecimal bd) {
		this.ans = bd;
	}

	// --- pub

	public void multiply(BigDecimal multiplicand) {
		ans = ans.multiply(multiplicand);
	}
	public void multiply(double multiplicand) {
		ans = ans.multiply(BigDecimal.valueOf(multiplicand));
	}

	public void divide(BigDecimal divisor) {
		ans = ans.divide(divisor);
	}
	public void divide(double divisor) {
//		ans = ans.divide(BigDecimal.valueOf(divisor), );
		ans = ans.divide(BigDecimal.valueOf(divisor), 48, BigDecimal.ROUND_HALF_EVEN);
	}

	// --- gs

	public BigDecimal getAns() {
		return ans;
	}

	public void setAns(BigDecimal ans) {
		this.ans = ans;
	}

}
