package com.cts.day12.streamapi2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//import com.cts.activity.bean.Employee;

public class StreamAPI {

	public static void main(String[] args) {
		
		
		List<Employee> employees =new ArrayList<Employee>();
		
		addEmployees(employees);
		
		employees.forEach(System.out::println);
		
		List<Employee> ageScale=employees.stream().filter(emp->emp.getAge()<22 && emp.getAddress().equals("Chennai")).collect(Collectors.toList());
		
		System.out.println("data with age <22 and having address chennai");
		ageScale.forEach(System.out::println);
		
		List<Employee> lengthScale = employees.stream().filter(e -> e.getName().length()>5).collect(Collectors.toList());
		
		System.out.println("with name length greater than 5");
		lengthScale.forEach(System.out::println);
		
		//double (salary;
		List<Employee> salaryhike = employees.stream().map(e->
			{
			e.setSalary(e.getSalary()*1.1); 
			
			return e;}).collect(Collectors.toList());
		
			System.out.println("salary");
		
		salaryhike.forEach(System.out::println);
	
	}

	private static void addEmployees(List<Employee> employees) {
		Employee emp1 = new Employee(101, "Abinjjjj", "Hydrabad", 22, 6678687687L, 6786868.00);
		Employee emp2 = new Employee(102, "Anu", "Chennai", 21, 345354354L, 45464646.00);
	
		employees.add(emp1);
		employees.add(emp2);
	
	}

}
