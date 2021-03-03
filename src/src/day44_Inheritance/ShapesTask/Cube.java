package src.day44_Inheritance.ShapesTask;

public final class Cube extends Shape{

    public double side;

    public Cube(double side) {
        super("Cube");
        this.side = side;

    }

    @Override
    public double calcArea() {
     //   Square square = new Square(side); // one square of the cube
     //   double area = square.calcArea(); // are of one square
        return  side * side * 6 ;
    }

    @Override
    public double calcPerimeter() {
        return side * 12;
    }

}
