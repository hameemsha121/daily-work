/*
Write a Program to accept hours and number of resources and display the total
   number of productive hours. (Total number of productive hours = hours * number of
   resources).

*/


import java.io.*;
import java.util.*;
class problem6
{
	public static void main(String[] args)
	{
		System.out.println("Enter hours");
		Scanner sc=new Scanner(System.in);
		int hr=sc.nextInt();
		System.out.println("enter the number of resources");
		int re=sc.nextInt();
		int pro=hr*re;
		System.out.println("The number of productive hours = "+pro);
	}
}
