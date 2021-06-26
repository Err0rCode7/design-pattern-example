package design.pattern.abstraction_factory;

import java.util.ArrayList;

public abstract class PizzaStore {
    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    abstract Pizza createPizza(String type);
}

class NYPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {

        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        Pizza pizza = null;

        // Abstraction Factory Pattern
        if(type.equals("cheese")) pizza = new NYStyleCheesePizza(ingredientFactory);
        if(type.equals("peper")) pizza = new NYStylePepperoniPizza(ingredientFactory);
        if(type.equals("clam")) pizza = new NYStyleClamPizza(ingredientFactory);
        if(type.equals("veggie")) pizza = new NYStyleVeggiePizza(ingredientFactory);
        return pizza;
    }
}

class CheesePizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        this.dough = ingredientFactory.createDough();
        this.sauce = ingredientFactory.createSauce();
        this.cheese = ingredientFactory.createCheese();
    }
}

class PepperoniPizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        this.dough = ingredientFactory.createDough();
        this.sauce = ingredientFactory.createSauce();
    }
}

class ClamPizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    public ClamPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        this.dough = ingredientFactory.createDough();
    }
}

class VeggiePizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        this.sauce = ingredientFactory.createSauce();
        this.cheese = ingredientFactory.createCheese();
    }
}

class NYStyleCheesePizza extends CheesePizza {

    public NYStyleCheesePizza(PizzaIngredientFactory ingredientFactory) {
        super(ingredientFactory);
    }

    @Override
    public void bake() {
        System.out.println("Bake for 30 minutes at 350");
    }
}

class NYStylePepperoniPizza extends PepperoniPizza {

    public NYStylePepperoniPizza(PizzaIngredientFactory ingredientFactory) {
        super(ingredientFactory);
    }

    @Override
    public void bake() {
        System.out.println("Bake for 30 minutes at 350");
    }
}

class NYStyleClamPizza extends ClamPizza {

    public NYStyleClamPizza(PizzaIngredientFactory ingredientFactory) {
        super(ingredientFactory);
    }

    @Override
    public void bake() {
        System.out.println("Bake for 30 minutes at 350");
    }
}

class NYStyleVeggiePizza extends VeggiePizza {

    public NYStyleVeggiePizza(PizzaIngredientFactory ingredientFactory) {
        super(ingredientFactory);
    }

    @Override
    public void bake() {
        System.out.println("Bake for 30 minutes at 350");
    }
}

abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Cheese cheese;
    ArrayList<String> toppings = new ArrayList<>();

    public abstract void prepare();

    public void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName(){
        return this.name;
    }
}