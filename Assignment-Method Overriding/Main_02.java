// In Vehicle hierarchy, add methods like start and stop in Vehicle and override them in Child classes.



class Vehicle {
    public void start() {
        System.out.println("Vehicle is starting");
    }

    public void stop() {
        System.out.println("Vehicle is stopping");
    }
}


class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting ");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping");
    }
}


class Bike extends Vehicle {
    @Override
    public void start() {
        System.out.println("Bike is starting");
    }

    @Override
    public void stop() {
        System.out.println("Bike is stopping");
    }
}


class Truck extends Vehicle {
    @Override
    public void start() {
        System.out.println("Truck is starting");
    }

    @Override
    public void stop() {
        System.out.println("Truck is stopping");
    }
}


public class Main_02{
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bike();
        Vehicle truck = new Truck();

        car.start();
        car.stop();

        bike.start();
        bike.stop();

        truck.start();
        truck.stop();
    }
}
