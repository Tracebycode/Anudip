// Write a Java program to create a class called Shape with a method called getArea(). ● Create a subclass called Circle and create a constructor that takes the value of radius(int) as input parameter. ● Override the getArea() method. ● Create a class called square that takes an attribute length. Create a constructor that takes length as input. ● Override the getArea() method


class Shape{
    public double getArea(){
        return 0.0;
    }
}

class Circle extends Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Square extends Shape{
    int side;
    public Square(int side) {
        this.side = side;
    }
    @Override
    public double getArea() {
        return side * side;
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape square = new Square(4);

        System.out.println("Area of Circle: " + circle.getArea());
        System.out.println("Area of Square: " + square.getArea());
    }
}