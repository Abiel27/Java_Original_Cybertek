package src;

import java.util.ArrayList;
import java.util.Arrays;

class Tester {

    public String name, ID, jobTitle, companyName;
    public double salary;
    public char gender;

    public void setInfo(String name, String ID, String jobTitle, String companyName, double salary, char gender) {
        this.name = name;
        this.ID = ID;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.salary = salary;
        this.gender = gender;
    }

    public void smokeTesting(){
        System.out.println(name+" is performing smoke testing");
    }

    public void creatingTicket(){
        System.out.println(name+" is creating ticket");
    }


    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", ID='" + ID + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", companyName='" + companyName + '\'' +
                ", salary=" + salary +
                ", gender=" + gender +
                '}';
    }

}

class Developer {

    public String name, ID, jobTitle, companyName;
    public double salary;
    public char gender;

    public static boolean hasCodingSkills = true;

    public void setInfo(String name, String ID, String jobTitle, String companyName, double salary, char gender) {
        this.name = name;
        this.ID = ID;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.salary = salary;
        this.gender = gender;
    }

    public void coding(){
        System.out.println(jobTitle+" "+name+" is coding");
    }

    public void fixingBug(){
        System.out.println(jobTitle+" "+name+" is crying");
    }


    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", ID='" + ID + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", companyName='" + companyName + '\'' +
                ", salary=" + salary +
                ", gender=" + gender +
                '}';
    }



}

public class ScrumTeam {

    public  String PO, BA, SM;
    public ArrayList<day38_Statics.ScrumTask.Tester> testersTeam = new ArrayList<>();
    public  ArrayList<day38_Statics.ScrumTask.Developer> developersTeam = new ArrayList<>();

    public static boolean hasSprint = true;
    public static boolean  hasMeeting = true;

    public void setInfo(String PO, String BA, String SM){
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
    }

    public void addTester(day38_Statics.ScrumTask.Tester tester){
        testersTeam.add(tester);
    }

    public void addTester(day38_Statics.ScrumTask.Tester[] testers){
        testersTeam.addAll(  Arrays.asList(testers) );
    }

    public void removeTester(String ID){
        testersTeam.removeIf( p -> p.ID.equalsIgnoreCase(ID) );
    }

    public void addDeveloper(day38_Statics.ScrumTask.Developer developer){
        developersTeam.add(developer);
    }

    public void addDeveloper(day38_Statics.ScrumTask.Developer[] developers){
        developersTeam.addAll( Arrays.asList(developers)  );
    }

    public void removeDeveloper(String ID){
        developersTeam.removeIf( p -> p.ID.equalsIgnoreCase( ID) );
    }

    public String toString(){
        return "PO: "+PO+", BA: "+BA+", SM: "+SM+", Total Numbers of Testers: "+testersTeam.size()
                +", Total Number of Developers: "+developersTeam.size();
    }


}


class MyScrumTeam {

