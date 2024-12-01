
public class Main {
    public static void main(String[] args) {
        
        Student student = new ZSGSStudent("Sukumar", 23, "BCA");
        System.out.println("Using Parent Constructor:");
        student.displayInfo();
        
        System.out.println();

        
        ZSGSStudent zsgsStudent = new ZSGSStudent("Rani", 21, "ZSGS001", "Engineering", "Software Development", 3.8);
        System.out.println("Using Child Constructor:");
        zsgsStudent.displayInfo();
        zsgsStudent.displaySpecialization();
        System.out.println("Eligible for Scholarship: " + zsgsStudent.isEligibleForScholarship());
    }
}
