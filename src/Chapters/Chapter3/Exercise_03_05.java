package Chapters.Chapter3;

import java.util.Scanner;

public class Exercise_03_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        System.out.print("Enter today's day: ");
        int today = input.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int future = (today + input.nextInt()) % 7;

        System.out.printf("Today is %s and the future day is %s\n", days[today], days[future]);



    }
}
