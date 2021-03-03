package src.day32_LocalDate_WrapperClass;

public class CharacterWrapperClass {

    public static void main(String[] args) {
            char n = 'W';

        System.out.println(   Character.isDigit(n) );
        System.out.println( Character.isLetter(n) );

        String str = "a1b2c3b4c5d6T@w$y%o^p%!-_ +~`#& ";

        String digits = "";
        String letters = "";
        String specialChar = "";

        for(char each : str.toCharArray() ){
            if(Character.isDigit(each)){
                digits += each;
            }else if(Character.isLetter(each)){
                letters += each;
            }else{
                specialChar += each;
            }
        }

        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("specialChar = " + specialChar);




    }


}

/*
Password validation
    1. 8 character at least
    2. there must be a digit            (isUpper   isLowercase)
    3. there must be a letter (at least one upper case & one lower case)
    4. there must be special character

 */