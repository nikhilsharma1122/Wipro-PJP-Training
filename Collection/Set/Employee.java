package set;

public class Employee {
	private int EmpId;
    private String EmpName;
    private float EmpSalary;

    public Employee() {}

    public Employee(int empId, String empName, float empSalary) {
        super();
        EmpId = empId;
        EmpName = empName;
        EmpSalary = empSalary;
    }

    public void GetEmployeeDetails() {
        System.out.println("Employee name = "+EmpName+"Employee ID= "+EmpId+"Employee Salary = "+EmpSalary);
    }

    public int getEmpId() {
        return EmpId;
    }

    public void setEmpId(int empId) {
        EmpId = empId;
    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String empName) {
        EmpName = empName;
    }

   
    public float getEmpSalary() {
        return EmpSalary;
    }

    public void setEmpSalary(float empSalary) {
        EmpSalary = empSalary;
    }

}
