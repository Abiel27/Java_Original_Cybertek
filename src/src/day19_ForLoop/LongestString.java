package src.day19_ForLoop;

import java.util.Scanner;

public class LongestString {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first String");
        String s1 = scan.nextLine();

        System.out.println("Enter your second String");
        String s2 = scan.nextLine();

        if( s1.length() > s2.length() ){
            System.out.println(s1);
        }else if( s2.length() > s1.length() ){
            System.out.println(s2);
        }else{
            System.out.println("Both are equal");
        }


    }

}

/*
1. write a program that can return the longest string from two user inputs

 */