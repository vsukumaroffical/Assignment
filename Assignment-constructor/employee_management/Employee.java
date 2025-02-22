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

