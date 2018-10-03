package Chapters.Chapter3;

import java.util.Scanner;

public class Exercise_03_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a b c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double discriminant = Math.pow(b, 2) - 4 * a * c;

        double root1 = (-b + Math.pow(discriminant, 0.5)) / (2*a);
        double root2 = (-b - Math.pow(discriminant, 0.5)) / (2*a);

        System.out.print("The equation has ");
        if (discriminant > 0){

            System.out.printf("two roots %.4f and %.4f%n", root1, root2 );
        }
        else if (discriminant == 0){
            System.out.printf("The equation has one root %.4f%n", root1);
        }
        else {
            System.out.println("The equation has no real roots.");
        }

    }
}
