package src.Office_Hours.Practice_01_27_2021;

import day45_Exceptions.PhoneTask.*;
import day49_Abstraction.ShapeTask.Circle;
import day49_Abstraction.ShapeTask.Cube;
import day49_Abstraction.ShapeTask.Cylinder;
import day49_Abstraction.ShapeTask.Volume;

public class UpDownCastings {

    public static void main(String[] args) {
        // reference type castings

        Phone phone = new Iphone("12 Pro", 1100);  // up casting
            //  phone.faceTime(123456);
      //  ( (Iphone) phone  ).faceTime(123456);
        ((Iphone) phone).faceTime(123456);


       Iphone iphone =  (Iphone) phone ;  // down casting
        iphone.faceTime(123456);
        iphone.faceTime(12321, 21313);

      //  Phone phone2 =  (Samsung) phone ;


        System.out.println("===============================================");
        Phone phone2 = new Nokia("N91", 150);
        ( (Nokia) phone2 ).breakTheFloor();
        ( (Nokia) phone2 ).selfDefense();

       // (  (Iphone)phone2 ).faceTime(123456);

        System.out.println("=================================================");
        Phone phone3 = new HuaWei("..", 150);
        ( (HuaWei)phone3 ).spy();
       // (  (Iphone)phone3 ).faceTime(21346);

        System.out.println("===========================");
        Phone phone4 = new Samsung("S20", 900);
     //   ( (HuaWei)phone4 ).spy();
    //    ( (Nokia)phone4 ).selfDefense();
    //    ( (Iphone)phone4).faceTime(123456);

        ( (Samsung)phone4 ).freeze();

        System.out.println("=================================");
      //  Volume s1 = new Circle(3);
        Volume v = new Cube(3);  // up casting
        double area =  ( (Cube)v ).area();
        double volume = v.volume();

        System.out.println(area);

    }

}
