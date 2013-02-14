package jp.ktsystem.ambitious.designpattern.builder;

public class Builder {

	private boolean initialized = false;

	private String s;

	// --- constructor

	public Builder(String s) {
		this.s = s;
		this.initialized = true;
	}

	// --- public

	public Builder add(String s) {
		if (!initialized) throw new RuntimeException("Builder is not initialized.");
		this.s += s; // (Better to use StringBuilder.)
		return this;
	}

	public String build() {
		return s;
	}
}
