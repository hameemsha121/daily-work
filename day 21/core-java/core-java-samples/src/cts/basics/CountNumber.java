package cts.basics;

import java.util.Scanner;

public class CountNumber {

	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		int r=0,count=0;
		while(a>0)
		{
			
			r=a%10;
			a=a/10;
			count++;
			
		}
		
		System.out.println(count);
		

	}

}
