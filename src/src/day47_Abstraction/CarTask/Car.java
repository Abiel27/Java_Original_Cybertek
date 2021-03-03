package src.day47_Abstraction.CarTask;

public abstract class Car {

    public String brand, model, color;
    public int year;
    public double price;

    public Car(String brand, String model, String color, int year, double price) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.price = price;
    }


    public  abstract void start();  // worry about details later
   // private abstract void start(); // private methods can't be overridden
 //  public final abstract void start(); // final methods can't be overridden
 //  public static abstract void start(); // static methods can't be overridden

 //   public abstract int start(int a);

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }


}
