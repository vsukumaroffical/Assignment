public class Main {
    public static void main(String[] args) {
        
        Circle circle = new Circle(5.0);
        System.out.println("Circle:");
        System.out.println("Radius: " + circle.radius);
        System.out.println("Area: " + circle.area());
        System.out.println("Perimeter: " + circle.perimeter());

        System.out.println();

        Rectangle rectangle = new Rectangle(4.0, 6.0);
        System.out.println("Rectangle:");
        System.out.println("Length: " + rectangle.length);
        System.out.println("Width: " + rectangle.width);
        System.out.println("Area: " + rectangle.area());
        System.out.println("Perimeter: " + rectangle.perimeter());
    }
}
