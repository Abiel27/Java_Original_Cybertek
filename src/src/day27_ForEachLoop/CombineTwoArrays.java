package src.day27_ForEachLoop;

import java.util.Arrays;

public class CombineTwoArrays {

    public static void main(String[] args) {
        int[] arr1 = {10,20,30,40,50,60,70,80,90,100, 200, 300};
        //{1,2,3,4}
        int[] arr2 = {-1,-2,-3,-4,-5,-6,-7,-8};
        // {5,6,7}

        int[] arr3 = new int[ arr1.length + arr2.length ]; // the array MUST have the capacity to contain first and second array elements
        int j = 0; // represents the index num of 3rd array

        for( int each : arr1){ //each: 1 2 3 4
             arr3[j++] = each;
             /*
              arr3[0] = 1
              arr3[1] = 2;
              arr3[2] =  3
              arr3[3] = 4
              */
        }

        for(int each: arr2){ // 5, 6, 7
            arr3[j++]= each;
            /*
              arr[4] = 5;
              arr[5] = 6;
              arr[6] = 7;
             */
        }


        System.out.println(Arrays.toString(arr3)  );


    }

}
