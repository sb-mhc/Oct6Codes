package pizzaPackage;

public class PizzaStore {
	
	PizzaFactory mypf;
	
	PizzaStore(PizzaFactory pf){
		mypf = pf;
	}
	
	public Pizza orderPizza(String type){
		
		Pizza pizza = mypf.createPizza(type);
		
		pizza.bakePizza();
		pizza.boxPizza();
		return pizza;
	}
}
