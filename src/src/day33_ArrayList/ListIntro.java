package src.day33_ArrayList;

import java.util.ArrayList;

public class ListIntro {

    public static void main(String[] args) {

        ArrayList<Integer>  scores =  new ArrayList<>();   // size:1

        scores.add(100);  // autoboxing   0
        scores.add(200);    //  1
        scores.add(300);    // 3

        scores.add(2, 400);  // 2

        System.out.println( scores );

        ArrayList<String> groceryList = new ArrayList<>();  //[ Egg, Water, Milk, Bread]
        groceryList.add("Egg");  //3
        groceryList.add("Water"); // 4
        groceryList.add("Milk"); // 5
        groceryList.add("Bread"); // 6

        groceryList.add(0, "Toilet Paper");  // 0
        groceryList.add(1,"Sanitizer");     //2
        groceryList.add(1, "N95 Masks");   //1


        System.out.println(groceryList);
        
        String item1 =  groceryList.get(2);

        System.out.println("item1 = " + item1);

        String item2 = groceryList.get(1);
        System.out.println("item2 = " + item2);

     //   System.out.println( groceryList.get(100)  );

        int total = groceryList.size();
        System.out.println("total = " + total);

        System.out.println( groceryList.get(  groceryList.size()-1  ) );






    }

}
