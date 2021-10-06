package pizzaPackage;

public class PizzaStore {
	
	public void orderPizza(){
		
		Pizza pizza = new Pizza();
		pizza.createPizza();
		pizza.bakePizza();
		pizza.boxPizza();
	}
}
