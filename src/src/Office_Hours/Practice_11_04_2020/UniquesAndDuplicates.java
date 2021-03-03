package src.Office_Hours.Practice_11_04_2020;

import java.util.Scanner;

public class UniquesAndDuplicates {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String str = scan.next();
                // "aabccd"

        String unique  = "";  // "bd";
        String duplicates = ""; // "aacc"

        for(int j = 0; j <= str.length()-1; j++){

            char ch = str.charAt(j); // 'a', 'a', 'b', 'c', 'c', 'd'
            int frequency = 0 ;  // frequency of ch

            for(int i = 0; i <= str.length()-1; i++){ // for finding the frequency of one character at a time
                if( str.charAt(i) == ch){
                    frequency++;
                }
            }

            if(frequency == 1){ // if frequency is 1, it means the ch is unique
                unique += ch;
            }

            if(frequency > 1 ){ // if frequency is more than 1, it means the ch is duplicated
                                // && !duplicates.contains( ""+ch ) ;  // in order to contain one char
                duplicates += ch;
            }


        }


        System.out.println(unique);
        System.out.println(duplicates);







    }

}
