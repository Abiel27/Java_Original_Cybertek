package src.Office_Hours.Practice_11_27_2020;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class CombineTwoArrays {

    public static void main(String[] args) {
        char[] ch1 = {'A', 'B', 'C', 'D', 'E'};
        char[] ch2 = {'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N'};

        ArrayList<Character> list = new ArrayList<>();

        for(char each : ch1) list.add(each);

        for(char each : ch2) list.add(each);

        System.out.println(list);

        /*

         */

        DateTimeFormatter tf = DateTimeFormatter.ofPattern("h:mm a");
        LocalTime breakTime = LocalTime.now().plusMinutes(10);
        System.out.println( "Come back at: "+ breakTime.format(tf) );



    }

}
