package com.cts.spring.controller;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.spring.dao.EmployeeDao;
import com.cts.spring.daoImpl.EmployeeDaoImpl;
import com.cts.spring.model.Employee;

public class EmployeeController {
	
	
	public static void main(String[] args) {
		//EmployeeDao abc=new EmployeeDaoImpl();
		ApplicationContext context = new ClassPathXmlApplicationContext("./beans.xml");
		EmployeeDao empDAO = (EmployeeDao) context.getBean("employeeDAOImpl");
		
		//System.out.println(empDAO.saveEmployee(new Employee(101, "hameem", "hameemsha121@gmail.com", 9895253919L)));
		Employee emp=empDAO.getEmployeeById(101);
		System.out.println(emp.getName());	
		emp.setName("pichimol");
		//System.out.println(empDAO.deleteEmployee(emp));
		empDAO.updateEmployee(emp);
		List<Employee> list=empDAO.getAllEmployees();
		System.out.println(list);
		
	
	}
	

}
