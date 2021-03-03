package src.Office_Hours.Practice_12_23_2020;

public class ScrumMaster extends Employee {


    public ScrumMaster(String name, String ID, char gender, double salary, boolean isFullTime) {
        super(name, "Scrum Master", ID, gender, salary, isFullTime);
    }

    public void organizeMeeting(){
        System.out.println(jobTitle+" "+name+" is organizing meetings");
    }


}
