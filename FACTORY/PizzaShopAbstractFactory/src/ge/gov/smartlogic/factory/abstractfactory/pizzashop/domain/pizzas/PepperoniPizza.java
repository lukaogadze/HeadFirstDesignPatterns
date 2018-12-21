package ge.gov.smartlogic.factory.abstractfactory.pizzashop.domain.pizzas;

public class PepperoniPizza extends Pizza {
	private final PizzaIngredientFactory ingredientFactory;
 
	public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
 
	public void prepare() {
		System.out.println("Preparing " + getName());
		setDough(ingredientFactory.createDough());
		setSauce(ingredientFactory.createSauce());
		setCheese(ingredientFactory.createCheese());
		setVeggies(ingredientFactory.createVeggies());
		setPepperoni(ingredientFactory.createPepperoni());
	}
}
