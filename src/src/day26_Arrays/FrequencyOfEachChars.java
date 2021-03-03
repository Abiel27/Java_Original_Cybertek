package src.day26_Arrays;

public class FrequencyOfEachChars {

    public static void main(String[] args) {
        String str = "aaabbc";  // "a3b2c1"

  //  Step 1: remove duplicates
        String nonDup = "";   // "abc"
        for(int i = 0; i < str.length(); i++ ){ //i: 0,1,2,3,4,5
            String eachChar = ""+ str.charAt(i); // a, a, a, b, b, c
            if( !nonDup.contains(eachChar) ){
                nonDup += eachChar;
            }
        }

        String result = "";  // "a3b2c1"
  // Step 2: find the frequency of each nonDiup characters from the original string
        for(int j =0; j <= nonDup.length()-1; j++){ // j is the index num of nonDup

            char ch = nonDup.charAt(j); // a, b, c
            int count = 0;  // to contain the frequency of char ch

            for(int i=0; i <= str.length()-1; i++){ // i is the index num of original string
                char eachChar =  str.charAt(i);  // a, a, a, b, b, c
                if(ch == eachChar ){
                    count++;
                }
            }

            result +=  ""+ch + count;

        }


//                 'a' + 3   ==> 97 + 3 = 100
        //         ""+'a'  + 3  ==>  a3

        System.out.println(result);


    }

}

/*
	FrequencyOfEachChars
	1. write a program that can return the frequency of characters from a String
			Ex:
				str = "ababaac";

				output:
					a3b2c1
 */