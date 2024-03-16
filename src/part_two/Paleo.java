package part_two;

import java.util.ArrayList;
import java.util.Arrays;

public class Paleo extends Diet{
    @Override
    ArrayList<String> makeDiet() {
        ArrayList<String> meal = new ArrayList<>();
        ArrayList<String> carbs = new ArrayList<>(
                Arrays.asList("Pistachio"));
        ArrayList<String> protein = new ArrayList<>(
                Arrays.asList("Fish", "Chicken", "Beef"));
        ArrayList<String> fats = new ArrayList<>(
                Arrays.asList("Avocado", "Tuna", "Peanuts"));

        meal.add(Carbs.getInstance(carbs));
        meal.add(Protein.getInstance(protein));
        meal.add(Fats.getInstance(fats));
        return meal;
    }
}
