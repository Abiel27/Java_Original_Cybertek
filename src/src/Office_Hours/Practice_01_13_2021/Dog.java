package src.Office_Hours.Practice_01_13_2021;

public final class Dog extends Animal {

    public Dog(String name, String breed, String size, char gender, int age) {
        super(name, breed, size, gender, age);
    }

    public void speak(){
        System.out.println("Woof Woof");
    }

    public void bark(){
        System.out.println(name+" is barking");
    }

    @Override
    protected void play() {
        System.out.println("plays fetch");
    }

    @Override
    public String toString() {
        return "Dog"+super.toString();
    }

}
