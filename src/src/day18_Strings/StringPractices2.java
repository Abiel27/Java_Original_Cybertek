package src.day18_Strings;

import java.util.Scanner;

public class StringPractices2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an Apple product name");
        String product = scan.nextLine(); //mAc   BoOK
        product = product.replace(" ", "").toLowerCase(); // macbook

        switch (product){

            case "macbook":
                System.out.println("Which model of MacBook would like? ");
                String model = scan.nextLine();
                        if(model.equalsIgnoreCase("air")){
                            System.out.println("MacBook Air is $2400");
                        }else if(model.equalsIgnoreCase("pro")){
                            System.out.println("MacBook Pro is $2500");
                        }else{
                            System.err.println("Invalid Model for MacBook");
                        }
                break;

            case "iphone":
                System.out.println("Which model of Iphone would you like");
                String model2 = scan.nextLine().toLowerCase();
                    if(model2.equals("12")){
                        System.out.println("Iphone 12 is $1000");
                    }else if(model2.equals("11")){
                        System.out.println("Iphone 11 is $900");
                    }else if( model2.equals("10")){
                        System.out.println("Iphone 10 is $800");
                    }else if(model2.equals("8")){
                        System.out.println("Iphone 8 is $700");
                    }else{
                        System.err.println("Invalid Model for Iphone");
                    }

                break;

            case "ipad":
                System.out.println("Which Model of Ipad");
                String model3 = scan.nextLine().toLowerCase();
                switch (model3){
                    case "air":
                        System.out.println("iPad air is $500");
                        break;

                    case "pro":
                        System.out.println("iPad pro is $400");
                        break;

                    case "mini":
                        System.out.println("iPad Mini is $300");
                        break;

                    default:
                        System.err.println("Invalid model for iPad");
                }

                break;

            default:
                System.err.println("Invalid Product Name");
        }




    }

}


/*
    MacBook:       mAC book
        air: 2400
        pro: 2500

    Iphone:
        12: 1000
        11: 900
        10: 800
        8: 700

    Ipad:
        air: 500
        mini: 400
        pro: 300

 */
