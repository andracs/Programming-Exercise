package Chapters.Chapter3;

import java.util.Scanner;

public class Exercise_03_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double METERES_FEET = 0.3048;
        final double METERS_INCH = 0.0254;
        final double KILO_PER_POUND = 0.45359237;

        System.out.print("Enter weight in pounds: ");
        double pounds = input.nextDouble();

        System.out.print("Enter feet: ");
        int feet = input.nextInt();

        System.out.print("Enter inches: ");
        double inches = input.nextDouble();

        double kg = pounds * KILO_PER_POUND;
        double meters = feet * METERES_FEET + inches * METERS_INCH;
        double bmi = kg / Math.pow(meters,2);

        System.out.printf("BMI is %f%n", bmi);

        if (bmi <= 18.5) {
            System.out.println("Underweight");
        }
        else if (bmi >= 18.5 && bmi <= 24.9){
            System.out.println("Normal weight");
        }
        else if (bmi >= 25 && bmi <= 29.9){
            System.out.println("Pre obesity");
        }
        else if (bmi >= 30 && bmi <= 34.9){
            System.out.println("Obesity class I");
        }
        else if (bmi >= 35 && bmi <= 39.9){
            System.out.println("Obesity class II");
        }
        else if (bmi >= 40){
            System.out.println("Obesity class III");
        }
        else {
            System.out.println("Cant calculate... ");
        }

    }
}
