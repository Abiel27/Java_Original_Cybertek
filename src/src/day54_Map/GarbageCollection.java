package src.day54_Map;

import day47_Abstraction.CarTask.BMW;
import day47_Abstraction.CarTask.Car;
import day49_Abstraction.ShapeTask.Circle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GarbageCollection {


    public static void main(String[] args)  {


       String str1 = "Muhtar";
               str1 =   "Kuzzat"; // "Muhtar" is unreferenced
               str1 = "Gurhan"; // "Kuzzat" is unreferenced
                str1 =  "Saim"; //"gurhan" is unreferenced

        System.out.println(str1);

        Circle c1 = new Circle(5);

        c1 = null;

              // driver= null;


        System.out.println(c1);


        Car car1 = new BMW("X5", "Red", 2011, 40000);
        System.out.println(car1.model);
            car1 = new BMW("X6", "Black", 2017, 45000); //  "BMW X5" is unreferenced

        System.out.println("=========================================================");

        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));

                      list1 =   new ArrayList<>(Arrays.asList(10,20,30,40,50));

        System.out.println(list1);


        System.out.println("==========================================================");

        ArrayList<Integer> l1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        ArrayList<Integer> l2 = l1;

        l2.add(6);

        System.out.println(l2);
        System.out.println(l1);

        l1.retainAll(Arrays.asList(1,2,3));

        System.out.println(l1);
        System.out.println(l2);





    }



}
