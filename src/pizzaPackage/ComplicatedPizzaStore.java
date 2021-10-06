package pizzaPackage;

public class ComplicatedPizzaStore {
	
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		
		if(type=="Cheese") {
			pizza = new CheesePizza();
		} else if (type=="Veggie") {
			pizza = new VeggiePizza();
		}
		
		return pizza;
	}
	
	public Pizza orderPizza(String type){
		
		
		Pizza pizza = createPizza(type);
		
		pizza.bakePizza();
		pizza.boxPizza();
		return pizza;
	}
	
	public static void main(String[] args) {
		ComplicatedPizzaStore ps = new ComplicatedPizzaStore();
		ps.orderPizza("Cheese");
	}
	
}
