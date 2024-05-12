package Question3;

abstract class Vehicle {
    public String make;
    public String model;
    public int year;

    abstract void accelerate();

    void printDetails(String make, String model, String year) {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

}

class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Honda", "Accord", 2022);

        Vehicle bike = new Bike("BMW", "P40", 2012);
    }
}