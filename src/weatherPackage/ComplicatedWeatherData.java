package weatherPackage;


import java.util.ArrayList;

public class ComplicatedWeatherData {
	
	int temp;
	int hum;
	int prsr;
	
	AccuWeather aw;
	TheWeatherChannel awc;
	
	
	ComplicatedWeatherData(int t, int h, int p) {
		temp = t;
		hum = h;
		prsr = p;
	}
	
	
	void setTemp(int t){
		temp = t;
	}
	
	void setHum(int h){
		hum = h;
	}
	
	void setPrsr(int p){
		prsr = p;
	}
	
	void displayWeather() {
		aw.update(temp, hum, prsr);
		awc.update(temp, hum, prsr);
		
	}
	
	public static void main(String[] args) {
		
		ComplicatedWeatherData cwd = new ComplicatedWeatherData(99, 56, 780);
	}
}
