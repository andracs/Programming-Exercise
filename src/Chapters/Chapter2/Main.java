package Chapters.Chapter2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        // Give me some space
        System.out.println("\n\n");
        System.out.println("CHAPTER: 2.1");
        System.out.print("Enter a degree in Celsius: ");
        double celsius = input.nextDouble();
        double fahrenheit = (9.0 / 5) * celsius + 32;
        System.out.printf("%.1f Celsius is %.1f Fahrenheit%n", celsius, fahrenheit);



        // Give me some space
        System.out.println("\n\n");
        System.out.println("CHAPTER: 2.2");
        input = new Scanner(System.in);
        System.out.print("Enter the radius and length of a cylinder: ");
        String[] radLen = input.nextLine().split(" ");
        double radius = Double.parseDouble(radLen[0]);
        double length = Double.parseDouble(radLen[1]);
        double area = radius * radius * Math.PI;
        double volume = area * length;
        System.out.printf("The area is %.4f %nThe volume is %.1f", area, volume);



        // Give me some space
        System.out.println("\n\n");
        System.out.println("CHAPTER: 2.3");
        input = new Scanner(System.in);
        System.out.print("Enter a value for feet: ");
        double feet = input.nextDouble();
        double meter = feet * 0.305;
        System.out.printf("%.1f feet is %.4f meters", feet, meter);


        // Give me some space
        System.out.println("\n\n");
        System.out.println("CHAPTER: 2.4");
        System.out.println("Convert pounds into kilogram");
        input = new Scanner(System.in);
        System.out.print("Enter a number in pounds: ");
        double pounds = input.nextDouble();
        double kg = pounds * 0.454;
        System.out.printf("%.1f pounds is %.3f kilograms", pounds, kg);

        // Give me some space
        System.out.println("\n\n");
        System.out.println("CHAPTER: 2.5");
        input = new Scanner(System.in);
        System.out.print("Enter the subtotal and a gratuity rate: ");
        String[] subtotal_gratuity = input.nextLine().split(" ");
        double subtotal = Double.parseDouble(subtotal_gratuity[0]);
        double gratuity = (Double.parseDouble(subtotal_gratuity[1]) / 100) * subtotal;
        double total = subtotal + gratuity;
        System.out.printf("The gratuity is $%.1f and total is $%.1f ", gratuity, total);


        // Give me some space
        System.out.println("\n\n");
        System.out.println("CHAPTER: 2.6");
        input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000: ");
        int integer = input.nextInt();

        int lessThan10 = integer % 10;
        integer /= 10;
        int tens = integer % 10;
        integer /= 10;
        int hundreds = integer % 10;
        integer /= 10;
        int sum = hundreds + tens + lessThan10;

        System.out.println("The sum of the digits is " + sum);


        // Give me some space
        System.out.println("\n\n");
        System.out.println("CHAPTER: 2.7");
        input = new Scanner(System.in);
        System.out.print("Enter the number of minute: ");
        int minutes = input.nextInt();

        final int MINUTES_DAY = 60*24;
        final int DAYS_YEAR = 365;

        int totalDays = minutes/MINUTES_DAY;
        int years = totalDays/DAYS_YEAR;
        int days = totalDays%DAYS_YEAR;
        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");



        // Give me some space
        System.out.println("\n\n");
        System.out.println("CHAPTER: 2.8");
        input = new Scanner(System.in);
        System.out.print("Enter the time zone offset to GMT: ");
        int gmt_offset = input.nextInt();

        // Obtain the total milliseconds since midnight, Jan 1, 1970
        long totalMilliseconds = System.currentTimeMillis();

        // Obtain the total seconds since midnight, Jan 1, 1970
        long totalSeconds = totalMilliseconds / 1000;

        // Compute the current second in the minute in the hour
        long currentSecond = totalSeconds % 60;

        // Obtain the total minutes
        long totalMinutes = totalSeconds / 60;

        // Compute the current minute in the hour
        long currentMinute = totalMinutes % 60;

        // Obtain the total hours
        long totalHours = (totalMinutes + gmt_offset*60 )/ 60;

        // Compute the current hour
        long currentHour = totalHours % 24;

        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");


        // Give me some space
        System.out.println("\n\n");
        System.out.println("CHAPTER: 2.9");
        input = new Scanner(System.in);
        System.out.print("Enter v0, v1, and t: ");
        String[] accelerationInput = input.nextLine().split(" ");
        double v1 = Double.parseDouble(accelerationInput[0]);
        double v2 = Double.parseDouble(accelerationInput[1]);
        double time = Double.parseDouble(accelerationInput[2]);
        double acceleration = (v2-v1)/time;
        System.out.printf("The average acceleration is %f", acceleration);


        // Give me some space
        System.out.println("\n\n");
        System.out.println("CHAPTER: 2.10");
        input = new Scanner(System.in);
        System.out.print("Enter the amount of water in kilograms: ");
        double kilograms = input.nextDouble();
        System.out.print("Enter the initial temperature: ");
        double initialTemp = input.nextDouble();
        System.out.print("Enter the final temperature: ");
        double finalTemp = input.nextDouble();

        double energy = kilograms * (finalTemp - initialTemp) * 4184;
        System.out.println("The energy needed is " + energy);


        // Give me some space
        System.out.println("\n\n");
        System.out.println("CHAPTER: 2.11");
        input = new Scanner(System.in);

        System.out.print("Enter the number of years: ");
        int years = input.nextInt();

        double currentPopulation    = 312032486;

        double secondsPerDay        = 3600*24;
        double birthPerDay          = secondsPerDay/7;
        double deathsPerDay         = secondsPerDay/13;
        double immigrantsPerDay     = secondsPerDay/45;

        double daysPerYear          = 365;
        double birthsPerYear        = birthPerDay*daysPerYear;
        double deathsPerYear        = deathsPerDay*daysPerYear;
        double immigrantsPerYear    = immigrantsPerDay*daysPerYear;

        for (int i = 1; i <= years; i++) {
            double births = birthsPerYear*i;
            double deaths = deathsPerYear*i;
            double immigrants = immigrantsPerYear*i;

            double peopleOnEarth = currentPopulation + births + immigrants - deaths;
            System.out.printf("Year: %d \tPopulation: %.0f%n", i, peopleOnEarth);

        }

        // Give me some space
        System.out.println("\n\n");
        System.out.println("CHAPTER: 2.12");
        input = new Scanner(System.in);

        System.out.print("Enter speed and acceleration: ");
        double speed = input.nextDouble();
        double acceleration = input.nextDouble();
        double length = Math.pow(speed, 2) / (2 * acceleration);

        System.out.println("The minimum runway length for this airplane is " + length);

        final double MONTHLY_INTEREST_RATE = 0.00417;

        System.out.print("Enter the monthly saving amount: ");
        double savingAmount = input.nextDouble();
        double total = 0;

        for (int i = 1; i <= 6 ; i++) {
            total = (savingAmount + total) * (1 + MONTHLY_INTEREST_RATE);
            System.out.println("Month: " + i + "\tSavings: " + total);
        }
*/


        // Give me some space
        System.out.println("\n\n");
        System.out.println("CHAPTER: 2.14");
        input = new Scanner(System.in);

        final double KILOGRAMS_PER_POUND = .45359237;
        final double METERS_PER_INCH = .0254;

        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();
        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();

        weight = weight * KILOGRAMS_PER_POUND;
        height = height * METERS_PER_INCH;
        double bmi = weight / Math.pow(height, 2);
        System.out.println("BMI is " + bmi);







    }

}
