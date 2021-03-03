package src.day45_Exceptions;

public class ExceptionHandling {

    public static void main(String[] args) {
        // StringIndexoutofBound

        String str = "Cybertek";

    try {
        System.out.println(str.substring(200, 300));

    }catch (StringIndexOutOfBoundsException e){

       // System.out.println( e.getMessage() );
    //   e.printStackTrace();
    }


    // Thread.sleep
     try {
         Thread.sleep(5000);

     }catch (InterruptedException e){

     }

     //
    try {
        System.out.println(100 / 0);
    }catch (ArithmeticException e){
        System.out.println("Unchecked exception is occured: " + e.getMessage());
        e.printStackTrace();
    }


   // Thread.sleep(5000);


        System.out.println("Test Completed");

    }


}
