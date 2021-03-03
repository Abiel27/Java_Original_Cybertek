package src.Office_Hour_Recordings.PracticeTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CountDupForAmazon {

    /*
     * Write a program to identify the frequency of duplicates words in a string. Print duplicates words and their frequency.
     *
     * -> input: "java is java language is useful java"
     * -> output:
     *      java: 3
     *      is: 2
     *      language: 1
     *      useful: 1
     */

    public static void main(String[] args) {
        countDups("java is java language is useful java");
    }

    public static void countDups(String s) {

        ArrayList<String> words = new ArrayList<>(Arrays.asList(s.split(" ")));
        // converted String to ArrayList of Strings
        String checked = "";

        for(String word : words) {

            if(!checked.contains(word)) {
                int freqOfEach = Collections.frequency(words, word); // Ready method
                System.out.println(word + ": " + freqOfEach);
                checked += word + " ";
            }
        }

    }





}
