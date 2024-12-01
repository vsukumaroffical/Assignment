public class Bike extends Vehicle {
    boolean hasCarrier;

    Bike(String model, int year, String fuelType, int numberOfWheels, boolean hasCarrier) {
        super(model, year, fuelType, numberOfWheels);
        this.hasCarrier = hasCarrier;
    }

   
    void start() {
        System.out.println("Bike started with kick start.");
    }

    void stop() {
        System.out.println("Bike stopped.");
    }

    void doWheelie() {
        System.out.println("Bike doing a wheelie!");
    }
}
