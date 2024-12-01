import university.students.Student;
import university.courses.Course;
import university.faculty.Faculty;

public class UniversityApp {
    public static void main(String[] args) {
        Student student = new Student("S001", "Sukumar", 20);
        Course course = new Course("CS101", "Introduction to Java", 2);
        Faculty faculty = new Faculty("F001", "Dr. Thamarai Selven", "Computer Science");

        student.enrollInCourse(course);
        faculty.addCourse(course);

        System.out.println("Student: " + student.getName() + " enrolled in " + course.getTitle());
        System.out.println("Faculty: " + faculty.getName() + " teaches " + course.getTitle());
    }
}
