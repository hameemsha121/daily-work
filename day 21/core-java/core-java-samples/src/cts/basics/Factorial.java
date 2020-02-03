package cts.basics;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		
		int a=sc.nextInt();
		int result=fact(a);
		
		System.out.println(result);
		}

	private static int fact(int a) {
		if(a==0)
		return 1;
		return a*fact(a-1);
	}

}
