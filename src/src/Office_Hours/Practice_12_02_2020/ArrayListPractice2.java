package src.Office_Hours.Practice_12_02_2020;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {

    public static void main(String[] args) {

        ArrayList<Character> list = new ArrayList<>();
        list.addAll(Arrays.asList('A', 'A', 'B', 'A', 'C', 'D', 'C', 'A', 'E', 'F', '@', '$', '#' ));

        // remove all 'A' from array list
        list.removeAll( Arrays.asList('A')  ); // remove the matching objetcs

        System.out.println(list);

        // keep 'C', 'B'
        list.retainAll( Arrays.asList('C', 'B')); // remove not matching objects

        System.out.println(list);

        ArrayList<Integer> numbers = new ArrayList<>();
            numbers.addAll(Arrays.asList(95,85, 75, 65, 55, 45, 35, 77, 97, 85));

            numbers.removeIf( p -> p < 75  );

        System.out.println(numbers);



    }



}
/*
		removeAll:
		retainAll:
		removeIf:


		remover(): cannot be used inside loop with out Iterable
 */