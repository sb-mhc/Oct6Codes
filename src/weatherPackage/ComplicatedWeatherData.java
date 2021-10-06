package weatherPackage;


import java.util.ArrayList;

public class ComplicatedWeatherData {
	
	int temp;
	int hum;
	int prsr;
	
	
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
		
	}
	
	public static void main(String[] args) {
		
	}
}
