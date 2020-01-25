package cts.basics;

import java.util.Scanner;

public class LeapYear { 
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year");
		int a=sc.nextInt();
		boolean leap;
		if(a%4==0)
		{
			if(a%100==0) {
				if(a%400==0)
					
					leap=true;
				else
					leap=false;
			}
			else
				leap=true;
				
		}
		else
			leap=false;
		

		if(leap)
			System.out.println("leap year");
		else
			System.out.println("not a leap year");
	
}

}