    public static void main(String[] args) {

        day38_Statics.ScrumTask.Developer developer1 = new day38_Statics.ScrumTask.Developer();
        day38_Statics.ScrumTask.Developer developer2 = new day38_Statics.ScrumTask.Developer();
        day38_Statics.ScrumTask.Developer developer3 = new day38_Statics.ScrumTask.Developer();
        day38_Statics.ScrumTask.Developer developer4 = new day38_Statics.ScrumTask.Developer();

        developer1.setInfo("Bektemir", "K-01", "Full stack Developer", "Amazon", 160000, 'M');
        developer2.setInfo("Nikola", "Y-821", "Software Developer", "Windows", 155000, 'M');
        developer3.setInfo("Meredith", "T-234", "Full stack Developer", "Apple", 140000, 'F');
        developer4.setInfo("Ian", "L-02", "Developer", "CVS Pharmacy", 135000, 'M');


        day38_Statics.ScrumTask.Tester tester1 = new day38_Statics.ScrumTask.Tester();
        day38_Statics.ScrumTask.Tester tester2 = new day38_Statics.ScrumTask.Tester();
        day38_Statics.ScrumTask.Tester tester3 = new day38_Statics.ScrumTask.Tester();
        tester1.setInfo("Adnan","0005","Tester","Cybertek",98000,'M');
        tester2.setInfo("Dean","0006","Tester","Cybertek",98500,'M');
        tester3.setInfo("Jair","0007","Tester","Cybertek",99000,'M');

        day38_Statics.ScrumTask.Tester[] testers= {tester2, tester3};
        day38_Statics.ScrumTask.Developer[] developers = {developer1, developer2, developer3, developer4};

        day38_Statics.ScrumTask.ScrumTeam scrum1 = new day38_Statics.ScrumTask.ScrumTeam();
        scrum1.setInfo("Yalcin", "Bektemir", "Elvira");
        scrum1.addTester(tester1);
        scrum1.addTester(testers);
        scrum1.addDeveloper(developers);

        System.out.println(scrum1);

        for(day38_Statics.ScrumTask.Developer each   : scrum1.developersTeam ){
            System.out.println(each);
        }

        for(day38_Statics.ScrumTask.Tester each  : scrum1.testersTeam ){
            System.out.println(each);
        }

        System.out.println("==================================");
        day38_Statics.ScrumTask.Tester tester4 = new day38_Statics.ScrumTask.Tester();
        day38_Statics.ScrumTask.Tester tester5 = new day38_Statics.ScrumTask.Tester();
        tester4.setInfo("Asuman","GR-24","SDET","Javaholics", 170000,'F');
        tester5.setInfo("Ercan","GR-24","SDET","Javaholics", 170000,'M');

        day38_Statics.ScrumTask.Developer developer5 = new day38_Statics.ScrumTask.Developer();
        day38_Statics.ScrumTask.Developer developer6 = new day38_Statics.ScrumTask.Developer();
        developer5.setInfo("ALtynai","GR-24","Full-Stack Developer","Javaholics", 180000,'F');
        developer6.setInfo("Shardae","GR-24","Full-Stack Developer","Javaholics", 170000,'F');

        day38_Statics.ScrumTask.ScrumTeam scrum2 = new day38_Statics.ScrumTask.ScrumTeam();
        scrum2.addTester(tester4);
        scrum2.addTester(tester5);
        scrum2.addDeveloper(developer5);
        scrum2.addDeveloper(developer6);

        scrum2.setInfo("Svetlana", "Daniel", "Mayasa");

        // scrum1.removeDeveloper("Y-821");
        //  scrum1.removeTester("0006");

        System.out.println(scrum1);
        System.out.println(scrum2);

        System.out.println("=================================================");

        day38_Statics.ScrumTask.ScrumTeam[] scrums = {scrum1, scrum2};

        // print the names & salary of every single testers

        for(day38_Statics.ScrumTask.ScrumTeam eachScrum : scrums ){
            for(day38_Statics.ScrumTask.Tester eachTester    : eachScrum.testersTeam  ){
                System.out.println( eachTester.name  +" : $"+eachTester.salary);
            }
        }

        System.out.println("===================================================");
        // print the names & salary of every single developers
        for(day38_Statics.ScrumTask.ScrumTeam eachScrum : scrums ){
            for(day38_Statics.ScrumTask.Developer eachDeveloper    : eachScrum.developersTeam  ){
                System.out.println( eachDeveloper.name  +" : $"+eachDeveloper.salary);
            }
        }

        System.out.println("===============================================");
        int countDevelopers = 0;
        int countTesters = 0;

        for(day38_Statics.ScrumTask.ScrumTeam each : scrums ){
            countTesters += each.testersTeam.size();
            countDevelopers += each.developersTeam.size();
        }

        System.out.println("Testers: "+countTesters);
        System.out.println("Developers: "+countDevelopers);





    }

}


// just for hsaring the codes in tasks_solution channel