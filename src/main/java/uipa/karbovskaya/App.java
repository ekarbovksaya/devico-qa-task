package uipa.karbovskaya;

import uipa.karbovskaya.factory.RangeFactory;

import java.util.Scanner;

import static uipa.karbovskaya.constant.Constants.CANNOT_PARSE_NUMBER_ERROR_MESSAGE;
import static uipa.karbovskaya.constant.Constants.CELSIUS_SYMBOL;
import static uipa.karbovskaya.constant.Constants.EMPTY_STRING;
import static uipa.karbovskaya.constant.Constants.ENTER_MESSAGE;

public class App {

	public static void main(String[] args) {
		System.out.println(ENTER_MESSAGE);
		while (true) {
			Scanner input = new Scanner(System.in);
			try {
				int currentWeather = Integer.parseInt(input.nextLine().replace(CELSIUS_SYMBOL, EMPTY_STRING));
				RangeFactory rangeFactory = new RangeFactory();
				System.out.print(rangeFactory.getWeatherResult(currentWeather));
			} catch (NumberFormatException e) {
				System.out.println(CANNOT_PARSE_NUMBER_ERROR_MESSAGE + e);
			}
		}
	}

}
