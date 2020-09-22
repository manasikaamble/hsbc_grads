package com.hsbc.ems.controller;

import java.util.Collection;

import com.hsbc.ems.exception.InsufficientLeave;
import com.hsbc.ems.model.EmployeeDetails;
import com.hsbc.ems.service.EmployeeService;

public class EmployeeDetailsController {
	
	EmployeeService eds;
	
	public EmployeeDetailsController(EmployeeService eds)
	{
		this.eds = eds;
	}
	
	public EmployeeDetails saveEmployeeAccount(String employeeName, int age)
	{
		EmployeeDetails employeeAccount = this.eds.saveEmployeeDetails(employeeName, age);
		return employeeAccount;
	}
	
	public void deleteAccount(long employeeId) {
		// TODO Auto-generated method stub
		this.eds.deleteAccount(employeeId);
	}
	
	public Collection<EmployeeDetails> fetchAllAccounts() {
		// TODO Auto-generated method stub
		return this.eds.fetchAllAccounts();
	}
	
	public EmployeeDetails fetchAccountById(long employeeId) {
		// TODO Auto-generated method stub
		return this.eds.fetchAccountById(employeeId);
	}
	
	public EmployeeDetails fetchAccountByName(String employeeName) {
		// TODO Auto-generated method stub
		
		return this.eds.fetchAccountByName(employeeName);
	}

	public double checkSalary(long employeeId) {
		return this.eds.checkSalary(employeeId);
	}
	
	public void applyForLeave(long employeeId, int days)throws InsufficientLeave {
		this.eds.applyForLeave(employeeId, days);
	}
	
	
}
