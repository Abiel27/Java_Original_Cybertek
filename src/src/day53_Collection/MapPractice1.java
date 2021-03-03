package src.day53_Collection;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MapPractice1 {

    public static void main(String[] args) {
        Map<String, Double> employeeInfo = new LinkedHashMap<>();
        employeeInfo.put("Afrooz", 150000.0);
        employeeInfo.put("Muhammad", 150000.5);
        employeeInfo.put("Ayse", 125000.0);

       // employeeInfo.remove("Muhammad");


        System.out.println( employeeInfo.size() );
        System.out.println(employeeInfo);

        System.out.println("Salary of Muhammad: " +   employeeInfo.get("Muhammad") );
        System.out.println("Salary of Afrooz: "+employeeInfo.get("Afrooz"));


        System.out.println(employeeInfo.containsKey("Muhammad"));
        System.out.println(employeeInfo.containsKey("Ayse"));


        System.out.println( employeeInfo.containsValue(150000.0) );

      //  employeeInfo.clear();
      //  System.out.println(employeeInfo);

        System.out.println("================================================");

       for( String eachKey: employeeInfo.keySet() ){
           System.out.println(eachKey + "  :  "+  employeeInfo.get(eachKey) );
       }


        System.out.println("================================================");
        employeeInfo.put("Mustafa",105000.0);
        employeeInfo.put("Emre",103000.0);
        employeeInfo.put("Apo",100000.0);

        double max = Double.MIN_VALUE,  min= Double.MAX_VALUE;
        String nameMax = "", nameMin = "";



        for (String eachName : employeeInfo.keySet()) {
            double eachSalary = employeeInfo.get(eachName);

            if(eachSalary > max){
                max = eachSalary;
                nameMax = eachName;
            }

            if(eachSalary < min){
                min = eachSalary;
                nameMin =eachName;
            }

        }

        System.out.println(nameMax +" : "+max);
        System.out.println(nameMin +" : "+min);


        System.out.println("===================================");
        System.out.println(employeeInfo);

    //    employeeInfo.values().forEach( p -> { System.out.println(p); } );

        for (Double eachValue : employeeInfo.values()) {
            System.out.println(eachValue);
        }


        List<Double> salaries = (ArrayList) employeeInfo.values();
        System.out.println(salaries);



    }
}
