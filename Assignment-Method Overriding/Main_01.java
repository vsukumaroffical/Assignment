/**
 Add getEmployeeDetails method to the class 'Employee' and extend it in subclasses representing 
 different types of employees such as HourlyEmployee and SalariedEmployee and overload getEmployeeDetails. 
 Demonstrate polymorphism by printing various types of Employees by using Parent Class reference.

*/


class Employee {
    
	private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getEmployeeDetails() {
        return "ID: " + id + ", Name: " + name;
    }
}


class HourlyEmployee extends Employee {
    private double hourlyRate;

    public HourlyEmployee(String name, int id, double hourlyRate) {
        super(name, id);
        this.hourlyRate = hourlyRate;
    }

    
    @Override
    public String getEmployeeDetails() {
        return super.getEmployeeDetails() + ", Hourly Rate: RS  :" + hourlyRate;
    }
}


class SalariedEmployee extends Employee {
    private double annualSalary;

    public SalariedEmployee(String name, int id, double annualSalary) {
        super(name, id);
        this.annualSalary = annualSalary;
    }

    
    @Override
    public String getEmployeeDetails() {
        return super.getEmployeeDetails() + ", Annual Salary : " + annualSalary;
    }
}


public class Main_01 {
    
	public static void main(String[] args) {
        Employee emp1 = new HourlyEmployee("Sukumar V", 101, 200);
        Employee emp2 = new SalariedEmployee("Arun K", 102, 500000);

        
        printEmployeeDetails(emp1);
        printEmployeeDetails(emp2);
    }

   
    public static void printEmployeeDetails(Employee emp) {
        System.out.println(emp.getEmployeeDetails());
    }
}
