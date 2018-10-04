package Chapters.Chapter6;

public class Exercise_06_02 {
    private static int sumDigits(long n){
        long sum = 0;

        if (n > Long.MAX_VALUE){
            System.out.println("Number to large");
            System.exit(0);
        }

        while (true){
            if (n < 10){
                sum += n;
                break;
            }
            else {
                sum += n % 10;
                n /= 10;
            }
        }
        return (int)sum;
    }


    public static void main(String[] args) {
        System.out.println(sumDigits(123456789));
    }
}
