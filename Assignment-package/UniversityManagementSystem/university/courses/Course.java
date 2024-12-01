package university.courses;

public class Course {
    private String courseCode;
    private String title;
    private int creditHours;

    public Course(String courseCode, String title, int creditHours) {
        this.courseCode = courseCode;
        this.title = title;
        this.creditHours = creditHours;
    }
	
    public String getCourseCode() {
        return courseCode;
    }
    public String getTitle() {
        return title;
    }

    public int getCreditHours() {
        return creditHours;
    }
}
