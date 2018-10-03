package Chapters.Chapter3;

public class Exercise_03_04 {
    public static void main(String[] args) {

        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int randMonthIndex = (int)(Math.random()*11);
        System.out.println("This Random Month is " + months[randMonthIndex]);


    }
}
