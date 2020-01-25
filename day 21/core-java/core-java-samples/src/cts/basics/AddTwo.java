package cts.basics;

import java.util.Scanner;

public class AddTwo {
	public static void main(String[] args) {
			
		System.out.println("Enter number 1: ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("enter number 2: ");
		int b=sc.nextInt();
		System.out.println("the sum is : "+(a+b));
		
	}

}
