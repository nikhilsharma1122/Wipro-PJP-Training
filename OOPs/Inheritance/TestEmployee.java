package wipro;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person("Ram");
		Employees e = new Employees("Lakhan",50000.0,2021,"CVE232");
		System.out.println("Person name : "+p.getName());
		System.out.printf("Employee name : %s%nSalary : %f%nYear Of Joining : %d%nInsuarance No. : %s%n",
	            e.getName(), e.getSalary(), e.getYoj(), e.getInsNo());
	}

}
