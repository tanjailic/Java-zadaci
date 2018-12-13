package predavanje2;

import java.util.Random;
import java.util.Scanner;

public class Pred2_Zadatak3 {

    public static int guessNum ( int userNumGuess, int randomNum){
        if (randomNum == userNumGuess) {
            System.out.println("Amazing! You guessed the right number!");
            return 2;
        } else if (userNumGuess <= randomNum + 5 && userNumGuess >= randomNum - 5) {
            System.out.println("Nice Try! You were close!");
            return 1;
        } else {
            System.out.println("Better luck next time!");
            return 0;
        }
    }

    public static void main(String[] args) {
        //Creating a random number
        Random random = new Random();
        int randomNum = random.nextInt(50) + 1;

        //Asking for user to guess the number and getting users input
        System.out.println("Please guess which number I'm thinking of between 1 and 50 and enter it below: ");
        Scanner input = new Scanner(System.in);
        int userNumGuess = 0;

        do {
            while (!input.hasNextInt()) {
                System.out.println("Please enter a valid number: ");
                input.next();
            }
            System.out.println("Guess again!");
            userNumGuess = input.nextInt();


        }
        while (guessNum(userNumGuess, randomNum) != 2);
        System.out.println("It was " + randomNum);

        input.close();

        }

    }
