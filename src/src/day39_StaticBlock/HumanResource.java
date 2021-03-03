package src.day39_StaticBlock;

import day37_CustomClass.Employee;

public class HumanResource {

    public static Employee employee1, employee2, employee3, employee4, employee5;

   static  {

        employee1 = new Employee();
        employee2 = new Employee();
        employee3 = new Employee();
        employee4 = new Employee();
        employee5 = new Employee();

        employee1.setInfo("Ayse", "Bank Of America", "QA", "ABC123", "Female", 45, 55);
        employee2.setInfo("John", "Bank Of America", "QA", "ABC123", "Male", 45, 55);
        employee3.setInfo("Karlygash", "Amazon", "SDET", "K4565145", "female", 40, 100);
        employee4.setInfo("Mustafa","Bank Of America","SDET","A15648","Male",40,55);
        employee5.setInfo("Adam Levine", "Apple Company", "Developer", "A-135", "M", 25, 75);

    }




}
