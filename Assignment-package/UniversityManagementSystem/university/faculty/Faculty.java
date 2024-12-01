package university.faculty;

import java.util.List;
import java.util.ArrayList;
import university.courses.Course;

public class Faculty {
    
	private String facultyId;
    private String name;
    private String department;
    private List<Course> coursesTaught =  new ArrayList<>();
;

    public Faculty(String facultyId, String name, String department) {
        this.facultyId = facultyId;
        this.name = name;
        this.department = department;
    }

    public String getFacultyId() {
        return facultyId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public List<Course> getCoursesTaught() {
        return coursesTaught;
    }

    public void addCourse(Course course) {
        coursesTaught.add(course);
    }
}
