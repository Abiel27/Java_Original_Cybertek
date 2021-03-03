package src.Office_Hours.Practice_10_21_2020;

import java.util.Scanner;

public class ScannerPractice3 {

    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);

        System.out.println("Enter your gender: ");
        String gender = scan.next();  // Female

        System.out.println("Enter your age: ");
        int age = scan.nextInt(); // 28

        scan.nextLine(); // EnterEnter

        System.out.println("Enter your full name: ");
        String fullName = scan.nextLine();

        System.out.println("Enter your zip code: ");
        String zipCode = scan.next(); // 22035

        scan.nextLine(); // Enter

        System.out.println("Enter your country name: ");
        String countryName = scan.nextLine(); //

        System.out.println("Enter your salary: ");
        double salary = scan.nextDouble(); // 100000

        scan.nextLine(); // Enter

        System.out.println("Enter your company name: ");
        String companyName = scan.nextLine(); // Bank Of AmericaEnter

        System.out.println("Enter your address: ");
        String address = scan.nextLine();


    }

}

/*
1. ask gender ( next() )
2. ask age ( nextInt() )
3. ask full name ( nextLine() )
4. ask zip code ( next() )
5. ask country name ( nextLine() )
6. ask salary ( nextDouble() )
7. ask company name  ( nextLine() )
8. ask address ( nextLine() )


 /we need this extra netLine whenever we are using nextLine() method after other scanner' method

 */