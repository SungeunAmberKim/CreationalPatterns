package part_two;

import java.util.ArrayList;

public class Customer {
    private String name;
    private String dietPlan;
    private ArrayList meal;

    public Customer(String name, String dietPlan) {
        this.name = name;
        this.dietPlan = dietPlan;
        MealFactory mealFactory = new MealFactory();
        this.meal = mealFactory.getMeal(dietPlan);
    }

    public void print() {
        System.out.println("Name: " +this.name);
        System.out.println("Diet Plan: " + this.dietPlan);
        System.out.print("Meal: ");
        for(int i = 0; i < meal.size(); i++) {
            System.out.print(meal.get(i) + " ");
        }
        System.out.println();

    }


}
