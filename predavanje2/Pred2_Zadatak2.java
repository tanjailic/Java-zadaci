package predavanje2;

import java.util.Map;
import java.util.Scanner;

public class Pred2_Zadatak2 {
    public static void main(String[] args){

        //Asking for the number of students
        System.out.println("Please enter the number of students that performed the test: ");
        Scanner sc = new Scanner(System.in);
        int numOfStudents = sc.nextInt();
        String[] names = new String[numOfStudents];
        int[] score = new int[numOfStudents];
        int temp = 0;


        for(int i = 0; i < numOfStudents; i++){
            System.out.println("Please insert the name of the student and their test score: ");
            String student = sc.next();
            names[i] = student;
            int testScore = sc.nextInt();
            score[i] = testScore;
            }

        String name = names[0];
        temp = score[0];
        for(int i = 0; i < score.length -1; i++){
            if(score[i] > score[i +1]){
                temp = score[i];
                name = names[i];
                }
        }
        System.out.println(name + " " + temp);

        }
    }
