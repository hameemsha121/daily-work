package com.cts.Test;

import java.util.Scanner;

public class InheritanceDemo {
	
	public static void main(String[] args)
	{
	
		/*Employee emp=new Employee();
	emp.getData();
	emp.display();
	Manager man=new Manager();
	man.getData1();
	man.displayManager();
	*/
	Developer dev=new Developer();
	dev.getData2();
	
	dev.displayDeveloper();
	dev.getData();
	dev.display();
	}
}
class Employee
{
	 int id;
	 String name;
	 String company;
	 public void display()
	 {
		 System.out.println(id +" " +name+ " "+company);
	 }
	 public void getData()
	 {
		 Scanner scanner=new Scanner(System.in);
		 System.out.println("Enter name");
	
		 name=scanner.nextLine();
		 
		 System.out.println("Enter company");
		 company=scanner.nextLine();
	
		 System.out.println("Enter Id: ");
		 id=scanner.nextInt();
		 


	 }
}

class Manager extends Employee
{
	
	String [] team;
	String department;
	int size;
	
	public void getData1()
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter department name");
		
		department=sc.nextLine();
		
		System.out.println("Enter no.of team members");
	    
		size=Integer.parseInt(sc.nextLine());
		team = new String[size];
		System.out.println("Enter team members name");
		for(int i=0;i<size;i++)
		{
			team[i]=sc.nextLine();
		}
		
		
		
	}
	public void displayManager()
	{
		System.out.println("The department is :" +department);
		System.out.println("The team members are : ");
		for(int i=0;i<size;i++)
		{
			System.out.println(team[i]);
		}
	}
	
}

class Developer extends Employee
{
	String projectname;
	String duration;
	String domain;
	
	
	public void getData2()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the projectname");
		projectname=sc.nextLine();
		System.out.println("Enter the duration of the project");
		duration=sc.nextLine();
		System.out.println("Enter the domain");
		domain=sc.nextLine();
		//sc.close();
	}
	public void displayDeveloper()
	{
		System.out.println("The project name is :"+projectname + " the duration:"+duration +" The domain:"+domain);
	}
}