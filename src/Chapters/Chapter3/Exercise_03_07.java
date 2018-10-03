package Chapters.Chapter3;

import java.util.Scanner;

public class Exercise_03_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an amount in int, for example 1156: ");
        int amount = input.nextInt();
        int remainingAmount = amount;

        // Find the number of one dollars
        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount %= 100;

        // Find the number of quarters in the remaining amount
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount %= 25;

        // Find the number of dimes in the remaining amount
        int numberOfDimes = remainingAmount / 10;
        remainingAmount %= 10;

        // Find the number of nickels in the remaining amount
        int numberOfNickels = remainingAmount / 5;
        remainingAmount %= 5;


        // Find the number of pennies in the remaining amount
        int numberOfPennies = remainingAmount;

        String dollar = " dollar";
        String quarter = " quarter";
        String dime = " dime";
        String nickel = " nickel";
        String pennie = " pennie";

        if (numberOfOneDollars > 1) { dollar=" dollars"; }
        if (numberOfQuarters > 1) { quarter=" quarters"; }
        if (numberOfDimes > 1) { dime=" dimes"; }
        if (numberOfNickels > 1) { nickel=" nickels"; }
        if (numberOfPennies > 1) { pennie=" pennies"; }

        // Display results
        System.out.println("Your amount " + amount + " consists of");
        System.out.println(" " + numberOfOneDollars + dollar);
        System.out.println(" " + numberOfQuarters + quarter);
        System.out.println(" " + numberOfDimes + dime);
        System.out.println(" " + numberOfNickels + nickel);
        System.out.println(" " + numberOfPennies + pennie);




    }
}
