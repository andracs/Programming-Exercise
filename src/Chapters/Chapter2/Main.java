package Chapters.Chapter2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Give me some space
        System.out.println("\n\n");
        System.out.println("CHAPTER: 2.2");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble();

        double areal = radius * radius * Math.PI;

        System.out.println("Radius: " + radius + "\nAreal: " + areal);

    }
}
