package uipa.karbovskaya.constant;

public final class Constants {

	private Constants() {
	}

	// specific
	public static final String EMPTY_STRING = "";
	public static final String CELSIUS_SYMBOL = "C";

	// ranges
	public static final String COLD_WEATHER_DESCRIPTION = "It’s super cold today. Be sure you dressed well!\n";
	public static final String HELL_WEATHER_DESCRIPTION = "Welcome to hell!\n";
	public static final String HOT_WEATHER_DESCRIPTION = "It's so hot outside!\n";
	public static final String WALKING_WEATHER_DESCRIPTION = "It’s time for outdoor walking!\n";
	public static final String WINDY_WEATHER_DESCRIPTION = "It’s windy outside, but we are sure you will enjoy your day!\n";
	public static final String WEATHER_RESULT_DOES_NOT_EXISTS_ERROR_MESSAGE = "Please re-check results in 5 minutes\n";

	// weather range values
	public static final String MINUS_FIFTY_DEGREES = "-50C";
	public static final String MINUS_ONE_DEGREE = "-1C";
	public static final String ZERO_DEGREES = "-0C";
	public static final String PLUS_TEN_DEGREES = "+10C";
	public static final String PLUS_ELEVEN_DEGREES = "+11C";
	public static final String PLUS_THIRTEEN_DEGREES = "+30C";
	public static final String PLUS_THIRTY_ONE_DEGREE = "+31C";
	public static final String PLUS_FORTY_DEGREES = "+40C";
	public static final String PLUS_FORTY_ONE_DEGREE = "+41C";
	public static final String PLUS_FIFTEEN_DEGREES = "+50C";

	// common
	public static final String ENTER_MESSAGE = "Enter the current weather in the following format ‘+26C’:";
	public static final String CANNOT_PARSE_NUMBER_ERROR_MESSAGE = "Can't parse provided weather. Details: ";
}
