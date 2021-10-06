package pizzaPackage;

public class ComplicatedPizzaStore {
	
	public void orderPizza(){
		
		Pizza pizza = new Pizza();
		pizza.createPizza();
		pizza.bakePizza();
		pizza.boxPizza();
	}
	
	public static void main(String[] args) {
		ComplicatedPizzaStore ps = new ComplicatedPizzaStore();
	}
	
}
