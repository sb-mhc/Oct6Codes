package weatherPackage;

public class WeatherDemo {
	
	public static void main(String[] args) {
		WeatherData wd = new WeatherData(89, 78, 780);
		Observer o1 = new AccuWeather();
		wd.addObserver(o1);
		o1.show();
		
		wd.setTemp(92);
		o1.show();
		Observer o2 = new TheWeatherChannel();
		wd.addObserver(o2);
		
		o2.show();
		
	}

}
