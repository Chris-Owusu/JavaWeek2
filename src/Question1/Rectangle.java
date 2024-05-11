package Question1;

public class Rectangle extends Shape {
    private double width;
    private double length;

    // Constructors
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Area -> Length * Width
    public double calculateArea() {
        return length * width;
    }

    // Perimeter -> 2 * (Length + Width)
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}
