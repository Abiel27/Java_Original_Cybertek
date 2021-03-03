package src.day03_Variables;
//1. write a program that can calculate the area & perimeter of any rectangle that has integer number

public class CalculateRectangle {


    public static void main(String[] args) {

// width : 5, length: 20

        int width = 5;
        int length = 20;

        int area = width * length;
        //          5    *   20
       int perimeter = width * 2 + length * 2;

        System.out.print("Area is: ");
        System.out.print( area );

        System.out.print("\nPerimeter is: ");
        System.out.print( perimeter );



    }


}

/*
 declare variables:
        DataType name = Data;
 */