package src.day29_Methods;

public class ReverseString {

    public static void main(String[] args) {

        reverse("Cybertek School");

        System.out.println("=================================");

        String[] names = {"Sayyohat", "Livio", "Marwan", "Inna", "Halim", "Afrooz", "Maryam"};

        for( String each : names)
                reverse(each);

    }


    //"Cybertek" ==> ketrebyC
    public static void reverse(String word){
        String result = "";

        for(int i = word.length()-1; i>= 0; i--){
            result += word.charAt(i);
        }

        System.out.println(result);
    }




}
