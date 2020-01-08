package com.cts.Test;

public class Area {
	
	public static void main(String[] args)
	{
		Area2 a=new Area2();
		a.area(2, 2);
	}
}
class Area2{	
	
	public void area(double a)
	{
		System.out.println("The area of square is"+(a*a));
	}
	public void area(double a,double b)
	{
		System.out.println((a*b));
	}
	public void area(int a,float b)
	{
		System.out.println((a*b)/2);
	}
	public void area(int a)
	{
		System.out.println("The area of circle is"+(3.14*a*a);
	}

}

