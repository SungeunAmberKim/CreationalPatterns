package part_two;
import java.util.ArrayList;
import java.util.Random;

public class Carbs {
    private static Carbs carbs = null;
    private Carbs(){}
    public static String getInstance(ArrayList<String> listOfCarbs) {
        String randomCarbs = null;
        if(carbs == null){
            carbs = new Carbs();
            Random rand = new Random();
            int index = rand.nextInt(listOfCarbs.size());
            randomCarbs = listOfCarbs.get(index);
        }
        return randomCarbs;
    }
}
