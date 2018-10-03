package Chapters.Chapter3;

import java.util.Scanner;

public class Exercise_03_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the years as integer: ");
        int year = input.nextInt();

        System.out.print("Enter the month as integer: ");
        int month = input.nextInt();

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        switch (month){
            case 1: System.out.printf("%d - January had 31 days", year); break;
            case 2: if (isLeapYear){
                        System.out.printf("%d - February had 29 days", year);
                    }else {
                        System.out.printf("%d - February had 28 days", year);
                    }
                    break;
            case 3: System.out.printf("%d - March had 31 days", year); break;
            case 4: System.out.println("April " + year + " had 30 days"); break;
            case 5: System.out.println("May " + year + " had 31 days"); break;
            case 6: System.out.println("June " + year + " had 30 days"); break;
            case 7: System.out.println("July " + year + " had 31 days"); break;
            case 8: System.out.println("August " + year + " had 31 days"); break;
            case 9: System.out.println("September " + year + " had 30 days"); break;
            case 10: System.out.println("October " + year + " had 31 days"); break;
            case 11: System.out.println("November " + year + " had 30 days"); break;
            case 12: System.out.println("December " + year + " had 31 days"); break;
            default: System.out.println("Try again");

        }

    }
}
