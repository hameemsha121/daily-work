package com.cts.excercise;

public class StringMethods {
	
	public static void main(String[] args)
	{
		String date="Thursday 9 january 2020";
		String []dates=date.split("\\d");
		
		for(int i=0;i<dates.length;i++)
		{
			System.out.println(dates[i]);
		}
		
		String n="    hai i am ";
		String a =n.trim();
		System.out.println(a);
	}

}
