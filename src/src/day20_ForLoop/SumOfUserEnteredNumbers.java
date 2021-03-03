package src.day20_ForLoop;

import java.util.Scanner;

public class SumOfUserEnteredNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*
        System.out.println("Enter a number");
        int n1 = scan.nextInt();

        System.out.println("Enter a number");
        int n2 = scan.nextInt();

        System.out.println("Enter a number");
        int n3 = scan.nextInt();

        System.out.println("Enter a number");
        int n4 = scan.nextInt();

        System.out.println("Enter a number");
        int n5 = scan.nextInt();

        int result = n1 + n2 + n3 + n4 + n5;
        System.out.println("Sum: "+result);
        */
        int times = scan.nextInt();  // how many numbers user wants to enter

        int result = 0; //to contain the sum of user entered numbers
            //+1= 1 + 2 = 3 + 3 = 6 + 4 = 10 + 5 = 15

        for(int i =1; i <= times ; i++){ // we allowed the user to decide how many number he wants to enter
            System.out.println("Enter a number: "+i);
           result += scan.nextInt(); // each user input will be added to result
        }
        // 1 2 3 4 5

        System.out.println("result = " + result);




    }

}

// 3. write a program that can calculate the sum of 5 user entered inputs
