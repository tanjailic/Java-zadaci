package predavanje2;

import java.util.Scanner;

public class Pred2_Zadatak4 {

    private static int add(int userInput1, int userInput2){
        return userInput1 + userInput2;
    }
    private static int subtract(int userInput1, int userInput2){
        return userInput1 - userInput2;
    }
    private static int multiply(int userInput1, int userInput2){
        return userInput1 * userInput2;
    }
    private static int divide(int userInput1, int userInput2){
        return userInput1 / userInput2;
    }

    public static void main(String[] args) {

        boolean finish = true;
        Scanner input = new Scanner(System.in);

        do {

            //Asking user to enter first operand
            System.out.println("Please enter operand values below: ");
            int userInput1, userInput2 = 0;

            //Checking is the user input a number
            while (!input.hasNextInt()) {
                System.out.println("Please enter valid first operand: ");
                input.next();
            }
            System.out.println("Please enter second operand: ");
            while (!input.hasNextInt()) {
                System.out.println("Please enter valid second operand: ");
                input.next();
            }

            userInput1 = input.nextInt();
            userInput2 = input.nextInt();

            System.out.println("Please enter the first letter of the operation you want to perform:\n" +
                    "a for addition\n" +
                    "s for subtraction\n" +
                    "m for multiplication\n" +
                    "d for division ");

            String operator = input.next();

            switch (operator) {
                case "a":
                case "A":
                    System.out.println("Your result is: " + add(userInput1, userInput2));
                    break;
                case "s":
                case "S":
                    System.out.println("Your result is: " + subtract(userInput1, userInput2));
                    break;
                case "m":
                case "M":
                    System.out.println("Your result is: " + multiply(userInput1, userInput2));
                    break;
                case "d":
                case "D":
                    if (userInput2 == 0) {
                        System.out.println("Cannot divide with 0!");
                    } else {
                        System.out.println("Your result is: " + divide(userInput1, userInput2));
                    }
                    break;
                default:
                    System.out.println("Cannot recognize the operation!");
                    finish = false;
            }
        }
         while(finish == true);

        input.close();
    }

}
