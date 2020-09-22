package com.hsbc.ems.dao;

import java.util.Collection;
import java.util.List;

import com.hsbc.ems.model.EmployeeDetails;

public interface EmployeeDao {
	
	public EmployeeDetails saveEmployeeDetails(EmployeeDetails employeedetails);
	
	public EmployeeDetails updateEmployeeDetails(long employeeId, EmployeeDetails employeedetails);
	
	public void deleteEmployeeAccount(long employeeId);
	
	Collection<EmployeeDetails> fetchAllAccounts();
	
	public EmployeeDetails fetchAccountById(long employeeId);
	
	public EmployeeDetails fetchAccountByName(String employeeName);

}
