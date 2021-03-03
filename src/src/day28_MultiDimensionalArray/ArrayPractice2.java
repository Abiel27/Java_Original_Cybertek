package src.day28_MultiDimensionalArray;

public class ArrayPractice2 {

    public static void main(String[] args) {

        String[] employeeNames = {"Asel", "Afrooz", "Safa" , "Suveyda", "Rinat"};
        //      index numbers:      0        1         2        3          4

        int[] employeeSalary = {1000000, 110000, 105000, 120000, 125000};
        // index numbers:         0       1       2        3       4
                                        //4

        int max = employeeSalary[0];
        String nameOfMax = employeeNames[0];

        int min = employeeSalary[0];
        String nameOfMin =  employeeNames[0];

        for(int i = 0; i <= employeeNames.length-1; i++ ) { //i: 0,1,2,3,4

            System.out.println(employeeNames[i] + " : $" + employeeSalary[i]);

            if(employeeSalary[i] > max ){
                max= employeeSalary[i];
                nameOfMax = employeeNames[i];
            }

            if(employeeSalary[i] < min){
                min = employeeSalary[i];
                nameOfMin = employeeNames[i];
            }

        }

        System.out.println( nameOfMax+" has the maximum salary: $"+ max);


        /*
            John : $100000
               ....

           who has the highest salary
           who has the minimum salary
         */





    }


}
