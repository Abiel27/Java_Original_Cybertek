package src.day47_Abstraction.ShapeTasks;

public class Square extends Shape { // IS A
    public double side;

    public Square(double side) {
        super("Square");
        this.side = side;
    }


    public double area() {
        return side * side;
    }


    public double perimeter() {
        return side * 4;
    }

}
