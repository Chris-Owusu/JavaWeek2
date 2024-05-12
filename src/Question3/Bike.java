package Question3;

public class Bike extends Vehicle {
    @Override
    void accelerate() {
        System.out.println("This is the Bike class");
    }

    Bike(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;

        System.out.println("The bike make is " + make + " , the model is " + model + " and the year is " + year);
    }
}
