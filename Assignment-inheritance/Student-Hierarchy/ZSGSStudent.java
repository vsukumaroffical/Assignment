class ZSGSStudent extends Student {
    String specialization;
    double gpa;

    
    ZSGSStudent(String name, int age, String specialization) {
        super(name, age); 
        this.specialization = specialization;
    }

    
    ZSGSStudent(String name, int age, String studentId, String major, String specialization, double gpa) {
        super(name, age, studentId, major); 
        this.specialization = specialization;
        this.gpa = gpa;
    }

    void displaySpecialization() {
        System.out.println("Specialization: " + specialization);
        System.out.println("GPA: " + gpa);
    }

   
    boolean isEligibleForScholarship() {
        return gpa >= 3.5;
    }
}
