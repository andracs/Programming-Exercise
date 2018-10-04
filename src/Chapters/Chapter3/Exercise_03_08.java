package Chapters.Chapter3;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_03_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 3 digits: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();

        int iArr[] = {number1, number2, number3};


        System.out.println("You entered this order: ");
        for (int i : iArr){
            System.out.print(i + " ");
        }
        System.out.println("\n\nLets sort it");

        Arrays.sort(iArr);
        System.out.println("The sorted integers: ");
        for (int i : iArr){
            System.out.print(i + " ");
        }

    }
}
