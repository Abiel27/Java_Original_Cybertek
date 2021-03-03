package src.Office_Hours.Practice_12_02_2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SecondMaxMin2 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,1,1,2,3,4,5,6,7,8,9,10, 10, 10));

        ArrayList<Integer> temp = new ArrayList<>();
        temp.addAll(list);

        temp.removeIf( p -> p == Collections.max( temp) || p== Collections.min(temp) ); //  both max and minimumnumbers are remived from the list

        int secondMax = Collections.max( temp);
        int secondMin = Collections.min(temp);

        System.out.println("secondMax = " + secondMax);
        System.out.println("secondMin = " + secondMin);









    }
}
