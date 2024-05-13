package Question2;

public class Enum {

    public static void printColorNCode() {
        for (Color myColor : Color.values()) {
            System.out.println("Color is: " + myColor + " and Color code is: " + myColor.getColorCode());
        }
    }
    public static void main(String[] args) {
        printColorNCode();
    }

}
