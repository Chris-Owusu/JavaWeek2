package Question4;

import java.util.Scanner;

public class ArithmeticException {

    public static int divide(int num1, int num2) {
        int result = 0;
        try {
            result = num1 / num2;
            System.out.println("The final result is: " + result);
        } catch (java.lang.ArithmeticException e) {
            if (num2 == 0)   {
                System.out.println("You can't " + e.getMessage());
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter num2: ");
        int num2 = scanner.nextInt();
        divide(num1,num2);
    }
}

