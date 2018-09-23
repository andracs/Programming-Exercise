package Chapters.Chapter1;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        // 1.1
        System.out.println("CHAPTER: 1.1");
        System.out.println("Welcome to Java");
        System.out.println("Welcome to Computer Science");
        System.out.println("Programming is fun");

        // Give me some space and title
        System.out.println("\n\nCHAPTER: 1.2");
        String tekst = "Welcome to Java\n";
        System.out.println(tekst+tekst+tekst+tekst+tekst);

        // Give me some space and title
        System.out.println("\n\nCHAPTER: 1.3");
        System.out.println(""+
                "    J     A     V     V    A\n"+
                "    J    A A     V   V    A A\n"+
                "J   J   AAAAA     V V    AAAAA\n"+
                " J J   A     A     V    A     A "
        );


        // Give me some space and title
        System.out.println("\n\nCHAPTER: 1.4");

        int startNumber = 1;
        int limit = 5;

        System.out.println("A \t A^2 \t A^3 \t A^4");
        for(int x = startNumber; x <= limit; x++) {
            System.out.println(x + " \t " + Math.pow(x, 2) + " \t " + Math.pow(x, 3) + " \t " + Math.pow(x, 4));
        }

        // Give me some space and title
        System.out.println("\n\nCHAPTER: 1.5");
        System.out.println("Trying to make a calculation");
        System.out.println((9.5 * 4.5 - 2.5 * 3 )/(45.5 - 3.5));


        // Give me some space and title
        System.out.println("\n\nCHAPTER: 1.6");


        int old = 0;
        for (int i = 1; i < 10 ; i++) {
            old +=i;

            if (i == 9){
                System.out.print(i);
                System.out.println(" = " +old);
            }
            else {
                System.out.print(i + "+");
            }

        }



        // Give me some space and title
        System.out.println("\n\nCHAPTER: 1.7");
        System.out.println("Calculating pi...\nOpgave 1.7");
        double pi = 4 * (1.0 - (1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11));
        System.out.println(pi);


        System.out.println("\nThe best and most tastefull pi in a for loop");
        double calculatePi = 0;
        boolean switcher = true;
        for (double i = 3; i < 6000000  ; i+=2) {
            if (switcher){
                calculatePi += 1/i;
            }
            else {
                calculatePi -= 1/i;
            }
            switcher = !switcher;
        }
        System.out.println(4 * (1 - calculatePi));
        System.out.println("\nJava's pi calculation: " + Math.PI);


        // Give me some space and title
        System.out.println("\n\nCHAPTER: 1.8");
        System.out.println("Area and perimeter of circle");
        double radius = 5.5;
        double circlePerimeter = 2 * radius * Math.PI;
        double circleArea = radius * radius * Math.PI;
        System.out.println("radius: " + radius);
        System.out.println("perimater: " + circlePerimeter);
        System.out.println("Area: " + circleArea);


        // Give me some space and title
        System.out.println("\n\nCHAPTER: 1.9");
        System.out.println("Area and perimeter of a rectangle");
        double rectangleWidth = 4.5;
        double rectangleHeight = 7.9;
        double rectangleArea = rectangleWidth*rectangleHeight;
        System.out.println("Area of rectangle: " + rectangleArea);



    }
}
