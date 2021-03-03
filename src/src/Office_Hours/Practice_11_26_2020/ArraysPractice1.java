package src.Office_Hours.Practice_11_26_2020;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysPractice1 {

    public static void main(String[] args) {

        int[] arr = new int[5];

        System.out.println(Arrays.toString(arr));

              arr[0] = 30;
              arr[3] = 25;
              arr[4] = 15;
              arr[1] =50;

        System.out.println(Arrays.toString(arr));

        int[] numbers = new int[50];
        for(int i =0; i <= numbers.length-1; i++){
            numbers[i] = i+1;
            /*      0  = 1
                    1 = 2
                   2 = 3
                   ...
                  99 = 100 */
        }

        System.out.println( Arrays.toString(numbers) );

        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();

        for(int each  : numbers)
            if(each %2 ==0)
                even.add(each);
            else
                odd.add(each);




        System.out.println("Odd: "+odd);
        System.out.println("Even: "+even);


    }

}
