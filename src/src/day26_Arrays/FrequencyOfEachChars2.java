package src.day26_Arrays;

public class FrequencyOfEachChars2 {

    public static void main(String[] args) {
        String str = "aaabbc";
           //     str = str.replace(" ",""); // if we need to ignore the spaces

        String expectedResult = ""; // "a3"

        for(int j = 0; j <= str.length()-1; j++){  // j represents the index num of str

            char ch = str.charAt(j); //a, a, a, b, b, c
            int count = 0;

            for(int i = 0; i<= str.length()-1; i++){ // i represents the index num of str
                char eachChar = str.charAt(i);
                if(eachChar == ch ){
                    count++;
                }
            }

            if(!expectedResult.contains(""+ch)){
                expectedResult += "" + ch + count;
            }
        }

        System.out.println(expectedResult);




    }
}
