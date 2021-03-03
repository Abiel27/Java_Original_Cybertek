package src.Office_Hours.Practice_02_03_2021;

import java.util.*;

public class RemoveEvenNumbers {


    public static void main(String[] args) {

       Integer[] numbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,1,2,3,4,5,6,7,8,9,10,12,13,14,15};

        Set<Integer> set = new LinkedHashSet();
        set.addAll(Arrays.asList(numbers));
        System.out.println(set);

        set.removeIf(p -> p % 2 == 0);
     //   System.out.println(set);
        System.out.println("=============================================");

        /*
        for(Iterator<Integer> it = set.iterator(); it.hasNext() ;  ){
               Integer p = it.next();
               if(p % 2 == 0){
                   it.remove();
               }
        }
         */

        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            if(it.next() % 2 ==0){
                it.remove();
            }
        }


        System.out.println(set);

        System.out.println("=================================================");

        Integer[] arr = {10,10, 11,11, 9,9, 9, 9, 5,5,5,6,7,4,3,2,1};   //[1,2,3,4,5,6,7,8,9,10]
        arr = new TreeSet<Integer>( Arrays.asList(arr) ).toArray(new Integer[0] )  ;  // returns array

        System.out.println( Arrays.toString(arr) );

        System.out.println("===================================================");

        String[] names = {"J", "J", "A", "A", "A", "A", "D", "C", "C", "B", "A", "A"};
         names = new TreeSet<>(Arrays.asList(names)).toArray(new String[1]);

        System.out.println( Arrays.toString(names) );



    }

}
