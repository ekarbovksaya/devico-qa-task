package uipa.karbovskaya.entity;

import static uipa.karbovskaya.constant.Constants.CELSIUS_SYMBOL;
import static uipa.karbovskaya.constant.Constants.EMPTY_STRING;

public abstract class BaseRange {

	private final String from;
	private final String to;

	public BaseRange(String from, String to) {
		this.from = from;
		this.to = to;
	}

	protected boolean inRange(int degree) {
		int fromValue = Integer.parseInt(from.replace(CELSIUS_SYMBOL, EMPTY_STRING));
		int toValue = Integer.parseInt(to.replace(CELSIUS_SYMBOL, EMPTY_STRING));
		return degree >= fromValue && degree <= toValue;
	}
}
