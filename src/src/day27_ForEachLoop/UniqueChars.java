package src.day27_ForEachLoop;

import java.util.Arrays;

public class UniqueChars {

    public static void main(String[] args) {

        String str = "aabbcddeef";

        char[] arr = str.toCharArray(); // [a, a, b, b, c, d, d, e, e, f]
       // String[] arr = str.split("");

        System.out.println(Arrays.toString(arr));


        for(int j = 0; j <= arr.length-1; j++) {

            char element = arr[j];
            int frequency = 0;
            for (int i = 0; i <= arr.length - 1; i++) {
                if (arr[i] == element) {
                    frequency++;
                }
            }

            if (frequency == 1) {
                System.out.print(element + " ");
            }

        }



    }

}
