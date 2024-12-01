package university.students;

import java.util.List;
import java.util.ArrayList;
import university.courses.Course;

public class Student {
    private String studentId;
    private String name;
    private int age;
    private List<Course> enrolledCourses = new ArrayList<>();

    public Student(String studentId, String name, int age) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void enrollInCourse(Course course) {
        enrolledCourses.add(course);
    }
}