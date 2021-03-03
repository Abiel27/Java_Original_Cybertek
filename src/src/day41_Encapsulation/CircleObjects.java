package src.day41_Encapsulation;

public class CircleObjects {

    public static void main(String[] args) {

        Circle c1 = new Circle(4);

       // System.out.println(c1.area);
        System.out.println(c1.getDiameter());
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter() );

        System.out.println("=======================");
        c1.setRadius(5);
        System.out.println(c1.getDiameter());
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter() );


    }

}
