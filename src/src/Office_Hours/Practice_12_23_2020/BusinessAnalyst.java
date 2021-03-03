package src.Office_Hours.Practice_12_23_2020;

public class BusinessAnalyst extends Employee {


    public BusinessAnalyst(String name, String ID, char gender, double salary, boolean isFullTime) {
        super(name, "Business Analyst", ID, gender, salary, isFullTime);
    }

    public void talkToClients(){
        System.out.println(jobTitle+" "+name+" is talking to the clients");
    }


}
