import java.util.*;
class emp{
	int empno;
	String name;
	int age;
	emp(int empno, String name, int age){
		this.empno = empno;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString(){
		return (name+" "+empno+" "+age);
	}
}
class InvalidEmployeeException extends Exception{
	InvalidEmployeeException(){
		super();
		System.out.println("Invalid Employee");
	}
}
public class optionalClass3 {

	public static void main(String[] args) throws InvalidEmployeeException {
		// TODO Auto-generated method stub
		emp emp1 = null;
		emp emp2 = new emp(101,"John",24);
		Optional<emp> check = Optional.ofNullable(emp2);
		System.out.println(check.orElseThrow(InvalidEmployeeException::new));
	}

}
