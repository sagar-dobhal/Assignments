package com.assignments;

public class EmpGroups extends Employees{

	
	public static void main(String[] args) {
		
		//Create object of Employees class
		
		Employees emp =  new Employees();
	
		//Creating array for Employees Name
		String []empName1 = new String[3];
		empName1[0]= emp.employee1;
		empName1[1]= emp.employee2;
		empName1[2]= emp.employee3;
		
		//OR String []empName1 = {emp.employee1,emp.employee2,emp.employee3};
		
//---------------------------------------------------------------------------------------------------	    
	
		//Creating array for Employees ID
	     int []empID2 = new int[3];
	
	    empID2[0]= emp.employeeID1;
		empID2[1]= emp.employeeID2;
		empID2[2]= emp.employeeID3;
		
		//OR -  int []empID2 = {emp.employeeID1,emp.employeeID2,emp.employeeID3};
		
		
		System.out.println("Employee Name:"+empName1[0]+","+"Employee ID:"+empID2[0]);
		System.out.println("Employee Name:"+empName1[1]+","+"Employee ID:"+empID2[1]);
		System.out.println("Employee Name:"+empName1[2]+","+"Employee ID:"+empID2[2]);
		
	

	}

}
