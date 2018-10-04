package Chapters.Chapter7;

public class Main {
    public static void main(String[] args) {

        /*
            Some basic testing with arrays and lists
         */
        int[] marks = {64, 84, 69, 71};     // Initialize marks list

        //
        for(int i = 0; i < marks.length; i++){
            System.out.println(marks[i]);
        }

        // Loop through each element in list
        System.out.println("\nForeach loop");
        for (int mark: marks) {         // Initialize int mark
            System.out.println(mark);   // Print mark
        }

    }
}
