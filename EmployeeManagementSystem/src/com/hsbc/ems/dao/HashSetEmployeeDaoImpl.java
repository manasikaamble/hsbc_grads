package com.hsbc.ems.dao;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


import com.hsbc.ems.model.EmployeeDetails;

public class HashSetEmployeeDaoImpl implements EmployeeDao {
	
	private Set<EmployeeDetails> set = new HashSet<>();
	
	Iterator<EmployeeDetails> itr = set.iterator();

	@Override
	public EmployeeDetails saveEmployeeDetails(EmployeeDetails employeedetails) {
		// TODO Auto-generated method stub
		set.add(employeedetails);
		return employeedetails;
	}

	@Override
	public EmployeeDetails updateEmployeeDetails(long employeeId, EmployeeDetails employeedetails) {
		// TODO Auto-generated method stub
		while(itr.hasNext()) {
			EmployeeDetails ed =itr.next();
			if(ed.getEmployeeId() == employeeId) {
				ed = employeedetails;
			}
		}
		return null;
	}

	@Override
	public void deleteEmployeeAccount(long employeeId) {
		// TODO Auto-generated method stub
		while(itr.hasNext()) {
			EmployeeDetails updated=itr.next();
			if(itr.next().getEmployeeId()==employeeId) {
			set.remove(updated);
			}
		}

		
	}

	@Override
	public Collection<EmployeeDetails> fetchAllAccounts() {
		// TODO Auto-generated method stub
		
		return set;
	}

	@Override
	public EmployeeDetails fetchAccountById(long employeeId) {
		// TODO Auto-generated method stub
		while(itr.hasNext()) {
			
			EmployeeDetails empAccount=itr.next();
			if(empAccount.getEmployeeId() == employeeId) {
			return empAccount;
			}
		}
		return null;
	}

	@Override
	public EmployeeDetails fetchAccountByName(String employeeName) {
		// TODO Auto-generated method stub
		while(itr.hasNext()) {
			
			EmployeeDetails empAccount=itr.next();
			if(empAccount.getEmployeeName() == employeeName) {
			return empAccount;
			}
		}
		return null;
	}

}
