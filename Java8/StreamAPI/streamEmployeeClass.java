import java.util.*;
import java.util.stream.Collectors;
class Employee1{
	int empNo;
	String name;
	int age;
	String location;
	
	Employee1(int empNo, String name, int age, String location){
		this.empNo = empNo;
		this.name = name;
		this.age = age;
		this.location = location;
	}
		public String toString() {
	        System.out.printf("Employee Details: \n Number :  %d \n Age : %d \n Name : %s \n Location : %s \n", empNo, age,
	                name, location);
	        return "";
	    }
	
}
public class streamEmployeeClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	Employee1 emp1 = new Employee1(1, "Suvojit",24, "Pune");
	        Employee1 emp2 = new Employee1(2,  "Priya",24, "Delhi");
	        Employee1 emp3 = new Employee1(3, "Abhishek",25, "Bangalore");
	        Employee1 emp4 = new Employee1(4, "Anirban", 23, "Kolkata");
	        Employee1 emp5 = new Employee1(5,"Abhishek",22 ,"Pune");
	        ArrayList<Employee1> al = new ArrayList();
	        al.add(emp1);
	        al.add(emp2);
	        al.add(emp3);
	        al.add(emp4);
	        al.add(emp5);
	        ArrayList<Employee1> puneEmp = (ArrayList<Employee1>) al.stream().filter(emp->emp.location == "Pune").collect(Collectors.toList());
	       puneEmp.forEach(System.out::println);
	}

}
