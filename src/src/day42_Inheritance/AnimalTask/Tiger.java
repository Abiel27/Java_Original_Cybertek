package src.day42_Inheritance.AnimalTask;

public class Tiger extends Animal {

    public Tiger(String name, String breed, char gender, int age, String color, String size) {
        setInfo(name, breed, gender, age, color, size);
    }

    public void hunt(){
        System.out.println(name + " is hunting");
    }

    public void roar(){
        System.out.println(name+" is roaring");
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
