package com.cts.day8;

import java.util.Scanner;

interface course
{
	public int price();
}

class java implements course
{
	public int price(){
		 return 5000;
	}
}
class clang implements course
{
	public int price(){
		 return 3000;
	} 
}
class cplusplus implements course
{
	public int price(){
		 return 2000;
	} 
}
class python implements course
{
	public int price(){
		 return 10000;
	} 
}
class angular implements course
{
	public int price(){
		 return 20000;
	} 
}

public class CoursesInterface {

	public static void main(String[] args)
	{
			System.out.println("what course do you want");
			System.out.println("1.java       5000 rs");
			System.out.println("2.C          3000 rs");
			System.out.println("3.C++        2000 rs");
			System.out.println("4.python    10000 rs");
			System.out.println("5.Angular   20000 rs");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number of courses do you want");
			int num=Integer.parseInt(sc.nextLine());
			int total=0;
			for(int i=0;i<num;i++)
			
			{
			System.out.println("Enter the course");	
			
			int ch=Integer.parseInt(sc.nextLine());
			
			switch(ch)
			{
			case 1 :java j=new java();
					System.out.println("java price is "+ j.price());
					total=total+j.price();
					break;
			case 2 :clang c=new clang();
					System.out.println("C price is "+c.price());
					total=total+c.price();
					break;
			case 3 :cplusplus a=new cplusplus();
					System.out.println("C price is "+a.price());
					total=total+a.price();
					break;
			case 4 :python py=new python();
					System.out.println("Python price is "+py.price());
					total=total+py.price();
					break;
			case 5 :angular an=new angular();
					System.out.println("angular price is "+an.price());
					total=total+an.price();
					break;
			}
			}
		System.out.println("Total price is "+total);
	}
	
}
