package com.wipro.service;
import java.util.*;
import com.wipro.bean.*;

import com.wipro.bean.EmployeeBean;

public class EmployeeService {
	private List<EmployeeBean> listEmp=new ArrayList<>();
	public boolean insertEmployee(EmployeeBean bean) {
		listEmp.add(bean);
		if(listEmp.isEmpty()) {
			return false;
		}
		else {
			
			System.out.println("Successful Inserted");
		}
		return true;
		
	}
public String insertEmployeeByPosition(EmployeeBean bean, int position) {

}
	public List<EmployeeBean> fetchAllEmployees(){
		
		if(listEmp.containsAll(listEmp)){
			for(int i = 0;i<listEmp.size();i++) {
				//System.out.println(listEmp.get(i)+" ");
				return listEmp;
			}
		}
		else {
			System.out.println("List is Empty");
			
		}
		return listEmp;
	}
	public boolean deleteEmployeeByEmpID(int empID) {
		boolean isRemoved = false;
		
		Iterator<EmployeeBean> it = listEmp.iterator();
		
		while (it.hasNext()) {
			EmployeeBean bean1 = it.next();
			if (bean1.getEmpID()== empID) {
				System.out.println(empID+" Deleted Successfully");
				isRemoved = true;
				it.remove();
			}
		}
		
		return isRemoved;
	}
	public boolean updateEmployeeByEmpID(EmployeeBean bean) {
		for(EmployeeBean e:listEmp) {
			if(e.getEmpID() == bean.getEmpID()) {
				System.out.println("Updated Successfully");
				listEmp.add(bean);
				listEmp.remove(bean.getEmpID());
				return true;
			}
		}
		return false;
	}
	public void findEmployeeByEmpID(int empID) {
		String findEmployee = "Invalid employee ID";
		for(EmployeeBean e: listEmp) {
			if(e.getEmpID() == empID) {
				e.GetEmployeeDetails();
			}
		}
	}
}
