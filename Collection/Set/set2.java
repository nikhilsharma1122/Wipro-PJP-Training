package set;

public class set2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDB empdb = new EmployeeDB();
		Employee emp1 = new Employee(12,"Emp1 ",25000);
		Employee emp2 = new Employee(13,"Emp2 ",45000);
		Employee emp3 = new Employee(14,"Emp3 ",65000);
		empdb.addEmployee(emp1);
		empdb.addEmployee(emp2);
		empdb.addEmployee(emp3);
		
		for(Employee e:empdb.listAll()) {
			e.GetEmployeeDetails();
		}
			
	}

}
