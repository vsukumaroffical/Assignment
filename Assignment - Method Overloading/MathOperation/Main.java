public class Main {
    public static void main(String[] args) {
        MathOperations mathOps = new MathOperations();

        // Integer operations
        System.out.println("Integer Operations:");
        System.out.println("Add: " + mathOps.add(5, 3));
        System.out.println("Subtract: " + mathOps.subtract(5, 3));
        System.out.println("Multiply: " + mathOps.multiply(5, 3));
        System.out.println("Divide: " + mathOps.divide(10, 2));
        System.out.println("Divide by zero: " + mathOps.divide(10, 0));

        System.out.println();

        // Double operations
        System.out.println("Double Operations:");
        System.out.println("Add: " + mathOps.add(5.5, 3.2));
        System.out.println("Subtract: " + mathOps.subtract(5.5, 3.2));
        System.out.println("Multiply: " + mathOps.multiply(5.5, 3.2));
        System.out.println("Divide: " + mathOps.divide(10.5, 2.5));
        System.out.println("Divide by zero: " + mathOps.divide(10.5, 0.0));
    }
}
