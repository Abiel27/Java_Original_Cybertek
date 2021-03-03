package src.day26_Arrays;

import java.util.Scanner;

public class AverageNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many number?");
        int length = scan.nextInt();

        int[] numbers = new int[length];
        int sum = 0;
                    //i <= length-1
        for(int i=0; i < length; i++){
            System.out.println("Enter a number");
            numbers[i] = scan.nextInt();
            sum += numbers[i];
        }

        double average =   (double)sum / length;
                        // 10/3

        System.out.println("Sum = " + sum);
        System.out.println("Average = "+ average);





    }

}
