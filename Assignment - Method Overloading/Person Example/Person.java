public class Person {
    String name;
    int age;
    String address;

    
    public Person(String name) {
        this.name = name;
    }

    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

  
    public void displayInfo() {
        System.out.println("Name: " + name);
        if (age != 0) {
            System.out.println("Age: " + age);
        }
        if (address != null) {
            System.out.println("Address: " + address);
        }
    }
}
