package bean;

public class EmployeeBean {
	private int id;
	private String name,designation;
	public EmployeeBean() {
		
	}
	public EmployeeBean(int id, String empName, String desg) {
		this.id = id;
		this.name = empName;
		this.designation = desg;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
}	
