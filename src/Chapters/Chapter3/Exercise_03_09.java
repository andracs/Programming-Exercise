package Chapters.Chapter3;

import java.util.Scanner;

public class Exercise_03_09 {
    public static void main(String[] args) {
        // Lyt på scanner
        Scanner input = new Scanner(System.in);

        // Giv bruger instruks
        System.out.print("Enter an ISBN number as integer: ");
        String isbn = input.nextLine();
        String[] digit = isbn.split("");        // Split hver karakter i isbn

        // Seperer hverr tegn
        int d1 = Integer.parseInt(digit[0]);
        int d2 = Integer.parseInt(digit[1]);
        int d3 = Integer.parseInt(digit[2]);
        int d4 = Integer.parseInt(digit[3]);
        int d5 = Integer.parseInt(digit[4]);
        int d6 = Integer.parseInt(digit[5]);
        int d7 = Integer.parseInt(digit[6]);
        int d8 = Integer.parseInt(digit[7]);
        int d9 = Integer.parseInt(digit[8]);

        int d10 = (d1 + d2*2 + d3*3 + d4*4 + d5*5 + d6*6 + d7*7 + d8*8 + d9*9) % 11; // d1 * 1 kan undværes. Da x * 1 giver x.

        String finalIsbn; // Declare finalIsbn, som skal bruges til at printe det fuldendte ISBN nummer.

        /*
            Hvis digit10 (Altså checksummen) er lig 10,
         */
        if (d10 == 10) {
            finalIsbn = isbn + "X";
        }
        else {
            finalIsbn = isbn + d10;
        }

        // Giv bruger besked hvad ISBN nummeret er
        System.out.println("The ISBN-10 number is " + finalIsbn);



    }
}
