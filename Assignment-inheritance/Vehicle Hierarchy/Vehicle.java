
public abstract class Vehicle {
    String model;
    int year;
    String fuelType;
    int numberOfWheels;

    
    Vehicle(String model, int year, String fuelType, int numberOfWheels) {
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
        this.numberOfWheels = numberOfWheels;
    }

    
    abstract void start();
    abstract void stop();

    
    void displayInfo() {
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Number of Wheels: " + numberOfWheels);
    }
}
