package src.day27_ForEachLoop;

public class ReverseString {

    public static void main(String[] args) {

        String[] names = {"Delaram", "Aysel", "Snoop", "Ayse", "Erjon"};

        for ( String eachName: names ) { // "Delaram", "Aysel", "Snoop", "Ayse", "Erjon"
                                        //   0123456    01234
            String reversedName = "";

            for(int i = eachName.length()-1; i >=0; i--  ){
                reversedName += eachName.charAt(i);
            }

            System.out.println(reversedName);

        }



    }

}
