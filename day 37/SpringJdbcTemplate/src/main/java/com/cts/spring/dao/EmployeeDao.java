package com.cts.spring.dao;

import java.util.List;

import com.cts.spring.model.Employee;

public interface EmployeeDao {
	
	public boolean saveEmployee(Employee emp);
	public boolean updateEmployee(Employee emp);
	public boolean deleteEmployee(Employee emp);
	public Employee getEmployeeById(int id);
	public List<Employee> getAllEmployees();
	
}
