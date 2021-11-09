import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;

class Emp{
	 int empNo, salary;
	    String name, location;

	    Emp(int empNo, int salary, String name, String location) {
	        this.empNo = empNo;
	        this.salary = salary;
	        this.name = name;
	        this.location = location;
	    }

	    @Override
	    public String toString() {
	        System.out.printf("Emp Details: \n Number :  %d \n Salary : %d \n Name : %s \n Location : %s \n", empNo,
	                salary, name, location);
	        return "";
	    }

}
public class FunctionEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp emp1 = new Emp(1, 24000, "Suvojit", "Pune");
        Emp emp2 = new Emp(2, 24000, "Priya", "Delhi");
        Emp emp3 = new Emp(3, 22000, "Abhishek", "Bangalore");
        Emp emp4 = new Emp(4, 23000, "Anirban", "Kolkata");
        Emp emp5 = new Emp(5, 22000, "Abhishek", "Pune");
        ArrayList<Emp> emps = new ArrayList<>(Arrays.asList(emp1,emp2,emp3,emp4,emp5));
        ArrayList<String>locs = new ArrayList();
        Function<Emp,String> getloc = emp->emp.location;
        emps.forEach(emp->locs.add(getloc.apply(emp)));
        locs.forEach(System.out::println);
	}

}
