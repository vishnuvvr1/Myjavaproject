package Methodoverloading;

public class Shap {
    double Perimeter = 0.0;
    double Area = 0.0;


    public double getPerimeter() {
        return Perimeter;
    }

    public double getArea() {
        return Area;
    }
}

class Circle extends Shap {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * 3.14159265359 * radius;
    }

    @Override
    public double getArea() {
        return 3.14159265359 * radius * radius;
    }

}

class Rectangle extends Shap {
    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public double getArea() {
        return width * height;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(8.0);
        System.out.println("radius of the circle " + circle.radius);
        System.out.println("Circle Perimeter: " + circle.getPerimeter());
        System.out.println("Circle Area: " + circle.getArea());
    }
}