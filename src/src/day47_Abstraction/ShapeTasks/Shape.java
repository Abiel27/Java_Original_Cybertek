package src.day47_Abstraction.ShapeTasks;

public abstract class Shape {  // not concrete

    public String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double area(); // "what it is " matters, " how it's done" does not matter
    public abstract double perimeter();



}

