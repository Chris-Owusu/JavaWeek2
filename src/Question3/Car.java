package Question3;

public class Car extends Vehicle {

    @Override
    void accelerate() {
        System.out.println("This is the Car class");
    }

    Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;

        System.out.println("The car make is " + make + " , the model is " + model + " and the year is " + year);
    }
 }
