


public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addProduct(new ElectronicsProduct("Laptop", 1200.00));
        cart.addProduct(new ClothingProduct("T-Shirt", 250.00));
        cart.addProduct(new BookProduct("Java Programming", 450.00));

        System.out.println("Shopping Cart:");
        cart.displayProducts();
        System.out.println("Total Price: " + cart.calculateTotalPrice());
    }
}
