//Using Abstract class:



abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        Shape circle = new Circle(7.0);
        System.out.println("Area of circle: " + circle.area());
    }
}

//Using Interface:

interface Shape {
    double area();
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

public class AbstractionInterfaceExample {
    public static void main(String[] args) {
        Shape circle = new Circle(7.0);
        System.out.println("Area of circle is : " + circle.area());
    }
}
