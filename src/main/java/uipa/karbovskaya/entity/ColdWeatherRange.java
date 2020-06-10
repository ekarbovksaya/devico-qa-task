package uipa.karbovskaya.entity;

import uipa.karbovskaya.factory.Range;

import static uipa.karbovskaya.constant.Constants.COLD_WEATHER_DESCRIPTION;

public class ColdWeatherRange extends BaseRange implements Range {

	public ColdWeatherRange(String from, String to) {
		super(from, to);
	}

	@Override
	public boolean checkRange(int currentWeather) {
		return inRange(currentWeather);
	}

	@Override
	public String getRangeWeatherDescription() {
		return COLD_WEATHER_DESCRIPTION;
	}
}
