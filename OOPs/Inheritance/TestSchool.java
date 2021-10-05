package wipro;

public class TestSchool {

	public static void main(String[] args) {
		Persons p = new Persons("Ram","20/05/1999");
		Teacher t = new Teacher("Lakhan","10/2/1992",55000,"Computer Science");
		Student s1 = new Student("Subedar","8/05/1994","STU3");
		  CollegeStudent cs1 = new CollegeStudent("Priya", "04/03/1998", "STU007", "2K University");
		    p.getDetails();
		    t.getDetails();
		    s1.getDetails();
		    cs1.getDetails();
	}

}
