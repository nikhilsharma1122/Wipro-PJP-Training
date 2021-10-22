package wipro;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class SerializeDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Scanner sc = new Scanner(System.in);
		Employee e = new Employee();
		System.out.println("Employee name: ");
		e.setName(sc.nextLine());
		System.out.println("Employee DOB: ");
		e.setDateofbirth(sc.nextLine());
		System.out.println("Employee department: ");
		e.setDepartment(sc.nextLine());
		System.out.println("Employee designation: ");
		e.setDesignation(sc.nextLine());
		System.out.println("Employee salary: ");
		e.setSalary(sc.nextDouble());
		sc.nextLine();
		sc.close();
		
		FileOutputStream fos = new FileOutputStream("employee.ser");
		ObjectOutputStream out = new ObjectOutputStream(fos);
		out.writeObject(e);
		out.flush();
		fos.close();
		 System.out.println();
	        System.out.println("Details written to file.");
	        System.out.println();

	        
	      FileInputStream fis = new FileInputStream("employee.ser");
	      ObjectInputStream in = new ObjectInputStream(fis);
	      
	      Employee emp = (Employee) in.readObject();
	      System.out.println("Name: " + emp.getName());
	        System.out.println("D.O.B.: " + emp.getDateofbirth());
	        System.out.println("Department: " + emp.getDepartment());
	        System.out.println("Designation: " + emp.getDesignation());
	        System.out.println("Salary: " + emp.getSalary());
	        fis.close();
	        in.close();
		
		
	}

}
