package src.day47_Abstraction.CarTask;

public class CarShop {

    public static void main(String[] args) {
       // Car car = new Car("Brand", "Car1", "White", 2010, 25000);
        Mercedes mercedes = new Mercedes("G class", "red", 2018, 45000);
        Toyota toyota = new Toyota("Camry", "Yellow", 2017, 30000);
        BMW bmw = new BMW("X5", "White", 2015, 35000);
        Tesla tesla = new Tesla("Model 3", "Blue", 2021, 50000);

        System.out.println("Start Mercedes- ");
            mercedes.start();

        System.out.println("Start toyota- ");
        toyota.start();

        System.out.println("Start Tesla- ");
        tesla.start();

        System.out.println("Start BMW- ");
        bmw.start();





    }

}
