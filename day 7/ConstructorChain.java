package com.cts.constructors;

public class ConstructorChain {

	public static void main(String[] args)
	{
		A a=new A();
		//A a2=new A(10);
		//B b=new B();
	}
}

class A 
{
	public A()
	{
		super();
		System.out.println("1");
	}
	public A(int a)
	{
		this();
		System.out.println("2");
	}
	{
		System.out.println("3");
	}
}

class B extends A
{
	public B()
	{
		super(10);
		System.out.println("4");
		
	}
	{
		System.out.println("5");
	}
}