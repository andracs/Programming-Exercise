package Chapters.Chapter3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Wife Daniella = new Wife();


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


    }
}
