package part_two;
import java.util.ArrayList;
import java.util.Random;

public class Protein {
    private static Protein protein = null;
    private Protein(){}
    public static String getInstance(ArrayList<String> listOfProtein) {
        String random = null;
        if(protein == null){
            protein = new Protein();
            Random rand = new Random();
            int index = rand.nextInt(listOfProtein.size());
            random = listOfProtein.get(index);
        }
        return random;
    }
}
