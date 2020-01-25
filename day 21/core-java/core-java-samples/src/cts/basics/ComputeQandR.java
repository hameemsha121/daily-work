package cts.basics;

import java.util.Scanner;

public class ComputeQandR {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		System.out.println("Enter the divisor");
		int b=sc.nextInt();
		
		System.out.println("the quotient is "+ a/b);
		System.out.println("the remainder is " +a%b);
	}

}
