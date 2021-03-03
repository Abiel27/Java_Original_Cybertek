package src.Office_Hours.Practice_01_06_2021;

import java.io.FileNotFoundException;
import java.util.NoSuchElementException;

public class ExceptionHandling_TryCatch {

    public static void main(String[] str){

        try {
            throw new NoSuchElementException("Element not found"); // ID

        } catch ( NoSuchElementException e){
            // element = driver.findElements(xpath);
            e.printStackTrace();
            System.out.println( e.getMessage() );
        }

        System.out.println("Test1 Ended");

    try {
        System.out.println("Cybertek".charAt(900));
    }catch (RuntimeException e){
        e.printStackTrace();
       // System.out.println("Exception Message: "+e.getMessage());
    }


        System.out.println("Test 2 Ended");

   //     System.out.println(9/0);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Test3 Ended");

        try {

            throw new FileNotFoundException("");

        } catch (FileNotFoundException e){
            e.printStackTrace();
        }

        System.out.println("Test4 Ended");


    }

}
