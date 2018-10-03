package Chapters.Chapter1;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        // OPGAVE 1.1
        //=========================================
        System.out.println("CHAPTER: 1.1");
        System.out.println("Welcome to Java");
        System.out.println("Welcome to Computer Science");
        System.out.println("Programming is fun");


        // OPGAVE 1.2
        //=========================================
        // Give me some space and title
        System.out.println("\n\nCHAPTER: 1.2");
        String tekst = "Welcome to Java\n";
        System.out.println(tekst+tekst+tekst+tekst+tekst);


        // OPGAVE 1.3
        //=========================================
        // Give me some space and title
        System.out.println("\n\nCHAPTER: 1.3");
        System.out.println(""+
                "    J     A     V     V    A\n"+
                "    J    A A     V   V    A A\n"+
                "J   J   AAAAA     V V    AAAAA\n"+
                " J J   A     A     V    A     A "
        );


        // OPGAVE 1.4
        //=========================================
        // Give me some space and title
        System.out.println("\n\nCHAPTER: 1.4");

        int startNumber = 1;
        int limit = 5;

        System.out.println("A \t A^2 \t A^3 \t A^4");
        for(int x = startNumber; x <= limit; x++) {
            System.out.println(x + " \t " + Math.pow(x, 2) + " \t " + Math.pow(x, 3) + " \t " + Math.pow(x, 4));
        }


        // OPGAVE 1.5
        //=========================================
        // Give me some space and title
        System.out.println("\n\nCHAPTER: 1.5");
        System.out.println("Trying to make a calculation");
        System.out.println((9.5 * 4.5 - 2.5 * 3 )/(45.5 - 3.5));


        // OPGAVE 1.6
        //=========================================
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


        // OPGAVE 1.7
        //=========================================
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


        // OPGAVE 1.8
        //=========================================
        // Give me some space and title
        System.out.println("\n\nCHAPTER: 1.8");
        System.out.println("Area and perimeter of circle");
        double radius = 5.5;
        double circlePerimeter = 2 * radius * Math.PI;
        double circleArea = radius * radius * Math.PI;
        System.out.println("radius: " + radius);
        System.out.println("perimater: " + circlePerimeter);
        System.out.println("Area: " + circleArea);


        // OPGAVE 1.9
        //=========================================
        // Give me some space and title
        System.out.println("\n\nCHAPTER: 1.9");
        System.out.println("Area and perimeter of a rectangle");
        double rectangleWidth = 4.5;
        double rectangleHeight = 7.9;
        double rectangleArea = rectangleWidth*rectangleHeight;
        System.out.println("Area of rectangle: " + rectangleArea);


        // OPGAVE 1.10
        //=========================================
        // Give me some space and title
        System.out.println("\n\nCHAPTER: 1.10");
        double miles = 14/1.6;
        System.out.printf("Avg. speed in mph: %.2f%n", (miles/45.5)*60);


        // OPGAVE 1.11
        //=========================================
        // Give me some space and title
        System.out.println("\n\nCHAPTER: 1.11");

        double currentPopulation    = 312032486;
        
        double secondsPerDay        = 3600*24;
        double birthPerDay          = secondsPerDay/7;
        double deathsPerDay         = secondsPerDay/13;
        double immigrantsPerDay     = secondsPerDay/45;

        double daysPerYear          = 365;
        double birthsPerYear        = birthPerDay*daysPerYear;
        double deathsPerYear        = deathsPerDay*daysPerYear;
        double immigrantsPerYear    = immigrantsPerDay*daysPerYear;

        for (int i = 1; i <= 5; i++) {
            double births = birthsPerYear*i;
            double deaths = deathsPerYear*i;
            double immigrants = immigrantsPerYear*i;

            double peopleOnEarth = currentPopulation + births + immigrants - deaths;
            System.out.printf("Year: %d \tPopulation: %.0f%n", i, peopleOnEarth);

        }


        // OPGAVE 1.12
        //=========================================
        // Give me some space and title
        System.out.println("\n\nCHAPTER: 1.12");
        System.out.println("Average speed in kilometers");
        double km = 24*1.6;
        int hours = 1;
        int minutes = 40;
        int seconds = 35;
        double timeSpentInSec = hours*3600 + minutes*60 + seconds;
        double avgSpeedKmh = (km/timeSpentInSec) *3600;
        System.out.printf("Avg. speed in mph: %.2f%n", avgSpeedKmh);


        // OPGAVE 1.13
        //=========================================
        // Give me some space and title
        System.out.println("\n\nCHAPTER: 1.13");
        System.out.println("Algebra");
        double a, b, c, d, e, f;
        a = 3.4;
        b = 50.2;
        c = 2.1;
        d = 0.55;
        e = 44.5;
        f = 5.9;
        double x = (e*d - b*f) / (a*d - b*c);
        double y = (a*f - e*c) / (a*d - b*c);

        System.out.printf("x=%f, y=%f\n", x, y );
    }
}
