

public class Car extends Vehicle {
    int numberOfDoors;
    boolean hasAirConditioning;

    Car(String model, int year, String fuelType, int numberOfWheels, int numberOfDoors, boolean hasAirConditioning) {
        super(model, year, fuelType, numberOfWheels);
        this.numberOfDoors = numberOfDoors;
        this.hasAirConditioning = hasAirConditioning;
    }


    void start() {
        System.out.println("Car started.");
    }

    void stop() {
        System.out.println("Car stopped.");
    }

    void playMusic() {
        System.out.println("Playing music in the car.");
    }
}
