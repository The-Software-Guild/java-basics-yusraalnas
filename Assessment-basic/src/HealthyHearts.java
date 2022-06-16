import java.util.Scanner;

public class HealthyHearts {

    public static void main(String args[]) {
        new HealthyHearts();
    }

    public HealthyHearts() {
        int age;
        int maxRate = 220;

        System.out.println("Hello!");
        System.out.println("Please enter your age");
        Scanner s = new Scanner(System.in);

        if (!s.hasNextInt()) {
            System.out.println("Error: Please enter a number \n");
        } else {
            age = s.nextInt();
            maxRate -= age;

            System.out.println("Your maximum heart rate should be " + maxRate + " beats per minute.");
            System.out.println("Your target HR Zone is " + Math.round(maxRate * 0.5) + " - " + Math.round(maxRate * 0.85)  + " beats per minute.");
        }

    }
}
