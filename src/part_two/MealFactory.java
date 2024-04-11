package part_two;
import java.util.ArrayList;

public class MealFactory {
    public static Diet getDiet(String type) {
        switch (type) {
            case "PALEO":
                return new Paleo();
            case "VEGAN":
                return new Vegan();
            case "NUT ALLERGY":
                return new NutAllergy();
            case "NO RESTRICTION":
                return new NoRestriction();
            default:
                return null;
        }
    }
    public static ArrayList getMeal(String type) {
        Diet diet = getDiet(type);
        ArrayList meal = diet.makeDiet();
        return meal;
    }
}
