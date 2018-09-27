package Chapters.Chapter3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Wife Daniella = new Wife();
        Scanner input = new Scanner(System.in);
/*
        Daniella.setAge(20);
        Daniella.setName("Daniella");
        Daniella.setCrazy(false);
        Daniella.setWeight(53);
        Daniella.setGoodCook(true);
        Daniella.setPretty(true);

        if (Daniella.getAge() > 50){
            System.out.println("LEAVE!");
        }
        if (Daniella.getAge() > 18 && Daniella.getAge() < 49){
            System.out.println(Daniella.getAge() + " years seems reasonable");
            if (Daniella.isPretty == true && Daniella.isGoodCook() == true) {
                System.out.println("Perfect.. Seems good for now. ");
                System.out.println(Daniella.getName() + " can cook... ");

            if (Daniella.isCrazy == true && Daniella.isGoodCook() == false && Daniella.isPretty == true){
                System.out.println("Be careful... Close one... ");
            }

            }

        }
*/
        // Give me some space
        System.out.println("\n\n");
        System.out.println("CHAPTER: 3.24");
        String[] cardsValue = {"Ace","2","3","4","5","6","7","8","9","10","Jack", "Queen", "King"};
        String[] suit = {"Spades", "Clubs", "Diamonds", "Hearts"};

        int cardsValueRandom = (int) (Math.random()*12);
        int suitRandom = (int) (Math.random()*3);
        String card = cardsValue[cardsValueRandom] +" of "+ suit[suitRandom];
        System.out.println("The card you picked is: " + card);


        // Give me some space
        System.out.println("\n\n");
        System.out.println("CHAPTER: 3.25");
        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();

        double a = y1 - y2;
        double b = -1 * (x1 - x2);
        double c = y3 - y4;
        double d = -1 * (x3 - x4);
        double e = (y1 - y2) * x1 - (x1 - x2) * y1;
        double f = (y3 - y4) * x3 - (x3 - x4) * y3;

        if (a * d - b * c == 0)
        {
            System.out.println("The two lines are parallel");
        }
        else
        {
            double x = (e * d - b * f) / (a * d - b * c);
            double y = (a * f - e * c) / (a * d - b * c);
            System.out.println("The intersecting point is at (" + x + ", " + y + ")");
        }


        // Give me some space
        System.out.println("\n\n");
        System.out.println("CHAPTER: 3.26");


    }
}
