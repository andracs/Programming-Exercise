package Chapters.Chapter4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        // Give me some space
        System.out.println("\n\n");
        System.out.println("CHAPTER: 4.1");
        System.out.print("Enter the length from the center to a vertex: ");
        double radius = input.nextDouble();
        double penS = 2 * radius * Math.sin(Math.PI / 5);
        double penArea = (5 * Math.pow(penS,2)) / (4 * Math.tan(Math.PI/5));
        System.out.printf("The area of the pentagon is %.2f", penArea);


    }



}
