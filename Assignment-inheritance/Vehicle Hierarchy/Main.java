public class Main {
    public static void main(String[] args) {
        Car car = new Car("Sedan", 2022, "Petrol", 4, 4, true);
        car.start();
        car.displayInfo();
        car.playMusic();
        car.stop();

        System.out.println();

        Bike bike = new Bike("Sports", 2021, "Petrol", 2, false);
        bike.start();
        bike.displayInfo();
        bike.doWheelie();
        bike.stop();

        System.out.println();

        
    }
}
