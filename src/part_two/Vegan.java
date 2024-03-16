package part_two;

import java.util.ArrayList;
import java.util.Arrays;

public class Vegan extends Diet{
    @Override
    ArrayList<String> makeDiet() {
        ArrayList<String> meal = new ArrayList<>();
        ArrayList<String> carbs = new ArrayList<>(
                Arrays.asList("Bread", "Lentils","Pistachio"));
        ArrayList<String> protein = new ArrayList<>(
                Arrays.asList("Tofu"));
        ArrayList<String> fats = new ArrayList<>(
                Arrays.asList("Avocado", "Peanuts"));

        meal.add(Carbs.getInstance(carbs));
        meal.add(Protein.getInstance(protein));
        meal.add(Fats.getInstance(fats));
        return meal;
    }
}
