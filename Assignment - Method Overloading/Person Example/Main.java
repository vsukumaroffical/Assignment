public class Main {
    public static void main(String[] args) {
        
		
        Person person1 = new Person("Sukumar.V");
        System.out.println("Person 1 Details:");
        person1.displayInfo();
        System.out.println();

        
        
		Person person2 = new Person("Sasikumar.V", 26);
        System.out.println("Person 2 Details:");
        person2.displayInfo();
        System.out.println();

                
		Person person3 = new Person("Arun", 23, "123 North St");
        System.out.println("Person 3 Details:");
        person3.displayInfo();
    }
}
