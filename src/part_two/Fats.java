package part_two;
import java.util.ArrayList;
import java.util.Random;

public class Fats {
    private static Fats fats = null;
    private Fats(){}
    public static String getInstance(ArrayList<String> listOfFats) {
        String random = null;
        if(fats == null){
            fats = new Fats();
            Random rand = new Random();
            int index = rand.nextInt(listOfFats.size());
            random = listOfFats.get(index);
        }
        return random;
    }
}
