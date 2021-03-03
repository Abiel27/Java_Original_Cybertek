package src.day46_JavaRecap.CarTask;

public final class Mercedes extends Car {


    public Mercedes( String model, String color, int year, double price) {
        super("Mercedes", model, color, year, price);
    }

    public void start(){
        System.out.println("Starting "+brand+" "+model+" by pushing start button");
    }


}
