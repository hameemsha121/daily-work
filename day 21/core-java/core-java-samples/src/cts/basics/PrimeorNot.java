package cts.basics;

import java.util.Scanner;

public class PrimeorNot {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int a=sc.nextInt();
		boolean isPrime=true;
		for(int i=2;i<=a/2;i++)
		{
			if(a%i==0)
			{
				isPrime=false;
			}
		}	
		
		if(isPrime)
		{
			System.out.println("the number is prime");
		}
		else
		{
			System.out.println("not prime");
		}
		
		
		

	}

}
