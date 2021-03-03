package src.Office_Hours.Practice_01_27_2021;


import day45_Exceptions.PhoneTask.*;


public class PolymorphismPractice {

    public static void main(String[] args) {
       Phone phone = new Iphone("12", 1000);

       // HuaWei phone2 =  new Iphone("12", 1000);
        Phone phone2 = new Samsung("S20", 800);
        Phone phone3 = new Nokia("N95", 300);
        Phone phone4 = new HuaWei("..", 200);


        // verify phone3 is Huawei: instanceof
        boolean isHuawei = phone3 instanceof HuaWei;

        // verify phone2 is samsung
        boolean isSamsung = phone2 instanceof Samsung;

        System.out.println("===================================================");
        Phone[] phones ={
                new Iphone("12 pro", 1100),  new Samsung("S20", 1000)
                , new Nokia("N95", 200), new HuaWei("meta 40", 100),
                new HuaWei("nova 7", 100),new Iphone("11 pro", 1100),
                new Iphone("12 pro", 1100), new Iphone("12 pro", 1100),
                new Samsung("S20", 1000), new Samsung("S20", 1000),
                new Samsung("S20", 1000),new Nokia("N95", 200),
                new Nokia("N95", 200), new Iphone("12 pro", 1100),
                new Samsung("S20", 1000), new Nokia("N95", 200),
                new Nokia("N95", 200), new Nokia("N95", 200),
                new Nokia("N95", 200), new Iphone("11 pro", 1100),
                new Iphone("12 pro", 1100), new Iphone("12 pro", 1100)
        };

        int countIphone = 0;
        int countNokia =0;
        int countSamsung =0;
        int countHuawei =0;


        for (Phone each : phones) {
            if(each instanceof  Iphone){
                countIphone++;
            }else if(each instanceof Nokia){
                countNokia++;
            }else if(each instanceof Samsung){
                countSamsung++;
            }else{
                countHuawei++;
            }
        }

        System.out.println("countIphone = " + countIphone);
        System.out.println("countSamsung = " + countSamsung);
        System.out.println("countNokia = " + countNokia);
        System.out.println("countHuawei = " + countHuawei);



    }
}
