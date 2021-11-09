import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

class employees{
	int id;
	String name;
	double salary;
	employees(int id,String name, double salary){
		this.id = id;
		this.name = name;
		this.salary = salary;	
	}
	@Override
	public String toString() {
		return ("name of emp : " + name);
	}
}
public class PredicateEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employees emp1 = new employees(101,"John",4000);
		employees emp2 = new employees(102,"Allen",60000);
		employees emp3 = new employees(103,"Athma",70000);
		employees emp4 = new employees(104,"Priya",8000);
		employees emp5 = new employees(105,"Mick",90000);
		ArrayList<employees> arr = new ArrayList(Arrays.asList(emp1,emp2,emp3,emp4,emp5));
		Predicate<employees> p1 = emp -> emp.salary<10000;
		arr.stream().filter(p1).forEach(System.out::println);
	}

}
