package src.day25_ArrayIntro;

public class RemoveUniqueCharacters {

    public static void main(String[] args) {

        String str = "abcabd";
        String result = "";   // abab
                            //ab

        for(int j =0; j < str.length(); j++){

            char ch = str.charAt(j);
            int count = 0;
            for(int i=0; i<str.length(); i++){
                char eachCharacter = str.charAt(i);
                if(eachCharacter == ch ){
                    count++;
                }
            }

            if(count > 1 ){  // count > 1 && !result.contains( ""+ch) ==> ab
                result += ch;
            }

        }

        System.out.println("result = " + result);








    }

}
