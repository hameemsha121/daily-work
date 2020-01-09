package com.cts.day8;

import java.util.Scanner;

public class CourseProblem {

	public static void main(String[] args)
	{
		System.out.println("what course do you want");
		System.out.println("1.java       5000 rs");
		System.out.println("2.C          3000 rs");
		System.out.println("3.C++        2000 rs");
		System.out.println("4.python    10000 rs");
		System.out.println("5.Angular   20000 rs");
		Scanner sc=new Scanner(System.in);
		String choice=sc.nextLine();
		StringBuffer sb=new StringBuffer();
		int price=0;
		if(choice.contains("java"))
		{
			sb.append("java       5000 rs\n");
			price=price+5000;
		}
		if(choice.contains("c"))
		{
			sb.append("C          3000 rs\n");
			price=price+3000;
		}
		if(choice.contains("c++"))
		{
			sb.append("C++        2000 rs\n");
			price=price+2000;
		}
		if(choice.contains("python"))
		{
			sb.append("python    10000 rs\n");
			price=price+10000;
		}
		if(choice.contains("angular"))
		{
			sb.append("Angular   20000 rs\n");
			price=price+20000;
		}
		
		System.out.println(sb);
		System.out.println("Total price :"+price);
	}
	
	
}
