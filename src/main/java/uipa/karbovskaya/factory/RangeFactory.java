package uipa.karbovskaya.factory;

import uipa.karbovskaya.entity.*;

import java.util.ArrayList;
import java.util.List;

import static uipa.karbovskaya.constant.Constants.*;

public class RangeFactory {

	private static final List<Range> ranges = new ArrayList<>();

	static {
		ranges.add(new ColdWeatherRange(MINUS_FIFTY_DEGREES, MINUS_ONE_DEGREE));
		ranges.add(new WindyWeatherRange(ZERO_DEGREES, PLUS_TEN_DEGREES));
		ranges.add(new WalkingWeatherRange(PLUS_ELEVEN_DEGREES, PLUS_THIRTEEN_DEGREES));
		ranges.add(new HotWeatherRange(PLUS_THIRTY_ONE_DEGREE, PLUS_FORTY_DEGREES));
		ranges.add(new HellWeatherRange(PLUS_FORTY_ONE_DEGREE, PLUS_FIFTEEN_DEGREES));
	}

	public String getWeatherResult(int currentWeather) {
		return ranges.stream()
				.filter(r -> r.checkRange(currentWeather))
				.findFirst()
				.map(Range::getRangeWeatherDescription)
				.orElse(WEATHER_RESULT_DOES_NOT_EXISTS_ERROR_MESSAGE);
	}
}
