package part_one;

import java.util.ArrayList;

public class PizzaBuilder {

    private String pizzaChain;
    private String pizzaSize;
    private ArrayList<String> topping;

    public PizzaBuilder() {
        this.topping = new ArrayList<String>();
    }

    public PizzaBuilder setPizzaChain(String pizzaChain) {
        this.pizzaChain = pizzaChain;
        return this;
    }

    public PizzaBuilder setPizzaSize(String pizzaSize) {
        this.pizzaSize = pizzaSize;
        return this;
    }
    public PizzaBuilder addToppings(String topping) {
        this.topping.add(topping);
        return this;
    }


    public Pizza createPizza() {
        return new Pizza(pizzaChain, pizzaSize, topping);
    }

}