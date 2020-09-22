package com.hsbc.ems.client;

import java.util.Scanner;

import com.hsbc.ems.controller.EmployeeDetailsController;
import com.hsbc.ems.dao.EmployeeDao;
import com.hsbc.ems.exception.InsufficientLeave;
import com.hsbc.ems.model.EmployeeDetails;
import com.hsbc.ems.service.EmployeeService;
import com.hsbc.ems.util.EmployeeDAOFactory;
import com.hsbc.ems.util.EmployeeServiceFactory;

public class EmployeeDetailsClient {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter your option");
		System.out.println("1) Array Backed");
		System.out.println("2) List Backed");
		System.out.println("3) Set Backed");
		
		System.out.println("-------------------------------------------------------------");
		
		int option = scanner.nextInt();
		
		System.out.println(" You entered option number :  "+ option);
		
		EmployeeDao edao = EmployeeDAOFactory.getSavingsAccountDAO(option);
		
		EmployeeService es = EmployeeServiceFactory.getInstance(edao);
		
		EmployeeDetailsController controller = new EmployeeDetailsController(es);
		
		EmployeeDetails emp1 = controller.saveEmployeeAccount("Joey", 24);
		EmployeeDetails emp2 = controller.saveEmployeeAccount("Ariel", 28);
		EmployeeDetails emp3 = controller.saveEmployeeAccount("Amy", 27);
		
		System.out.println(emp1.getEmployeeId());
		
		try {
			controller.applyForLeave(emp1.getEmployeeId(), 5);
	              }catch(InsufficientLeave ex) {
	            	  System.out.print(ex.getMessage());
	              }

			System.out.println(emp1.toString());

		
		
		
		
	}

}
