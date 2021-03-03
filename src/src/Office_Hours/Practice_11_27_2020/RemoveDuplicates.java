package src.Office_Hours.Practice_11_27_2020;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,4};

        ArrayList<Integer> list = new ArrayList<>(); //[1, 2, 3,4 ]

        for(int each : arr) {
            if (!list.contains(each)) {
                list.add(each);
            }
        }

        int[] nonDup = new int[list.size()]; // [1,2,3,4]

        for(int i = 0; i <= nonDup.length-1; i++) {
            nonDup[i] = list.get(i);
        }

        System.out.println(Arrays.toString(nonDup));


        int[] arr2 = {5,5,5,6,6,6,6,7,7,7,7,7,8,8,8,8,8};
        int[] nonDup2 = removeDuplicates(arr2);

        System.out.println(Arrays.toString(nonDup2));

        char[] arr3 = {'A', 'A', 'A', 'B', 'B'};
        char[] nonDup3 = removeDuplicates(arr3);

        System.out.println(Arrays.toString(nonDup3));


    }


    public static int[]  removeDuplicates(int[] arr){
        ArrayList<Integer> list = new ArrayList<>(); //[1, 2, 3,4 ]
        for(int each : arr) {
            if (!list.contains(each)) {
                list.add(each);
            }
        }

        int[] nonDup = new int[list.size()]; // [1,2,3,4]

        for(int i = 0; i <= nonDup.length-1; i++) {
            nonDup[i] = list.get(i);
        }

        return nonDup;
    }

    public static double[]  removeDuplicates(double[] arr){
        ArrayList<Double> list = new ArrayList<>(); //[1, 2, 3,4 ]
        for(double each : arr) {
            if (!list.contains(each)) {
                list.add(each);
            }
        }

        double[] nonDup = new double[list.size()]; // [1,2,3,4]

        for(int i = 0; i <= nonDup.length-1; i++) {
            nonDup[i] = list.get(i);
        }

        return nonDup;
    }

    public static char[]  removeDuplicates(char[] arr){
        ArrayList<Character> list = new ArrayList<>(); //[1, 2, 3,4 ]
        for(char each : arr) {
            if (!list.contains(each)) {
                list.add(each);
            }
        }

        char[] nonDup = new char[list.size()]; // [1,2,3,4]

        for(int i = 0; i <= nonDup.length-1; i++) {
            nonDup[i] = list.get(i);
        }

        return nonDup;
    }

    public static String[]  removeDuplicates(String[] arr){
        ArrayList<String> list = new ArrayList<>(); //[1, 2, 3,4 ]
        for(String each : arr) {
            if (!list.contains(each)) {
                list.add(each);
            }
        }

        String[] nonDup = new String[list.size()]; // [1,2,3,4]

        for(int i = 0; i <= nonDup.length-1; i++) {
            nonDup[i] = list.get(i);
        }

        return nonDup;
    }




}
