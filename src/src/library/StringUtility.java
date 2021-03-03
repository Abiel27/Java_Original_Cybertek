package src.library;

import java.util.Arrays;

public class StringUtility {

    /*
        returns the frequency of given char from the given string, as int
     */
           //                     "aaa"          'a'
    public static int frequency(String str, char ch){
        int count = 0;

        for(char each  : str.toCharArray() ){    //each: [a, a, a, b, c]
            if(each == ch){
                count++;
            }
        }
        return count;
    }


    /*
        returns the unique characters for the given string
     */
    public static String unique(String str){
        String unique = ""; // "eg"
        for(int i=0; i <= str.length()-1; i++) {
            char each = str.charAt(i); // each character of the string
            int count = frequency(str,  each);  // finding teh frequency of every single char from str

            if( count == 1){
                unique += each;
            }
        }
        return unique;
    }


    /*
        reverses the given string object and returns it
     */
    public static String reverse(String str){
        String result = "";

        for(int i = str.length()-1; i >= 0; i--){
            result += str.charAt(i);
        }

        return result;
    }


    /*
     removes the duplicates from the string and returns it
     */
    public static String removeDuplicates(String str){
        String result = "";  //"abc"

        for( int i = 0; i <= str.length()-1; i++  ){
            if(!result.contains( ""+str.charAt(i) )){
                result += str.charAt(i);
            }
        }

       return result;
    }


    /*
    returns the frequency of characters
     */
    public static String frequencyOfCharacters(String str){
        String result = ""; //a3b4c2

        String nonDup =  StringUtility.removeDuplicates(str);   // a b c

        for(int i =0; i <= nonDup.length()-1; i++) {
            char ch = nonDup.charAt(i);  //a
            int count = StringUtility.frequency(str, ch);   // 3 4 2
            result += "" + ch + count;
        }

        return result;
    }


    /*
    anagram:
        "adbbdbd"  ==> abc
        "dbaaaaaaaa" ==> abc

      output
        true

        verify if two strings are anagram, returns the boolean result
     */
                                    //ccaab       // bbbaccc
    public static boolean isAnagram(String str1, String str2){
        str1 = removeDuplicates(str1);  //cab
        str2 = removeDuplicates(str2);  //bac

        char[] ch1 = str1.toCharArray(); // [c, a, b]
        char[] ch2 = str2.toCharArray(); // [b, a, c]

        Arrays.sort(ch1); // [a, b, c]
        Arrays.sort(ch2); // [a, b, c]

       return   Arrays.equals(ch1, ch2);
    }



    /*
    verify if the string palindrome
     */
    public static boolean isPalindrome(String str){
        return  reverse(str).equalsIgnoreCase(str);
    }



    /*
    takes a sentence and word, then returns the frequency of the word
     */
    public static int frequencyOfWord(String sentence, String word){
        sentence = sentence.toLowerCase();
        word = word.toLowerCase();

        int frequency = 0;

        while(sentence.contains(word)){
            sentence = sentence.replaceFirst(word, "");
            frequency++;
        }

        return frequency;
    }




}
