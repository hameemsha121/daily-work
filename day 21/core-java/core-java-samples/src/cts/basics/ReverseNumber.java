package cts.basics;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		int r=0,rev=0;
		
		while(a>0)
		{
			
			r=a%10;
			rev=rev*10+r;
			a=a/10;

		
			
		}
		System.out.println(rev);
		
		
		
	}

}
