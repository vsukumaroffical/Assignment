
import java.util.*;
public class EmployeeStorage{
	private static EmployeeStorage instance ;
	private static Map<Integer,Employee> employees = new HashMap<>();
	
	private EmployeeStorage(){
		
	}
	public static EmployeeStorage getInstance(){
		if(instance == null){
			instance = new EmployeeStorage();
		}
		return instance;
	}
	public void insertEmployee(Employee newEmployee){
		employees.put(newEmployee.getId(),newEmployee);
	}
	
	public List<Employee> getEmployeeList() {
		return new ArrayList<>(employees.values());
	}
	

}