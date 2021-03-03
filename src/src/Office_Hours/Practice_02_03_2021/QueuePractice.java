package src.Office_Hours.Practice_02_03_2021;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Queue;

public class QueuePractice {


    public static void main(String[] args) {

        ArrayDeque<Integer> ad = new ArrayDeque<>(Arrays.asList(1,1,1,1,1,2,2,2,2,3,4,5,6,7,8,9,10));

        for (Integer each: ad){
            System.out.println(each);
            ad.poll();
        }

        System.out.println(ad);


        System.out.println("===================================================");

        Queue<Integer> q1 = new ArrayDeque<>(Arrays.asList(1,1,1,1,1,2,2,2,2,3,4,5,6,7,8,9,10));

      //  q1.removeIf(p -> p < 5);

        Iterator<Integer> it = q1.iterator();
        while(it.hasNext()){
            if(it.next() < 5){
                it.remove();
            }
        }

        System.out.println(q1);




    }

}
