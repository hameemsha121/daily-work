package com.cts.constructors;

public class ConstructorDemo {

	public static void main(String[] args) {
		
		Human human=new Human();
		Human human2=new Human(2,3);
		human2.display();
	}
	
	
}
class Human{
	
	int a,b;
	//int x,y;
	public Human() {
		System.out.println("I am called automatically");
	}
	public Human(int x,int y)
	
	{
		a=x;
		b=y;
		//this.x=x;
		//this.y=y;
		System.out.println("Parameterized constructor");
	}
	
	public void display()
	{
		System.out.println("a= "+a +" b= "+b);
	}
}



