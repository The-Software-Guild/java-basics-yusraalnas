import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SummativeSums {
    public static void main(String args[]) {
        new SummativeSums();
    }

    public SummativeSums(){
        int[] array1 = { 1, 90, -33, -55, 67, -16, 28, -55, 15 };
        int[] array2 = { 999, -60, -77, 14, 160, 301 };
        int[] array3 = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130,
                140, 150, 160, 170, 180, 190, 200, -99 };

        addUp(1, array1);
        addUp(2, array2);
        addUp(3, array3);
    }

    public static void addUp(int number, int[] array){
        int total = 0;

        for (int i: array){
            total += i;
        }
        System.out.println("#" + number + " Array Sum: " + total);

    }
}
