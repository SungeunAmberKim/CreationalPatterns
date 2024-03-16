package part_one;

import java.util.ArrayList;

public class Pizza {
    private String pizzaChain;
    private String pizzaSize;
    private ArrayList<String> topping;

    public Pizza(String pizzaChain, String pizzaSize, ArrayList<String> topping) {
        this.pizzaChain = pizzaChain;
        this.pizzaSize = pizzaSize;
        this.topping = topping;
    }

    public void eat() {
        System.out.println("Pizza chain: " + this.pizzaChain);
        System.out.println("Size: " + this.pizzaSize);
        System.out.println("Toppings: " + this.topping);
    }


}
