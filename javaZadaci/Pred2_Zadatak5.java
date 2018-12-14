package predavanje2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Pred2_Zadatak5 {
    public static void main(String[] args) {

        System.out.println("Please enter the length of the array below: ");
        Scanner input = new Scanner(System.in);
        int arrLeng = input.nextInt();
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        System.out.println("Please enter the values for the array below: ");

        while (numbers.size() < arrLeng) {
            numbers.add(input.nextInt());
        }

        Collections.sort(numbers);

        System.out.println("Enter a number to see if it's in the list: ");
        int checkNum = input.nextInt();

        boolean found = false;

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == checkNum) {
                found = true;
                break;
            }

        }

        if (found) {
            System.out.println(checkNum + " is in the list!");
        } else {
            System.out.println(checkNum + " is not in the list, sorry.");
        }


        System.out.println("And here are the first " + (numbers.size() > 5 ? 5 : numbers.size()) + " numbers in your list: ");

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
            if (i > 3) {
                break;


            }
        }

        input.close();

    }
}
