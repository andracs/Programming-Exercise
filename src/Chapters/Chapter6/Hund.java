package Chapters.Chapter6;

public class Hund {
    public static void main(String[] args) {

    }
    public Hund bark(String a){
        System.out.println(a);
        return this;
    }
    public Hund puke(int amount){
        for (int i = 0; i < amount; i++) {
            System.out.println("*puking*");
        }
        return this;
    }
}
