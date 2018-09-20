package Chapters.Chapter1;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        // 1.1
        System.out.println("CHAPTER: 1.1");
        System.out.println("Welcome to Java");
        System.out.println("Welcome to Computer Science");
        System.out.println("Programming is fun");

        // Give me some space
        System.out.println("\n\n");
        // 1.2
        System.out.println("CHAPTER: 1.2");
        String tekst = "Welcome to Java\n";
        System.out.println(tekst+tekst+tekst+tekst+tekst);

        // Give me some space
        System.out.println("\n\n");
        System.out.println("CHAPTER: 1.3");
        System.out.println(""+
                "    J     A     V     V    A\n"+
                "    J    A A     V   V    A A\n"+
                "J   J   AAAAA     V V    AAAAA\n"+
                " J J   A     A     V    A     A "
        );


        // Give me some space
        System.out.println("\n\n");
        System.out.println("CHAPTER: 1.4");

        int startNumber = 1;
        int limit = 5;

        System.out.println("A \t A^2 \t A^3 \t A^4");
        for(int x = startNumber; x <= limit; x++) {
            System.out.println(x + " \t " + Math.pow(x, 2) + " \t " + Math.pow(x, 3) + " \t " + Math.pow(x, 4));
        }

        // Give me some space
        System.out.println("\n\n");
        System.out.println("CHAPTER: 1.5");
        System.out.println("Trying to make a calculation");
        System.out.println((9.5 * 4.5 - 2.5 * 3 )/(45.5 - 3.5));


        // Give me some space
        System.out.println("\n\n");
        System.out.println("CHAPTER: 1.6");

        int i;
        int old = 0;
        for (i = 1; i < 10 ; i++) {
            System.out.println(i);
            old +=i;

        }
        System.out.println(old);


    }
}
