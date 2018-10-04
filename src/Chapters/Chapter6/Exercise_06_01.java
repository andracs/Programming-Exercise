package Chapters.Chapter6;

public class Exercise_06_01 {

    private static int getPentagonalNumber(int n){
        return n * (3 * n - 1) / 2;
    }

    public static void main(String[] args) {
        final int LINE_LIMIT = 10;

        for (int i = 1; i<= 100; i++){
            if (i % LINE_LIMIT == 0){
                System.out.println(getPentagonalNumber(i) + " ");
            }
            else {
                System.out.print(getPentagonalNumber(i) + " ");
            }
        }
    }
}
