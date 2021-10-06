package pizzaPackage;

public class VeggiePizza extends Pizza {
	
	VeggiePizza(){
		System.out.println("This is a veggie pizza");
	}
	
	public void createPizza() {
		System.out.println("Creating the veggie pizza");
	}
	
	public void bakePizza() {
		System.out.println("Baking the veggie pizza");
	}
	
	public void boxPizza() {
		System.out.println("Boxing the veggie pizza");
	}
}
