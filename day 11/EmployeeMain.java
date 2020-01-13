package com.cts.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/cts";
		String user="root";
		String password="root";
		
		Connection con=DriverManager.getConnection(url, user, password);
		
		System.out.println("Connection established");
		
		
		
		String query="insert into employee values(?,?,?,?,?,?,?)";
		PreparedStatement st=con.prepareStatement(query);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("id");
		int id=Integer.parseInt(sc.nextLine());
		System.out.println("fname");
		String fname=sc.nextLine();
		System.out.println("age");
		int age=Integer.parseInt(sc.nextLine());
		System.out.println("phone");
		String phone=sc.nextLine();
		System.out.println("dept");
		String dept=sc.nextLine();
		System.out.println("location");
		String location=sc.nextLine();
		System.out.println("salary");
		String salary=sc.nextLine();
		
		st.setInt(1,id);
		st.setString(2, fname);
		st.setInt(3, age);
		st.setString(4, phone);
		st.setString(5, dept);
		st.setString(6,location);
		st.setString(7, salary);
		
		int check = st.executeUpdate();
		if(check>0)
		{
			System.out.println("updated");
		}
		else
			System.out.println("try again");
		
	}
	
	
}
class Employee
{
	int id;
	String fname;
	int age;
	String phone;
	String dept;
	String location;
	String salary;
	
	
	
	
	public Employee(int id, String fname, int age, String phone, String dept, String location, String salary) {
		super();
		this.id = id;
		this.fname = fname;
		this.age = age;
		this.phone = phone;
		this.dept = dept;
		this.location = location;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", fname=" + fname + ", age=" + age + ", phone=" + phone + ", dept=" + dept
				+ ", location=" + location + ", salary=" + salary + "]";
	}

	






}