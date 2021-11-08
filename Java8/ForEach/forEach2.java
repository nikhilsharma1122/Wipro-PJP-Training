import java.util.*;
class Employee {
    int id;
    double salary;
    String address, name;

    Employee(int id, double salary, String name, String address) {
        this.id = id;
        this.salary = salary;
        this.name = name;
        this.address = address;
    }
}
public class forEach2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee(1, 100.0, "James", "Kolkata");
        Employee emp2 = new Employee(2, 200.0, "Kames", "Colkata");
        Employee emp3 = new Employee(3, 300.0, "Lames", "Lolkata");
        Employee emp4 = new Employee(4, 400.0, "Names", "Tolkata");
        Employee emp5 = new Employee(5, 500.0, "Pames", "Bolkata");
        
        ArrayList<Employee> emplist=new ArrayList<Employee>();
        emplist.add(emp1);
        emplist.add(emp2);
        emplist.add(emp3);
        emplist.add(emp4);
        emplist.add(emp5);
        emplist.forEach(emp->System.out.println( "ID : " + emp.id + " Name : " + emp.name + " Salary : " + emp.salary + " Address : " + emp.address));
	}

}
