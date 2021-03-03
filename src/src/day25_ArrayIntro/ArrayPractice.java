package src.day25_ArrayIntro;

public class ArrayPractice {


    public static void main(String[] args) {

        String[] students = new String[5]; // index: 0, 1, 2, 3, 4
        students[0] = "Agalar";
        students[1] = "Mohammad";
        students[2] = "Afrooz";
        students[3] = "Dargisa";
        students[4] = "Elvira";
/*
        System.out.println( students[0] );
        System.out.println( students[1] );
        System.out.println( students[2] );
        System.out.println( students[3] );
        System.out.println( students[4] );
     //   System.out.println( students[5] );  // array's size is fixed
*/

        for (int i=0; i < students.length; i++){
            System.out.println(students[i]);
        }


// Agalar, Mohammad, Afrooz, Dargisa, Elvira


    }

}
