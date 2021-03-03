package src.day54_Map;

public class TestEnums {
    public static void main(String[] args) {

        String browserName = "Cybertek";

        Browsers browserName2 = Browsers.FireFox;

        switch (browserName2){
            case Chrome:
                System.out.println("Chrome is selected");
                break;

            case FireFox:
                System.out.println("Fire fox is selected");
                break;

            default:
                System.out.println("Safri");
        }



      String  monthName = "Python";
        MonthName monthName2 = MonthName.Jan;

        DaysInWeek day = DaysInWeek.Mon;

        ComputerOS os = ComputerOS.MacOS;

        Priority priorityLevel = Priority.Low;

        System.out.println("===========================================");
        String string = "Cybertek";
        string.concat(" School"); // "Cybertek School"
        System.out.println(string);  // "Cybertek"

        StringBuilder stringBuilder = new StringBuilder("Cybertek");
        stringBuilder.append(" School");
        stringBuilder.reverse();
        System.out.println(stringBuilder);



    }
}
