package com.wipro.main;

import java.util.Scanner;

import com.wipro.bean.EmployeeBean;
import com.wipro.service.EmployeeService;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Choice:");
		System.out.println("1. Insert Employee");
		System.out.println("2. Searching Employee");
		System.out.println("3. Deleting Employee");
		System.out.println("4. Updating Employee");
		System.out.println("5. See Employee Details");
		System.out.println("6. Set Employee Position");
		System.out.println("7. EXIT");
		int choice;
		
		boolean done = false;
		EmployeeService emp = new EmployeeService();
		do {
		choice = sc.nextInt();
		switch(choice) {
		
		case 1:System.out.println("----- Insert Employee Details --------");
			
			
			EmployeeBean empBean = new EmployeeBean(1,"Emp1",90000,"Manager-L1");
			EmployeeBean empBean1 = new EmployeeBean(2,"Emp2",100000,"Manager-L2");
			//System.out.println("Data Inserted");
			emp.insertEmployee(empBean);
			emp.insertEmployee(empBean1);
			
			
			break;
		case 2:System.out.println("----- Searching Employee Details -----");
				emp.findEmployeeByEmpID(1);
			break;
		case 3:System.out.println("----- Delete Employee Details -----");
				emp.deleteEmployeeByEmpID(2);
			break;
		case 4:System.out.println("----- Updating Employee Details -----");
				EmployeeBean empBean3 = new EmployeeBean(1,"Emp3",200000,"Manager-L3");
				emp.updateEmployeeByEmpID(empBean3);
			break;
		case 5:System.out.println("----- Employee Details -----");
				for(EmployeeBean e:emp.fetchAllEmployees()) {
					e.GetEmployeeDetails();
				}
				break;
		case 6:System.out.println("----- Insert Employee At Specific Position -----");
				EmployeeBean empBean4 = new EmployeeBean(4,"Emp4",300000,"Manager-L4");
				emp.insertEmployeeByPosition(empBean4, 4);
					break;
		case 7:System.out.println("----- EXIT -----");
			done = true;
			sc.close();
			break;
		
		default:
			System.out.println("Please choose appropriate choice");break;
			}
		}while(!done);
	}

	

}
