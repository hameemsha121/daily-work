package cts.basics;

import java.util.Scanner;

public class CheckPrimeInInterval {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first limit");
		int a=sc.nextInt();
		System.out.println("Enter the second limit");
		int b=sc.nextInt();
		
		while(a<b)
		{
			boolean isprime=true;
		for(int i=2;i<=a/2;i++)
		{
			if(a%i==0) {
				isprime=false;
				}
		
		}
		if(isprime==true)
		{
		System.out.println(a);
		}
		
		++a;
		
		}
		

	}

}
