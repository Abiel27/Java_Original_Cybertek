package src.Office_Hours.Practice_01_13_2021;


public class Zoo {
    public static void main(String[] args) {
      //  Animal animal = new Animal("Animal", "Breed", "Size", 'F', 12);
        Dog dog = new Dog("Charlie", "German Shepard", "Large", 'M', 13);
       // dog.breed = "Husky";
      //  dog.name = "Alex";

        Cat cat = new Cat("miniboo", "Bengal","small",'F',125);

        Shark shark = new Shark("XYZ","White","Large",'F',25);

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(shark);

        dog.speak();
        cat.speak();
        shark.speak();

        dog.play();
        cat.play();
        shark.play();

        cat.scratch();
        dog.bark();

    //    hunt();



    }
}
