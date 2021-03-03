package src.Office_Hours.Practice_11_27_2020;

public class RemoveDigits {

    public static void main(String[] args) {
        String str ="abcd@#$%^&HI12345678JKL";

        String result = ""; //abcd@#$%^&HIJKL

        for(int i = 0; i <= str.length()-1; i++ ){
            char each = str.charAt(i);
            if( !Character.isDigit(each)){
                result += each;
            }
        }


        System.out.println(result);


    }

}
