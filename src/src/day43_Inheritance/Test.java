package src.day43_Inheritance;

class Data{

    public Data(){

    }

    public static int publicVariable = 100;
    static int defaultVariable = 200;
    private static int privateVariables = 300;

    //setInfo

}

public class Test  extends AccessModifiers{

    public static void main(String[] args) {

    //    System.out.println(Test.publicVariable);
   //     System.out.println(Test.defaultVariable);
      //  System.out.println(Test.privateVariables);

    // visibility test in inheritance:
        Test.publicMethod();
        Test.protectedMethod();
        Test.defaultMethod();

    }

}
