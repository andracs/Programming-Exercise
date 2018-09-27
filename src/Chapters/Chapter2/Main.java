package Chapters.Chapter2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        // OPGAVE 2.1
        //=========================================
        // Give me some space
        System.out.println("\n\n");
        System.out.println("CHAPTER: 2.1");
        System.out.print("Enter a degree in Celsius: ");
        double celsius = input.nextDouble();
        double fahrenheit = (9.0 / 5) * celsius + 32;
        System.out.printf("%.1f Celsius is %.1f Fahrenheit%n", celsius, fahrenheit);


        // OPGAVE 2.2
        //=========================================
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


        // OPGAVE 2.3
        //=========================================
        // Give me some space
        System.out.println("\n\n");
        System.out.println("CHAPTER: 2.3");
        input = new Scanner(System.in);
        System.out.print("Enter a value for feet: ");
        double feet = input.nextDouble();
        double meter = feet * 0.305;
        System.out.printf("%.1f feet is %.4f meters", feet, meter);

        // OPGAVE 2.4
        //=========================================
        // Give me some space
        System.out.println("\n\n");
        System.out.println("CHAPTER: 2.4");
        System.out.println("Convert pounds into kilogram");
        input = new Scanner(System.in);
        System.out.print("Enter a number in pounds: ");
        double pounds = input.nextDouble();
        double kg = pounds * 0.454;
        System.out.printf("%.1f pounds is %.3f kilograms", pounds, kg);


        // OPGAVE 2.5
        //=========================================
        // Give me some space
        System.out.println("\n\n");
        System.out.println("CHAPTER: 2.5");
        input = new Scanner(System.in);
        System.out.print("Enter the subtotal and a gratuity rate: ");
        String[] subtotal_gratuity = input.nextLine().split(" ");
        double subtotal = Double.parseDouble(subtotal_gratuity[0]);
        double gratuity = (Double.parseDouble(subtotal_gratuity[1]) / 100) * subtotal;
        double totalFinancial = subtotal + gratuity;
        System.out.printf("The gratuity is $%.1f and total is $%.1f ", gratuity, totalFinancial);

        // OPGAVE 2.6
        //=========================================
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
        int sum = hundreds + tens + lessThan10;

        System.out.println("The sum of the digits is " + sum);


        // OPGAVE 2.7
        //=========================================
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


        // OPGAVE 2.8
        //=========================================
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

        // OPGAVE 2.9
        //=========================================
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


        // OPGAVE 2.10
        //=========================================
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


        // OPGAVE 2.11
        //=========================================
        // Give me some space
        System.out.println("\n\n");
        System.out.println("CHAPTER: 2.11");
        input = new Scanner(System.in);

        System.out.print("Enter the number of years: ");
        int birthYears = input.nextInt();

        double currentPopulation    = 312032486;

        double secondsPerDay        = 3600*24;
        double birthPerDay          = secondsPerDay/7;
        double deathsPerDay         = secondsPerDay/13;
        double immigrantsPerDay     = secondsPerDay/45;

        double daysPerYear          = 365;
        double birthsPerYear        = birthPerDay*daysPerYear;
        double deathsPerYear        = deathsPerDay*daysPerYear;
        double immigrantsPerYear    = immigrantsPerDay*daysPerYear;

        for (int i = 1; i <= birthYears; i++) {
            double births = birthsPerYear*i;
            double deaths = deathsPerYear*i;
            double immigrants = immigrantsPerYear*i;

            double peopleOnEarth = currentPopulation + births + immigrants - deaths;
            System.out.printf("Year: %d \tPopulation: %.0f%n", i, peopleOnEarth);
        }


        // OPGAVE 2.12
        //=========================================
        // Give me some space
        System.out.println("\n\n");
        System.out.println("CHAPTER: 2.12");
        input = new Scanner(System.in);

        System.out.print("Enter speed and acceleration: ");
        double speed = input.nextDouble();
        double accelerationSpeed = input.nextDouble();
        double lengthSpeed = Math.pow(speed, 2) / (2 * accelerationSpeed);

        System.out.println("The minimum runway length for this airplane is " + lengthSpeed);

        // OPGAVE 2.13
        //=========================================
        // Give me some space
        System.out.println("\n\n");
        System.out.println("CHAPTER: 2.13");
        final double MONTHLY_INTEREST_RATE = 0.00417;
        System.out.print("Enter the monthly saving amount: ");
        double savingAmount = input.nextDouble();
        double total = 0;

        for (int i = 1; i <= 6 ; i++) {
            total = (savingAmount + total) * (1 + MONTHLY_INTEREST_RATE);
            System.out.println("Month: " + i + "\tSavings: " + total);
        }


        // OPGAVE 2.14
        //=========================================
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


        // OPGAVE 2.15
        //=========================================
        // Give me some space
        System.out.println("\n\n");
        System.out.println("CHAPTER: 2.15");
        System.out.print("Enter x1 and y1: ");
        double disX1 = input.nextDouble();
        double disY1 = input.nextDouble();
        System.out.print("Enter x2 and y2: ");
        double disX2 = input.nextDouble();
        double disY2 = input.nextDouble();
        double disA = Math.pow((disX2 - disX1),2) + Math.pow((disY2 - disY1),2);
        double distance = Math.pow(disA,0.5);
        System.out.println("The distance between the two points is: " + distance);


        // OPGAVE 2.16
        //=========================================
        // Give me some space
        System.out.println("\n\n");
        System.out.println("CHAPTER: 2.16");
        System.out.print("Enter the side: ");
        double hexSide = input.nextDouble();
        double hexArea = ((3 * Math.pow(3,0.5)) / 2) * Math.pow(hexSide,2);
        System.out.println("The area of the hexagon is: " + hexArea);


        // OPGAVE 2.17
        //=========================================
        // Give me some space
        System.out.println("\n\n");
        System.out.println("CHAPTER: 2.17");
        System.out.print("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
        double tempFahr = input.nextDouble();
        System.out.print("Enter the wind speed (>=2) in miles per hour: ");
        double windSpeedMph = input.nextDouble();

        double windChillIndex = 35.74 + 0.6215 * tempFahr - 35.75 * Math.pow(windSpeedMph,0.16) + 0.4275 * tempFahr * Math.pow(windSpeedMph,0.16);
        System.out.printf("The wind chill index is: %.5f%n", windChillIndex);


        // OPGAVE 2.18
        //=========================================
        // Give me some space
        System.out.println("\n\n");
        System.out.println("CHAPTER: 2.18");
        System.out.println("a\tb\tpow(a,b)");
        for (byte tableA = 1; tableA <= 5; tableA++) {
            System.out.printf("%d\t%d\t%.0f%n", tableA, tableA+1, Math.pow(tableA, tableA+1));

        }


        // OPGAVE 2.19
        //=========================================
        // Give me some space
        System.out.println("\n\n");
        System.out.println("CHAPTER: 2.19");
        System.out.print("Enter three points for a triangle: ");
        double triX1 = input.nextDouble();
        double triY1 = input.nextDouble();
        double triX2 = input.nextDouble();
        double triY2 = input.nextDouble();
        double triX3 = input.nextDouble();
        double triY3 = input.nextDouble();

        double triSide1 = Math.pow(Math.pow(triX2 - triX1, 2) + Math.pow(triY2 - triY1, 2), 0.5);
        double triSide2 = Math.pow(Math.pow(triX3 - triX2, 2) + Math.pow(triY3 - triY2, 2), 0.5);
        double triSide3 = Math.pow(Math.pow(triX1 - triX3, 2) + Math.pow(triY1 - triY3, 2), 0.5);
        double triS     = (triSide1 + triSide2 + triSide3) / 2;
        double triArea  = Math.pow(triS * (triS - triSide1) * (triS - triSide2) * (triS - triSide3), 0.5);
        System.out.println("The area of the triangle is: " + triArea);



        // OPGAVE 2.20
        //=========================================
        // Give me some space
        System.out.println("\n\n");
        System.out.println("CHAPTER: 2.20");
        System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
        double financeBalance = input.nextDouble();
        double financeInterest = input.nextDouble();
        double interestOut = financeBalance * (financeInterest/1200);
        System.out.println("The interest is: " + interestOut);


        // OPGAVE 2.21
        //=========================================
        // Give me some space
        System.out.println("\n\n");
        System.out.println("CHAPTER: 2.21");
        System.out.print("Enter investment amount: ");
        double investmentAmount = input.nextDouble();
        System.out.print("Enter annual interest rate in percentage: ");
        double annInterest = input.nextDouble();
        double monthlyInterest = annInterest/1200;
        System.out.print("Enter number og years: ");
        int numYears = input.nextInt();


        double futureInvestmentVal = investmentAmount * Math.pow(1 + monthlyInterest, numYears*12);
        System.out.println("Accumulated value is $" + futureInvestmentVal);




        // OPGAVE 2.22
        //=========================================
        // Give me some space
        System.out.println("\n\n");
        System.out.println("CHAPTER: 2.22");

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

        // Display results
        System.out.println("Your amount " + amount + " consists of");
        System.out.println(" " + numberOfOneDollars + " dollars");
        System.out.println(" " + numberOfQuarters + " quarters");
        System.out.println(" " + numberOfDimes + " dimes");
        System.out.println(" " + numberOfNickels + " nickels");
        System.out.println(" " + numberOfPennies + " pennies");



        // OPGAVE 2.23
        //=========================================
        // Give me some space
        System.out.println("\n\n");
        System.out.println("CHAPTER: 2.23");
        System.out.print("Enter the driving distance: ");
        double driveDistance = input.nextDouble();
        System.out.print("Enter miles per gallon: ");
        double driveMilesPerGallon = input.nextDouble();
        System.out.print("Enter price per gallon: ");
        double drivePricePerGallon = input.nextDouble();

        double driveCost = (driveDistance / driveMilesPerGallon) * drivePricePerGallon;
        System.out.printf("The cost of driving is $%.2f", driveCost);

    }

}
