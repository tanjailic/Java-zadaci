import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Creating a random number
        Random random = new Random();
        int randomNum = random.nextInt(50) + 1;

        //Asking for user to guess the number and getting users input
        System.out.println("Please guess which number I'm thinking of between 1 and 50 and enter it below: ");
        Scanner input = new Scanner(System.in);
        int userNumGuess = 0;

        //Checking is the user input a number
        while (!input.hasNextInt()) {
            System.out.println("Please enter a valid number: ");
            input.next();
        }

        userNumGuess = input.nextInt();

        //Checking is the number between 1 and 50
        if (userNumGuess < 1 || userNumGuess > 50) {
            System.out.println("Please enter a valid number between 1 and 50: ");
            input.nextInt();
        }
        //Checking if user guest the correct number
        if (randomNum == userNumGuess) {
            System.out.println("Amazing! You guessed the right number!");
        } else if (userNumGuess <= randomNum + 5 && userNumGuess >= randomNum - 5) {
            System.out.println("Nice Try! You were close!");
        } else {
            System.out.println("Better luck next time!");
        }

        input.close();

    }
}
