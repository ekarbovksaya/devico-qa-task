package uipa.karbovskaya.entity;

import uipa.karbovskaya.factory.Range;

import static uipa.karbovskaya.constant.Constants.WINDY_WEATHER_DESCRIPTION;

public class WindyWeatherRange extends BaseRange implements Range {

	public WindyWeatherRange(String from, String to) {
		super(from, to);
	}

	@Override
	public boolean checkRange(int currentWeather) {
		return inRange(currentWeather);
	}

	@Override
	public String getRangeWeatherDescription() {
		return WINDY_WEATHER_DESCRIPTION;
	}
}
