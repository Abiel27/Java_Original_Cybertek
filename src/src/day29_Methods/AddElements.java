package src.day29_Methods;

import java.util.Arrays;

public class AddElements {

    public static void main(String[] args) {
        int[] arr ={10, 20, 30, 40};

        addElements(arr, 50);

        int[] arr2 = {1,2,3,4,5,6};
        addElements(arr2, 10);

    }


                                    // {1,2,3},   4
    public static void addElements(int[] arr,   int num){
        int[] result = new int[arr.length+1];

        for(int i = 0; i <= arr.length-1; i++){
            result[i] = arr[i];
        }

        result[result.length-1] = num;

        System.out.println(Arrays.toString(result));

    }


}
