package cts.basics;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		int r=0,rev=0;
		int b=a;
		while(a>0)
		{
			
			r=a%10;
			rev=rev*10+r;
			a=a/10;

		
			
		}
		
		if (rev==b) {
			System.out.println("palindrome");
		}
		else
			System.out.println("not palindrome");

	}

}
