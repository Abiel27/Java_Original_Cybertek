package src.Office_Hours.Practice_10_28_2020;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String str = "Cybertek";  // a, b, a, b

        String nonDup = ""; //"ab"
            // if the character is not exist in nonDup, then we can concate it
                        // i < 11
        for(int i = 0; i <= str.length()-1; i++){
           String  eachChar = ""+str.charAt(i); // each of the character in str

            if( nonDup.contains( eachChar )){ // if the character is already contained in nonDup
                continue; // skip it
            }else{ // otherwise
                nonDup += eachChar;
            }

        }


        System.out.println(nonDup);




    }

}
