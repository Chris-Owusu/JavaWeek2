    package Question5;

    import java.util.InputMismatchException;
    import java.util.Scanner;

    public class Area {
        private double length;
        private double breadth;

        public Area(double length, double breadth) {
            this.length = length;
            this.breadth = breadth;
        }

        public double returnArea() {
            return length * breadth;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double length = 0;
            double breadth = 0;

            try {
                System.out.println("Enter the length");
                length = scanner.nextDouble();
                System.out.println();
                System.out.println("Enter the breadth");
                breadth = scanner.nextDouble();

                Area area = new Area(length, breadth);

                System.out.println("The area of the circle is: " + area.returnArea());
            } catch (InputMismatchException e) {
                System.out.println("Invalid input for num1 or num2. Use numeric values only.");
            }
        }
        
    }


