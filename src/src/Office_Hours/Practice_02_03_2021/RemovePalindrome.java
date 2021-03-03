package src.Office_Hours.Practice_02_03_2021;


import java.util.*;

public class RemovePalindrome {

    public static void main(String[] args) {
        String[] words = {"Level", "Anna", "Java", "C#", "Python", "Nalan", "Level", "Anna", "Racecar", "Java", "Java"};

       // Set<String> list = new LinkedHashSet<>(Arrays.asList(words));
       List<String> list = new ArrayList<>(Arrays.asList(words));

        System.out.println(list);

        Iterator<String> it = list.iterator();  // iterated list of string

        while(it.hasNext()){
            String each = it.next(); // Level

            String reversed = "";  // leveL
            for(int i = each.length()-1; i >=0; i--){
                reversed += each.charAt(i);
            }

            if(each.equalsIgnoreCase(reversed)){ // to check if the string in list is palindrome
               it.remove();
            }

        }


        System.out.println(list);


        System.out.println("===================================================================");

        List<String> list2 = new ArrayList<>(Arrays.asList(words));
        System.out.println(list2);

        List<String> nonPalindroms = new ArrayList<>();
        for (String each : list2) {

            String reversed = "";
            for(int i = each.length()-1; i >=0; i--){
                reversed += each.charAt(i);
            }

            if(reversed.equalsIgnoreCase(each)){
                continue;
            }

            nonPalindroms.add(each);

        }


        System.out.println(nonPalindroms);



    }

}
