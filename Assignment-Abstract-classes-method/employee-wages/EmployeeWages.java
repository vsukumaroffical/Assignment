import java.util.Scanner;


abstract class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

   
    public String getEmployeeDetails() {
        return "ID: " + id + ", Name: " + name;
    }

    public abstract double calculatePay();
}


class HourlyEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public HourlyEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }
}


class SalariedEmployee extends Employee {
    private double annualSalary;

    public SalariedEmployee(String name, int id, double annualSalary) {
        super(name, id);
        this.annualSalary = annualSalary;
    }

    @Override
    public double calculatePay() {
        return annualSalary / 12; 
    }
}

public class EmployeeWages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter hourly employee name: ");
        String hourlyName = scanner.nextLine();
        
		System.out.print("Enter hourly employee ID: ");
        int hourlyId = scanner.nextInt();
        
		System.out.print("Enter hourly rate: ");
        double hourlyRate = scanner.nextDouble();
        
		System.out.print("Enter hours worked: ");
        int hoursWorked = scanner.nextInt();
        
		Employee hourlyEmployee = new HourlyEmployee(hourlyName, hourlyId, hourlyRate, hoursWorked);

       
        scanner.nextLine(); 
        System.out.print("Enter salaried employee name: ");
        String salariedName = scanner.nextLine();
        
		System.out.print("Enter salaried employee ID: ");
        int salariedId = scanner.nextInt();
        
		System.out.print("Enter annual salary: ");
        double annualSalary = scanner.nextDouble();
        
		Employee salariedEmployee = new SalariedEmployee(salariedName, salariedId, annualSalary);

        
        System.out.println("\n" + hourlyEmployee.getEmployeeDetails() + ", Hourly Pay: " + hourlyEmployee.calculatePay());
        System.out.println(salariedEmployee.getEmployeeDetails() + ", Monthly Pay: " + salariedEmployee.calculatePay());

        scanner.close();
    }
}

