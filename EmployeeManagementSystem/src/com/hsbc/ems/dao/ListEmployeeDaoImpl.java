package com.hsbc.ems.dao;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;


import com.hsbc.ems.model.EmployeeDetails;

public class ListEmployeeDaoImpl implements EmployeeDao {
	
	private List<EmployeeDetails> employeeAccountList = new LinkedList<>();

	@Override
	public EmployeeDetails saveEmployeeDetails(EmployeeDetails employeedetails) {
		// TODO Auto-generated method stub
		employeeAccountList.add(employeedetails);
		return employeedetails;
	}

	@Override
	public EmployeeDetails updateEmployeeDetails(long employeeId, EmployeeDetails employeedetails) {
		// TODO Auto-generated method stub
		for( EmployeeDetails ed: employeeAccountList) {
			if(ed.getEmployeeId() == employeeId)
			{
				ed = employeedetails;
			}
			
		}
		return employeedetails;
		
	}

	@Override
	public void deleteEmployeeAccount(long employeeId) {
		// TODO Auto-generated method stub
		for( EmployeeDetails ed: employeeAccountList) {
			if(ed.getEmployeeId() == employeeId)
			{
				employeeAccountList.remove(ed);
			}
			
		}
		
	}

	@Override
	public Collection<EmployeeDetails> fetchAllAccounts() {
		// TODO Auto-generated method stub
		return employeeAccountList;
	}

	@Override
	public EmployeeDetails fetchAccountById(long employeeId) {
		// TODO Auto-generated method stub
		for( EmployeeDetails ed: employeeAccountList) {
			if(ed.getEmployeeId() == employeeId)
			{
				return ed;
			}
			
		}
		return null;
	}

	@Override
	public EmployeeDetails fetchAccountByName(String employeeName) {
		// TODO Auto-generated method stub
		for( EmployeeDetails ed: employeeAccountList) {
			if(ed.getEmployeeName() == employeeName)
			{
				return ed;
			}
			
		}
		return null;
	}

}
