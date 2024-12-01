package com.employee_management.dto;

public class Employee{
    
	private int id;
    private String name;
    private int age;
    private String department;
    private long mobileNumber;
	private String emailId;
    private static int employeeCount = 0; 

    public Employee(int id, String name, int age, String department, long mobileNumber,String emailId) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
        this.mobileNumber = mobileNumber;
		this.emailId = emailId;
        employeeCount++; 
    }

   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
	
	public String getEmailID() {
        return emailId;
    }

    public void setEmailID(String emailId) {
        this.emailId= emailId;
    }

    public static int getEmployeeCount() {
        return employeeCount;
    }

    public void displayEmployeeDetails() {
		System.out.println("--------------------------------------------------------------");
		System.out.println("Emp Id : "+this.id+"\tName       : "+this.name);
		System.out.println("Age    : "+this.age+"\tDepartment : "+this.department);
		System.out.println("Ph No  : "+this.mobileNumber+"\tEmail ID   : "+this.emailId);
		System.out.println("--------------------------------------------------------------");
    }
}
package com.example.library.dto;

public class Movie {
    // Instance variables
    private int id;
    private String title;
    private String genre;
    private String director;
    private int releaseYear;
    private double rating;
    private static int movieCount = 0; // Static variable to track number of movies

    // Constructor
    public Movie(int id, String title, String genre, String director, int releaseYear, double rating) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.director = director;
        this.releaseYear = releaseYear;
        this.rating = rating;
        movieCount++; // Increment movie count for each new movie
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public static int getMovieCount() {
        return movieCount;
    }

    // Optional: Override toString to display Movie details easily
    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", director='" + director + '\'' +
                ", releaseYear=" + releaseYear +
                ", rating=" + rating +
                '}';
    }
}
