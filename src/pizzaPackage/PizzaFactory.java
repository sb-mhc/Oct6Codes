package pizzaPackage;

public class PizzaFactory {
	
	public Pizza createPizza(String type){
		if(type == "Cheese")
			return (new CheesePizza());
		else if(type == "Veggie")
			return (new VeggiePizza());
		else
			return null;
	}
}
