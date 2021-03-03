package src.day28_MultiDimensionalArray;

public class ArrayPractice3 {

    public static void main(String[] args) {
        double[] salary = {100000.5,  110000.5, 120000.5, 95000.5, 90000.5};
        double sum = 0;

        double max = salary[0];
        double min = salary[0];

        for(double  each : salary ){
            sum += each;

            if(each > max){
                max = each;
            }

            if(each < min){
                min = each;
            }

        }

        System.out.println("Total: $"+sum);
        System.out.println("Average Salary of employees: " +  (sum/salary.length)  );
        System.out.println("max = " + max);
        System.out.println("min = " + min);






    }

}
