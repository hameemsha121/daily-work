/*
Problem Statement
The management of LearnMore University is planning to automate the University management system. 
Therefore, Steve Wilkinson, the programmer, has decided to create a Java program that accepts the
 student details, such as the first name, last name, age, course enrolled, and student ID.
  In addition, he also needs to accept the employee details, such as first name, last name, age,
   salary, department name, designation, and employee ID. Steve must ensure the reusability of code. 
   The program must offer a choice to accept either the student's or employee's details.
    Help Steve to develop the program.


*/
package com.cts.excercise;

import java.util.Scanner;

public class University {

	public static void main(String[] args) {

		Member m1=new Member();
		//m1.getData();
		System.out.println("Enter option 1.Employee and 2.Student");
		Scanner scanner=new Scanner(System.in);
		int choice=Integer.parseInt(scanner.nextLine());
		switch(choice)
		{
		case 1: Employee e1=new Employee();
				
				m1.getData();
				e1.getEmployeeData();
				m1.display();
				e1.display();
				break;
		case 2: Student s1=new Student();
				m1.getData();
				s1.getStudentData();
				m1.display();
				s1.display();
		
		}
		
		//Student s1=new Student();
		//s1.getStudentData();
		//s1.display();

	}
	
	
}
class Member{
	 String first_Name;
	 String last_Name;
	 int age;
	 public void getData()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter first name");
			first_Name=sc.nextLine();
			System.out.println("Enter last name");
			last_Name=sc.nextLine();
			System.out.println("Enter your age");
			age=Integer.parseInt(sc.nextLine());
}
	 public void display()
	 {
		 System.out.println("The full name is " +first_Name+" "+last_Name+" and the age is "+age);
	 }
}
class Student extends Member{
	

	String course_Enrolled;
	int student_Id;
	
	public void getStudentData()
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter course enrolled");
		course_Enrolled=sc.nextLine();
		System.out.println("Enter studentId");
		student_Id=Integer.parseInt(sc.nextLine());
	}
	public void display()
	 {
		 System.out.println("The course is " +course_Enrolled+" and the student id is "+student_Id);
	 }
}

class Employee extends Member{


	 int salary;
	 String department_Name;
	 String designation;
	 int employee_Id;
		
	 public void getEmployeeData()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter salary");
			salary=Integer.parseInt(sc.nextLine());
			System.out.println("Enter department name");
			department_Name=sc.nextLine();
			System.out.println("Enter desination");
			designation=sc.nextLine();
			System.out.println("Enter employee id");
			employee_Id=Integer.parseInt(sc.nextLine());
			
		}
	 
	 public void display()
	 {
		 
		 System.out.println("The salary is " +salary+"  the department is "+department_Name + " the designation is "+designation);
		 System.out.println("The employee id is "+ employee_Id);
	 }
	
}

