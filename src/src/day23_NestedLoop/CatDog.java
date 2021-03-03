package src.day23_NestedLoop;

public class CatDog {

    public static void main(String[] args) {

        String sentence =  "dog dog Dog Dog cat CAT cAt";

        String temp = sentence.toLowerCase();  // after this we do not need to worry case sensitivity

        int countDog = 0;
        String word = "dog";
        while(temp.contains(word )){
            temp = temp.replaceFirst(word , "");
            countDog++;
        }

        System.out.println("Number of dogs: "+countDog);

        int countCat = 0;
        word = "cat";
        while(temp.contains(word)){
            temp = temp.replaceFirst(word, "");
            countCat++;
        }

        System.out.println("Number of cats: "+countCat);

        System.out.println( countCat == countDog );


    }


}
