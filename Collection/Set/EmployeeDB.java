package set;
import java.util.*;

public class EmployeeDB {
	List<Employee> employeeDb = new ArrayList<>();

    boolean addEmployee(Employee emp) {
        return employeeDb.add(emp);
    }
  
    public Employee[] listAll() {
    	Employee[] empArray = new Employee[employeeDb.size()];
    	for(int i=0;i<employeeDb.size();i++) {
    		empArray[i] = employeeDb.get(i);
    	}
    	return empArray;
    }
}
