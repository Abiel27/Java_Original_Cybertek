package src.day39_StaticBlock;

public class CybertekStudent {

    public String name, gender;
    public int age;

    public static String schoolName, dreamJob;
    public static boolean hasReplIt, hasFlipGrid;

    static{
        schoolName = "Cybertek School";
        dreamJob = "SDET";
        hasReplIt = true;
        hasFlipGrid = true;
    }

    public void setInfo(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;

    }

    public String toString() {
        return "CybertekStudent{ " +
                "name=' " + name + '\'' +
                ", gender=' " + gender + '\'' +
                ", age= " + age +
                ", School name= "+schoolName+
                '}';
    }
}
