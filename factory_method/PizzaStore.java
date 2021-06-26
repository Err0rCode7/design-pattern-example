package design.pattern.factory_method;

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

        Pizza pizza = null;

        if(type.equals("cheese")) pizza = new NYStyleCheesePizza();
        if(type.equals("peper")) pizza = new NYStylePepperoniPizza();
        if(type.equals("clam")) pizza = new NYStyleClamPizza();
        if(type.equals("veggie")) pizza = new NYStyleVeggiePizza();
        return pizza;
    }
}

class NYStyleCheesePizza extends Pizza {

    @Override
    public void bake() {
        System.out.println("Bake for 30 minutes at 350");
    }
}

class NYStylePepperoniPizza extends Pizza {

    @Override
    public void bake() {
        System.out.println("Bake for 30 minutes at 350");
    }
}

class NYStyleClamPizza extends Pizza {

    @Override
    public void bake() {
        System.out.println("Bake for 30 minutes at 350");
    }
}

class NYStyleVeggiePizza extends Pizza {

    @Override
    public void bake() {
        System.out.println("Bake for 30 minutes at 350");
    }
}

abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList<String> toppings = new ArrayList<>();

    public void prepare(){
        System.out.println("Preparing : "+name);
        System.out.println("Tossing dough...");
        System.out.println("Adding source");
        System.out.println("Adding toppings");
        for (String topping : toppings) {
            System.out.println("\ttopping : "+topping);
        }
    }

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