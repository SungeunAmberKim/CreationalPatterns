import part_one.Pizza;
import part_one.PizzaBuilder;
import part_two.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("---Part one---");
        pizzaOne();
        pizzaTwo();
        System.out.println("---Part Two---");
        macroNutrients();
    }
    public static void pizzaOne () {
        Pizza smallThreeToppings = new PizzaBuilder().setPizzaChain("Pizza hut").setPizzaSize("S")
                .addToppings("Bacon").addToppings("Ham").addToppings("Pesto").createPizza();

        Pizza medSixToppings = new PizzaBuilder().setPizzaChain("Pizza hut").setPizzaSize("M")
                .addToppings("Bacon").addToppings("Ham").addToppings("Pesto")
                .addToppings("Olives").addToppings("Beef").addToppings("Onions")
                .createPizza();

        Pizza largeNineToppings = new PizzaBuilder().setPizzaChain("Pizza hut").setPizzaSize("L")
                .addToppings("Bacon").addToppings("Ham").addToppings("Pesto")
                .addToppings("Olives").addToppings("Beef").addToppings("Onions")
                .addToppings("Mushroom").addToppings("Extra Cheese").addToppings("Peppers")
                .createPizza();

        smallThreeToppings.eat();
        medSixToppings.eat();
        largeNineToppings.eat();
    }
    public static void pizzaTwo() {
        Pizza hutLargeThree = new PizzaBuilder().setPizzaChain("Pizza hut").setPizzaSize("L")
                .addToppings("Bacon").addToppings("Ham").addToppings("Pesto").createPizza();

        Pizza hutSmallTwo = new PizzaBuilder().setPizzaChain("Pizza hut").setPizzaSize("S")
                .addToppings("Bacon").addToppings("Ham").createPizza();

        Pizza caesarMedEight = new PizzaBuilder().setPizzaChain("Little Caesars").setPizzaSize("M")
                .addToppings("Bacon").addToppings("Ham").addToppings("Pesto")
                .addToppings("Olives").addToppings("Beef").addToppings("Onions")
                .addToppings("Mushroom").addToppings("Extra Cheese")
                .createPizza();

        Pizza caesarSmallSix = new PizzaBuilder().setPizzaChain("Little Caesars").setPizzaSize("S")
                .addToppings("Bacon").addToppings("Ham").addToppings("Pesto")
                .addToppings("Olives").addToppings("Beef").addToppings("Onions")
                .createPizza();

        Pizza dominoSmallOne = new PizzaBuilder().setPizzaChain("Dominos").setPizzaSize("S")
                .addToppings("Bacon").createPizza();

        Pizza dominoLargeThree = new PizzaBuilder().setPizzaChain("Dominos").setPizzaSize("L")
                .addToppings("Bacon").addToppings("Ham").addToppings("Pesto")
                .createPizza();

        System.out.println("--Part two--");
        hutLargeThree.eat();
        hutSmallTwo.eat();
        caesarSmallSix.eat();
        caesarMedEight.eat();
        dominoSmallOne.eat();
        dominoLargeThree.eat();
    }
    public static void macroNutrients() {
        Customer one = new Customer("Uni", "VEGAN");
        one.print();
        Customer two = new Customer("Moe", "PALEO");
        two.print();
        Customer three = new Customer("Tori", "NUT ALLERGY");
        three.print();
        Customer four = new Customer("Sumi", "NO RESTRICTION");
        four.print();
        Customer five = new Customer("Maru", "NUT ALLERGY");
        five.print();
        Customer six = new Customer("Rogan", "VEGAN");
        six.print();

    }
}