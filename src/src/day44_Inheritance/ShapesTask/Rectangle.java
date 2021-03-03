package src.day44_Inheritance.ShapesTask;

public final class Rectangle extends Shape{

     /*
    variables: 4 ( 1 ins, 3 sta)
    methods: 4 (4 ins)
     */

    public double width, length;

    public Rectangle(double width, double length) {
        super("Rectangle");
        this.width = width;
        this.length = length;

    }

    @Override
    public  double calcArea(){
        return width * length;
    }

    @Override
    public double calcPerimeter() {
        return (width+length)*2;
    }


}
