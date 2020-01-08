package com.cts.Test;

public class OverridingDemo {
	
	public static void main( String[] args) {
		Employee emp=new Employee();
		emp.display();//static binding
		Manager man=new Manager();
		man.display();//static binding
		Employee emp2 = new Manager(); //Dynamic binding(runtime polymorphism)
		emp2.display();
		Manager man2 =new Developer();
		man2.display();
	}

}
class Employee
{
	 void display()
	{
		System.out.println("Employee class");
	}
}

class Manager extends Employee
{
	 void display()
	{
		System.out.println("Manager class");
	}
}

class Developer extends Manager
{
	void display()
	{
		System.out.println("Developer class");
	}
}