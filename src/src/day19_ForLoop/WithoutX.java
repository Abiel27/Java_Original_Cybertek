package src.day19_ForLoop;

import java.util.Scanner;

public class WithoutX {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = scan.nextLine();

        if(word.toLowerCase().startsWith("x") ){
            System.out.println( word.substring(1) );
        }else {
            System.out.println( word );
        }

        System.out.println("========================================");

        char firstChar = word.charAt(0);

        if(firstChar == 'X' || firstChar == 'x'){
            System.out.println( word.substring(1) );
        }else {
            System.out.println(word);
        }

        System.out.println("======================================");

        String s1 = word.substring(0,1); // ending index is excluded

        if(s1.equalsIgnoreCase("x")){
            System.out.println( word.substring(1) );
        }else{
            System.out.println(word);
        }






    }

}

/*
2. Ask user to enter a word. If the work starts with x, print the word without x.
                    Input:
                        xcode
                    Output:
                        code

                    xxcode
                     xcode

 */