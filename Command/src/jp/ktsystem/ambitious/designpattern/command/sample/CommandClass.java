package jp.ktsystem.ambitious.designpattern.command.sample;

import static jp.ktsystem.ambitious.designpattern.command.sample.CommandClass.Order.*;

public class CommandClass {

	public enum Order {
		KAKE_SOBA, KAKE_UDON, TANUKI_SOBA, TANUKI_UDON, KITSUNE_SOBA, KITSUNE_UDON;
	}

	public static Bowl createBowlWithNoodle(Order order) {
		Bowl bowl = new Bowl();

		if (KAKE_SOBA.equals(order) || TANUKI_SOBA.equals(order) || KITSUNE_SOBA.equals(order)) {
			bowl.putNoodle(new Soba());
		} else if (KAKE_UDON == order || TANUKI_UDON == order || KITSUNE_UDON == order) {
			bowl.putNoodle(new Udon());
		}

		if (KAKE_SOBA.equals(order) || KAKE_UDON.equals(order)) {
			bowl.putSoup(new EasternSoup());
		} else {
			bowl.putSoup(new WesternSoup());
		}

		bowl.addTopping(new Topping("Negi"));
		if (TANUKI_SOBA.equals(order) || TANUKI_UDON.equals(order)) {
			bowl.addTopping(new Topping("Agedama"));
		}
		if (KITSUNE_SOBA.equals(order) || KITSUNE_UDON.equals(order)) {
			bowl.addTopping(new Topping("Aburaage"));
		}

		return bowl;
	}

}
