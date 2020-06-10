package uipa.karbovskaya.entity;

import uipa.karbovskaya.factory.Range;

import static uipa.karbovskaya.constant.Constants.HELL_WEATHER_DESCRIPTION;

public class HellWeatherRange extends BaseRange implements Range {

	public HellWeatherRange(String from, String to) {
		super(from, to);
	}

	@Override
	public boolean checkRange(int currentWeather) {
		return inRange(currentWeather);
	}

	@Override
	public String getRangeWeatherDescription() {
		return HELL_WEATHER_DESCRIPTION;
	}
}
