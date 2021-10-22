package wipro;
public class Employee implements java.io.Serializable{
	String name;
	String dateofbirth;
	String department;
	String designation;
	double Salary;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	
	   @Override
	    public String toString() {
	        return "Employee [name=" + name + ", dob=" + dateofbirth + ", department=" + department + ", designation=" + designation + ", salary=" + Salary + "]";
	    }
}
