package com.hsbc.ems.model;

public class EmployeeDetails {
	
	private long employeeId;
	private String employeeName;
	private int employeeAge;
	private double employeeSalary;
	private double leaveBalance;
	private static long counter = 100;
	private double leaveCounter;
	
	public EmployeeDetails(String employeeName, int employeeAge)
	{
		this.employeeName = employeeName;
		this.employeeAge = employeeAge;
		this.leaveBalance = leaveCounter;
		this.employeeId = ++ counter;
		
	}

	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getEmployeeAge() {
		return employeeAge;
	}

	public void setEmployeeAge(int employeeAge) {
		this.employeeAge = employeeAge;
	}

	public double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	

	public double getLeaveBalance() {
		return leaveBalance;
	}

	public void setLeaveBalance(double leaveBalance) {
		this.leaveBalance = leaveBalance;
	}

	@Override
	public String toString() {
		return "EmployeeDetails [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeAge="
				+ employeeAge + ", employeeSalary=" + employeeSalary + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (employeeId ^ (employeeId >>> 32));
		result = prime * result + ((employeeName == null) ? 0 : employeeName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeDetails other = (EmployeeDetails) obj;
		if (employeeId != other.employeeId)
			return false;
		if (employeeName == null) {
			if (other.employeeName != null)
				return false;
		} else if (!employeeName.equals(other.employeeName))
			return false;
		return true;
	}
	
	

}
