package com.hsbc.ems.service;

import java.util.Collection;

import com.hsbc.ems.dao.EmployeeDao;
import com.hsbc.ems.exception.InsufficientLeave;
import com.hsbc.ems.model.EmployeeDetails;

public class EmployeeDetailsServiceImpl implements EmployeeService {
	
	private EmployeeDao dao;
	
	public EmployeeDetailsServiceImpl(EmployeeDao dao)
	{
		this.dao = dao;
	}

	@Override
	public EmployeeDetails saveEmployeeDetails(String employeeName, int age) {
		// TODO Auto-generated method stub
		EmployeeDetails employeeAccount = new EmployeeDetails(employeeName,age);
		
		EmployeeDetails employeeAccountCreated = this.dao.saveEmployeeDetails(employeeAccount);
		return employeeAccountCreated;
	}

	@Override
	public void deleteAccount(long employeeId) {
		// TODO Auto-generated method stub
		this.dao.deleteEmployeeAccount(employeeId);
	}

	@Override
	public Collection<EmployeeDetails> fetchAllAccounts() {
		// TODO Auto-generated method stub
		return this.dao.fetchAllAccounts();
	}

	@Override
	public EmployeeDetails fetchAccountById(long employeeId) {
		// TODO Auto-generated method stub
		return this.dao.fetchAccountById(employeeId);
	}

	@Override
	public EmployeeDetails fetchAccountByName(String employeeName) {
		// TODO Auto-generated method stub
		
		return this.dao.fetchAccountByName(employeeName);
	}

	@Override
	public void applyForLeave(long employeeId, int days) throws InsufficientLeave{
		if(days <= 10)
		{
			EmployeeDetails emp = this.dao.fetchAccountById(employeeId);
			if(emp.getLeaveBalance()-days >= 0)
			{
				emp.setLeaveBalance(emp.getLeaveBalance()-days);
				EmployeeDetails emd = this.dao.updateEmployeeDetails(employeeId, emp);
				System.out.println("Can take a leave of " + days + "days");
			}
			else
			{
				throw new InsufficientLeave("Check your remaining leaves");
			}
		}
	
		
	}

	@Override
	public double checkSalary(long employeeId) {
		// TODO Auto-generated method stub
		EmployeeDetails empAccount = this.dao.fetchAccountById(employeeId);
		if (empAccount != null) {
			return empAccount.getEmployeeSalary();
		}
		return 0;
	}

}
