package Question1;

public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // Area -> PI * r * r
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    // Perimeter 2 * PI * r
    public double calculatePerimeter() {
        return 2 * (Math.PI * radius);
    }
}
