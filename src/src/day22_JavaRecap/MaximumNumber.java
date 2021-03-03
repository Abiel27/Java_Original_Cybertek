package src.day22_JavaRecap;

import java.util.Scanner;

public class MaximumNumber {
    
    public static void main(String[] args) {
        /*
        scanner object: 1
        max: 1
        
        "enter a number": 5
        nextInt(): 5
        
        "maximum number is ... ": 1
         */

        Scanner scan = new Scanner(System.in);
        int max = -2147483648;
            // user most likely to enter a number that's greater than -2147483648

        for(int i =1; i <= 5; i++){

            System.out.println("Enter a number: ");

            int n = scan.nextInt(); // -1000, -20, 0, 5, 3, 25, 35, 45, 75, 95
            if(n > max){ //
                max = n;
            }

        }

        scan.close();

        System.out.println("max = " + max);
        
        
        
    }
    
}
