package src.day47_Abstraction.ShapeTasks;

public class ShapeObjects { // HAS A

    public static void main(String[] args) {

       // Shape shape = new Shape("Shape");
        Circle circle = new Circle(3);
        System.out.println( "Area of circle: "+circle.area() );

        Rectangle rectangle = new Rectangle(3,5);
        System.out.println("Rectangle Area: "+rectangle.area());

        Square square = new Square(3);
        System.out.println("Square Area: "+square.area());



    }

}
