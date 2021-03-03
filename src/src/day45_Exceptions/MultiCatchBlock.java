package src.day45_Exceptions;

import java.util.NoSuchElementException;

public class MultiCatchBlock {

    public static void main(String[] args) {

        try {
            System.out.println(25 / 0); // Arithmetic Exception
        }catch (NoSuchElementException e){
            System.out.println("No Such Element Exception");
        }catch (ClassCastException e){
            System.out.println("Class Cast Exception");
        }catch (ArithmeticException e){
            System.out.println("Arithmetic Exception");
        }catch (NullPointerException e){
            System.out.println("Null Pointer Exception");
        }catch (RuntimeException e){
            System.out.println("Runtime Exception");
        }


        System.out.println("---------------------------------------------------");

        String[] names = {"Walid", "Agalar", "Ayjeren"};

        try {
            names[10] = "Muhtar"; // ArrayIndexOutOfBound
        }catch (IllegalArgumentException e){
            System.out.println("Illegal Argument exception");
        }catch (NoSuchElementException e){
            System.out.println("No Such Element exception");
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("String index out of bound exception");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndex out of Bound");
        }catch (IndexOutOfBoundsException e){
            System.out.println("Index Out of bound Exception");
        } catch (RuntimeException e){
            System.out.println("Runtime Exception");
        }




    }

}
