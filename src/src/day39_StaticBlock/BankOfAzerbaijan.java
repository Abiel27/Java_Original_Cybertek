package src.day39_StaticBlock;


import day37_CustomClass.Employee;

import java.util.ArrayList;

public class BankOfAzerbaijan  {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add( HumanResource.employee1 );
        employees.add( HumanResource.employee2 );

        System.out.println( employees.get(0) );


    }
}
