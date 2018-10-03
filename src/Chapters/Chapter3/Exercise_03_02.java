package Chapters.Chapter3;

import java.util.Scanner;

public class Exercise_03_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int answer = 0;
        int correct = 1;
        while (answer != correct){
            int number1 = (int)(Math.random()*10);
            int number2 = (int)(Math.random()*10);
            int number3 = (int)(Math.random()*10);
            correct = number1+number2+number3;
            System.out.printf("What is %d + %d + %d = ", number1, number2, number3);
            answer = input.nextInt();
        }
        System.out.println("You are a goddamn genius. It is correct.");

    }
}
