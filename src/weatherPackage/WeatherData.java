package weatherPackage;


import java.util.ArrayList;

public class WeatherData implements Subject {
	int temp;
	int hum;
	int prsr;
	ArrayList<Observer> o_list;

	
	WeatherData(int t, int h, int p) {
		temp = t;
		hum = h;
		prsr = p;
		o_list = new ArrayList<Observer>(0);
	}
	
	
	void setTemp(int t){
		temp = t;
		notifyObservers();
	}
	
	void setHum(int h){
		hum = h;
		notifyObservers();
	}
	
	void setPrsr(int p){
		prsr = p;
		notifyObservers();
	}
	
	public void addObserver(Observer o) {
		o_list.add(o);
	}
	
	public void removeObserver(Observer o) {
		o_list.remove(o);
	}
	
	public void notifyObservers() {
		if(!o_list.isEmpty()) {
			for(int i= 0; i< o_list.size();i++ ) {
				o_list.get(i).update(temp, hum, prsr);
			}
		}
		
	}
	
	
	
}
