package src.library;


import day43_Inheritance.AccessModifiers;

import static day41_Encapsulation.Data.*;

public class Test extends AccessModifiers {

    public static void main(String[] args) {

        System.out.println(publicVariable);
     //   System.out.println(privateVariable);
    //    System.out.println(defaultVariable);

      //  Data obj1 = new Data();
        publicMethod();
      //  privateMethod();
      //  defaultMethod();

        // visibility test in inheritance:
        Test.publicMethod();
        Test.protectedMethod();
     //   Test.defaultMethod();




    }

}
