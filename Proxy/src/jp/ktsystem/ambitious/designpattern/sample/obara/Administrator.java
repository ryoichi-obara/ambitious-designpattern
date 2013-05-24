package jp.ktsystem.ambitious.designpattern.sample.obara;

import java.util.ArrayList;
import java.util.List;

/**
 * Administrator and VBA.
 * @author ryoichi0102
 */
public class Administrator extends AbstractQuestion {

	private static List<Question> advisers;
	static{

		advisers = new ArrayList<Question>();
		advisers.add(new Administrator());
		advisers.add(new JavaPro());
	}

	@Override
	public String ask(Genre genre, String message) {

		for (Question q : advisers) {

			String ans;
			if (q.getClass().isAssignableFrom(this.getClass())) {
				ans = super.ask(genre, message);
			} else {
				ans = q.ask(genre, message);
			}

			if (null != ans) return ans;
		}

		return null;
	}

	@Override
	public Genre getExpart() {
		return Genre.VBA;
	}

	@Override
	protected String getMessage() {
		return "http://excelvba.pc-users.net/";
	}

}
