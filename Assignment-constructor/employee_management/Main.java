
import java.util.*;

public class Main {

	public void loadDefaultEmployee(){
	    Employee emp1 = new Employee(1, "Sukumar V", 23, "IT", 9677595469L, "sukumar@gmail.com");
        Employee emp2 = new Employee(2, "Sasikumar", 27, "HR", 9876543210L, "sasi@gmail.com");
        Employee emp3 = new Employee(3, "Charlie Brown", 28, "Finance", 1122334455L, "charlie@gmail.com");
        Employee emp4 = new Employee(4, "Diana", 35, "Marketing", 9988776655L, "diana@gmail.com");
        Employee emp5 = new Employee(5, "John", 40, "Operations", 2233445566L, "john@gmail.com");

       EmployeeStorage.getInstance().insertEmployee(emp1);
	   EmployeeStorage.getInstance().insertEmployee(emp2);
	   EmployeeStorage.getInstance().insertEmployee(emp3);
	   EmployeeStorage.getInstance().insertEmployee(emp4);
	   EmployeeStorage.getInstance().insertEmployee(emp5);
	}
	public static void main(String args[]){
		new Main().loadDefaultEmployee();
		List<Employee> employees = EmployeeStorage.getInstance().getEmployeeList(); 
		for(Employee employee : employees) {
				employee.displayEmployeeDetails();
		}
	}

}