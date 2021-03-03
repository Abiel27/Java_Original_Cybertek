package src.Office_Hours.Practice_11_11_2020;

public class ArraysPractice1 {

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7,8,9};

        int[] arr2 = {10,11,12,13,14,15,1};

        for(int j = 0; j <= arr1.length -1; j++){ // iterates the arr1' indexes
            int element = arr1[j];  //1
            for(int i =0; i <= arr2.length-1; i++){ // iterates the arr2' indexes
                if(element == arr2[i] ){
                    System.out.println(element);
                }
            }
        }

        System.out.println("=============================================");

        for(int element : arr1 ){

            for(int each: arr2){
                if(each == element){
                    System.out.println(element);
                }
            }

        }









    }

}
/*
Write a program that can print out the common elements from two integer array
		Ex:
			arr1: {1,2,3,4,5}
			arr2: {4,5,6,7,8}

			output:
				4 5
	solution 1:
			DO NOT use any for each loop

	solution 2:
			MUST use for each loops
 */