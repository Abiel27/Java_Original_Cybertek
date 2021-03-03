package src.day19_ForLoop;

import java.util.Scanner;

public class CheckWords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first word");
        String s1 = scan.next();

        System.out.println("Enter second word");
        String s2 = scan.next();

        System.out.println("Enter third word");
        String s3 = scan.next();

        int l1 = s1.length();
        int l2 = s2.length();
        int l3 = s3.length();

        if(l1 == l2 && l1 == l3){
            System.out.println("All words are same length");
        }else if(l1 == l2 || l1 == l3 || l2 == l3){
            System.out.println("Not Same nor Different lengths");
        }else{
            System.out.println("All different length");
        }



    }


}


/*
4. Write a program  for CheckWords:
        Program accepts 3 words and :
            - if they are same length:      print "All words are same length"
            - if some same length and others not:    print "Not Same nor Different lengths"
            - if all different length :  print "All different length"
 */