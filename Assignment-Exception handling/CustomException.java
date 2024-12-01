// 2. Create a custom Exception by yourself and try throwing and catching the same.
public class CustomException {
    public static void main(String[] args) {
        User user1 = new User("Maaran", 17); 
        User user2 = new User("Sukumar", 23);   

        try {
            user1.register();
        } catch (AgeRestrictionException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            user2.register();
        } catch (AgeRestrictionException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void register() throws AgeRestrictionException {
        if (age < 18) {
            throw new AgeRestrictionException("User must be at least 18 years old to register.");
        }
        System.out.println("User " + name + " registered successfully.");
    }
}

class AgeRestrictionException extends Exception {
    public AgeRestrictionException(String message) {
        super(message);
    }
}

