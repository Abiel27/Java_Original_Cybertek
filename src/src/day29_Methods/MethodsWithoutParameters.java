package src.day29_Methods;

public class MethodsWithoutParameters {


    public static void main(String[] args) {

        printHello5Times();
        System.out.println("Muhtar");
        printHello5Times();
        System.out.println("Cybertek");
        printHello5Times();

        MethodsWithoutParameters.printHello5Times();

        System.out.print("Odd Number: ");
        MethodsWithoutParameters2.printOddNumbers1To100();

        System.out.print("Even Numbers: ");
        MethodsWithoutParameters2.printEvenNumber1to100();



    }

    // AccessModifier  specifier   returnTYPE   MethodName (Parameter){ }
    public static void printHello5Times() {

        for(int i = 1; i < 6; i++){
            System.out.println("Hello");
        }

    }





}
/*
	    step1: print hello 5 times  (for loop)
		step2: print your name
		step3: print hello 5 times  (for loop)
		step4: print your school name
		step5: print hello 5 times   (for loop)
 */

