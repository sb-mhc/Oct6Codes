package weatherPackage;

public class AccuWeather implements Observer{
	int temp;
	int hum;
	int prsr;
	
	public void update(int t, int h, int p) {
		temp = t;
		hum = h;
		prsr = p;
	}
	
	public void show() {
		System.out.println("\n----------- AccuWeather ------------");
		System.out.println("*********** Temp:" + temp + " ***********");
		System.out.println("*********** Humidity:" + hum + " ***********");
		System.out.println("*********** Pressure:" + prsr +" ***********");
	}
}
