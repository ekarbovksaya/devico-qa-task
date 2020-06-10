package uipa.karbovskaya.entity;

import uipa.karbovskaya.factory.Range;

import static uipa.karbovskaya.constant.Constants.HOT_WEATHER_DESCRIPTION;

public class HotWeatherRange extends BaseRange implements Range {

	public HotWeatherRange(String from, String to) {
		super(from, to);
	}

	@Override
	public boolean checkRange(int currentWeather) {
		return inRange(currentWeather);
	}

	@Override
	public String getRangeWeatherDescription() {
		return HOT_WEATHER_DESCRIPTION;
	}
}
