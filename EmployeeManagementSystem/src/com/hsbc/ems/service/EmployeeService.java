package com.hsbc.ems.service;

import java.util.Collection;

import com.hsbc.ems.exception.InsufficientLeave;
import com.hsbc.ems.model.EmployeeDetails;

public interface EmployeeService {
	
	public EmployeeDetails saveEmployeeDetails(String employeeName,int age);
	
	public void deleteAccount(long employeeId);
	
	public Collection<EmployeeDetails> fetchAllAccounts();
	
	public EmployeeDetails fetchAccountById(long employeeId);
	
	public EmployeeDetails fetchAccountByName(String employeeName);
	
	public void applyForLeave(long employeeId,int days) throws InsufficientLeave;
	
	public double checkSalary(long employeeId);
	

}
