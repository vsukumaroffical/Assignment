abstract class Product {
    private String name;

    public Product(String name) {
        this.name = name;
    }

    public abstract double getPrice();

    public abstract String getDescription();

    public String getName() {
        return name;
    }
}