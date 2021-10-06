package weatherPackage;


public class TheWeatherChannel implements Observer {
	int temp; 
	int hum;
	int prsr;
	
	public void update(int t, int h, int p) {
		temp = t;
		hum = h;
		prsr = p;
	}
	
	public void show() {
		System.out.println("\n-----------  The Weather Channel ----------- ");
		System.out.println("~~~~~~~~~~~ Temp:" + temp + " ~~~~~~~~~~~~");
		System.out.println("~~~~~~~~~~~ Humidity:" + hum + " ~~~~~~~~~~~~");
		System.out.println("~~~~~~~~~~~ Pressure:" + prsr +" ~~~~~~~~~~~~");

		
	}
}
