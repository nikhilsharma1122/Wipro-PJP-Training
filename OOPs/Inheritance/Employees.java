package wipro;

public class Employees extends Person {
	double salary;
	String name;
	int yoj;
	String insNo;
	
	
	Employees(String name, double salary, int yoj, String insNo){
		super(name);
		this.salary = salary;
		this.yoj = yoj;
		this.insNo = insNo;
		
	}

	void setSalary(double salary) {
		this.salary = salary;
	}
	double getSalary() {
		return this.salary;
	}
	void setYoj(int yoj) {
		this.yoj = yoj;
	}
	int getYoj() {
		return this.yoj;
	}
	void setInsNo(String insNo) {
		this.insNo = insNo;
	}
	String getInsNo() {
		return this.insNo;
	}
}
