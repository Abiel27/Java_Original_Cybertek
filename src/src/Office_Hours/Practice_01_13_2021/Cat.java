package src.Office_Hours.Practice_01_13_2021;

public final class Cat extends Animal {
    public Cat(String name, String breed, String size, char gender, int age) {
        super(name, breed, size, gender, age);
    }

    @Override
    protected void speak() {
        System.out.println("Meow Meow");
    }

    @Override
    protected void play() {
        System.out.println("plays with mouse");
    }

    public void scratch(){
        System.out.println(name+" is scratching");
    }

    @Override
    public String toString() {
        return "Cat"+super.toString();
    }
}
