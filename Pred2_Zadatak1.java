package predavanje2;

import java.util.Scanner;

public class Pred2_Zadatak1 {
    public static void main(String[] args) {

        System.out.println("Please enter any two numbers below: ");
        Scanner input1 = new Scanner(System.in);
        int userInput1 = input1.nextInt();
        int userInput2 = input1.nextInt();
        int even = 0;

        if (userInput1%2 == 0){
            even = userInput1 + 2;
        }
        else{
            even = userInput1 + 1;

        }

        while(even < userInput2){
                System.out.println(even);
                even += 2;
            }
        input1.close();

        }
    }