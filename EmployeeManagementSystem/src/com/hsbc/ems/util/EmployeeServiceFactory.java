package com.hsbc.ems.util;

import com.hsbc.ems.dao.EmployeeDao;
import com.hsbc.ems.service.EmployeeDetailsServiceImpl;
import com.hsbc.ems.service.EmployeeService;

public class EmployeeServiceFactory {
	
	public static EmployeeService getInstance(EmployeeDao dao) {
		return new EmployeeDetailsServiceImpl(dao);
	}

}
