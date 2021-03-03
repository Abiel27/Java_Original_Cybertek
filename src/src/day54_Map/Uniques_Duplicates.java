package src.day54_Map;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;

public class Uniques_Duplicates {

    public static void main(String[] args) {
        String str = "aabcccdee";
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>(); // {a=2, c=3, e=2}
        LinkedHashMap<String, Integer> map2 = new LinkedHashMap<>();  //{b=1, d=1}

        for (String each : str.split("")) {
           int f = Collections.frequency( Arrays.asList(str.split("")) , each);

           if(f > 1 ){ // for duplicated objects
               map.put(each, f);
           }

           if(f == 1){ // for unique objects
               map2.put(each, 1);
           }

        }

        System.out.println(map);
        System.out.println(map2);





    }

}

/*
	1. write a program that stores the duplicated characters from a string into a map

	        Ex:
	        	str = "aabcccdee";

	        	output:
	            	{a=2, c=3, e=2}

	2. write a program that stores the unique characters from a string into a map

	        Ex:
	        	str = "abacbdeef";

	        	output:
	            	{c=1, d=1, f=1}
 */
