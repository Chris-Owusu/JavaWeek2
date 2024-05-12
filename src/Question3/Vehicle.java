package Question3;

abstract class Vehicle {
    public String make;
    public String model;
    public int year;

    abstract void accelerate();

    void printDetails(String make, String model, int year) {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

}

class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Honda", "Accord", 2022);
        car.accelerate();
        car.printDetails("Honda", "Accord", 2022);

        System.out.println( );

        Vehicle bike = new Bike("BMW", "P40", 2012);
        bike.accelerate();
        bike.printDetails("BMW", "P40", 2012);
    }
}