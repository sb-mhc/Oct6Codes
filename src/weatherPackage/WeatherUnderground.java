package weatherPackage;

public class WeatherUnderground implements Observer{
	int temp;
	int hum;
	int prsr;
	
	public void update(int t, int h, int p) {
		temp = t;
		hum = h;
		prsr = p;
	}
	
	public void show() {
		
	}
}
