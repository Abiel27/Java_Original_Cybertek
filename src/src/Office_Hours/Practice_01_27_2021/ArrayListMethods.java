package src.Office_Hours.Practice_01_27_2021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.addAll( Arrays.asList( 20, 30, 40, 50, 60  ));
        System.out.println(list.size());
        System.out.println(list);

        // list.remove(3);

        list.remove( Integer.valueOf( 40 )  );
        System.out.println(list.size());
        System.out.println(list);


        list.set(2, 300);
        System.out.println(list);

        boolean r = list.contains(500);

        System.out.println(r);

        Collections.swap(list,2, 0 );

        System.out.println(list);

        int count = Collections.frequency(list, 50);

        System.out.println(count);

        list.forEach( p -> {  } ); // variables are final in lambda





    }

}
