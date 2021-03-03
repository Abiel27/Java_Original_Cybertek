package src.day23_NestedLoop;

public class NestedLoopPractice {

    public static void main(String[] args) {

        for(int j = 1; j <= 15; j++) { // j: 1, 2, 3, 4, 5, 6, 7, 8
            System.out.print("\t\t\t\t");

            for (int i = 1; i <= j; i++) { // i: 1, 2, 3, 4, 5, 6, 7, 8
                System.out.print("* ");
            }
            System.out.println();

        }


    }



}

/*

         *
         **
         ***
         ****
         *****
         ******
         *******
         ********

 */