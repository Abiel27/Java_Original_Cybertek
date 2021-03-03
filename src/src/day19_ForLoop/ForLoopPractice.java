package src.day19_ForLoop;

public class ForLoopPractice {

    public static void main(String[] args) {

        for (int i =0; i <= 100; i++){
            System.out.print(i+" ");
        }

        System.out.println();

        System.out.println("=====================================================");


        for(int i = 100; i <= 200; i++){
            System.out.print(i+" ");
        }

        System.out.println();

        System.out.println("====================================================");

        // 1 3 5 7 9 11 ...

        for(int i =1; i <= 100; i += 2){
            System.out.print(i+" ");
        }

        System.out.println();

        System.out.println("======================================================");
        for(int i =0; i <= 100; i++){
            if(i % 2 != 0 ){
                System.out.print(i+" ");
            }
        }

        System.out.println();

        System.out.println("==================================================");

        // 0 2 4 6 8 10 12 14 .... 100
        for(int i = 0; i <= 100; i += 2){
            System.out.print(i+" ");
        }

        System.out.println();


        System.out.println("====================================================");

        for(int i = 0; i <= 100; i++){
            if(i%2==0){
                System.out.println(i+" ");
            }
        }
        System.out.println();

        System.out.println("==================================================");

        for(int i = 1; i <= 500; i++){
            System.out.println("Push Up "+i);
        }

        System.out.println();

        char a = 65;
        System.out.println(a);










    }



}
/*
tasks:
        1. print out the numbers between 0 ~ 100
        2. print out the numbers between 100 ~ 200
        3. print out all the odd numbers between 0 ~ 100
        4. print out all the even numbers between 0 ~ 100
        5. do 500 push ups

 */