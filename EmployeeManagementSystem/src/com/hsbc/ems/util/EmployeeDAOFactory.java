package com.hsbc.ems.util;

import com.hsbc.ems.dao.EmployeeDao;
import com.hsbc.ems.dao.HashSetEmployeeDaoImpl;
import com.hsbc.ems.dao.ListEmployeeDaoImpl;

public class EmployeeDAOFactory {
	
	public static EmployeeDao getSavingsAccountDAO( int value) {
		if (value == 1 ) {
			return new HashSetEmployeeDaoImpl();
		} else {
			return new ListEmployeeDaoImpl();
		}
	}

}
