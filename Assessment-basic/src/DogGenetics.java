import java.lang.reflect.Array;
import java.util.*;

public class DogGenetics {

    public static void main(String args[]) {
        new DogGenetics();
    }

    public DogGenetics() {
        List<String> breeds = List.of("St.Bernard", "Chihuahua", "Dramatic RedNosed Asian Pug", "Common Cur", "King Doberman");
        int total = 0;
        double totalPercent = 100;
        List<Double> percentage = new ArrayList<>();

        Scanner s = new Scanner(System.in);
        System.out.println("What's your dogs name?");
        String name = s.nextLine();
        System.out.println("Well then, I have this highly reliable report on " + name + "'s prestigious background right here. \n");

        System.out.println("Your dog " + name + " is: " + "\n");

        Random rand = new Random();

        //Working out percentages
        for (int i = 0; i < breeds.size(); i++) {
            double randomNum = rand.nextInt(100);
            total += randomNum;
            percentage.add(randomNum);
        }

        //Divide each random value by the total percent of all values added * 100. Then round up in case of decimals
        //Last value takes any extra numbers to make sure it adds up to 100

        for (int i = 0; i < breeds.size(); i++) {
            double breedCent = (percentage.get(i) / total) * 100;
            breedCent = Math.round(breedCent);
            totalPercent -= breedCent; //Checking how much off 100%

            if (i == 4) {
                breedCent += totalPercent; //In case not 100%
                System.out.println((int) breedCent + "% " + breeds.get(i) + "\n");
            } else {
                System.out.println((int) breedCent + "% " + breeds.get(i));
            }
        }
        System.out.println("Wow! That's quite the dog! ");
    }
}
