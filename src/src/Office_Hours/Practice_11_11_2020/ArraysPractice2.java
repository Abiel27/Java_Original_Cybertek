package src.Office_Hours.Practice_11_11_2020;

public class ArraysPractice2 {

    public static void main(String[] args) {

        String[] word = {"Anna", "Level", "Lol", "Donald", "Biden", "Aamir", "Agalar", "Engin", "Maryam"};

        int count = 0 ;

        for(String each : word ){ //"Anna", "Level", "Lol", "Donald", "Biden", "Aamir", "Agalar", "Engin", "Maryam"
            char firstChar = each.toLowerCase().charAt(0);  // a
            char lastChar = each.toLowerCase().charAt( each.length()-1 ); //a

            if(firstChar == lastChar){
                count++;
            }

        }

        System.out.println(count);




    }

}
