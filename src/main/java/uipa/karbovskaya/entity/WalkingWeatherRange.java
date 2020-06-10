package uipa.karbovskaya.entity;

import uipa.karbovskaya.factory.Range;

import static uipa.karbovskaya.constant.Constants.WALKING_WEATHER_DESCRIPTION;

public class WalkingWeatherRange extends BaseRange implements Range {

	public WalkingWeatherRange(String from, String to) {
		super(from, to);
	}

	@Override
	public boolean checkRange(int currentWeather) {
		return inRange(currentWeather);
	}

	@Override
	public String getRangeWeatherDescription() {
		return WALKING_WEATHER_DESCRIPTION;
	}
}
