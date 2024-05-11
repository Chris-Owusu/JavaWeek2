package Question1;

import Question1.Circle;
import Question1.Rectangle;

public class Shape {
    public double calculateArea() {
        return 0.000;
    }

    public double calculatePerimeter() {
        return 0.000;
    }

    public static void main(String[] args) {
        System.out.println("This is the shape class...");

        Circle circle = new Circle(4);
        System.out.printf("The area of a circle is: %.2f%n", circle.calculateArea());
        System.out.printf("The perimeter of a circle is: %.2f%n", + circle.calculatePerimeter());

        Rectangle rectangle = new Rectangle(4, 5);
        System.out.printf("The area of a rectangle is: %.2f%n", rectangle.calculateArea());
        System.out.printf("The perimeter of a rectangle is: %.2f%n", rectangle.calculatePerimeter());


    }
}
