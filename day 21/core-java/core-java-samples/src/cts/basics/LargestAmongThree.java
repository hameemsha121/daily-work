package cts.basics;

import java.util.Scanner;

public class LargestAmongThree {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n1 ");
		int a=sc.nextInt();
		System.out.println("enter n2 ");
		int b=sc.nextInt();
		System.out.println("enter n3 ");
		int c=sc.nextInt();
		if(a>=b && a>=c) {System.out.println(a+" is larger");}
		else if(b>=a && b>=c) {System.out.println(b+" is larger");}
		else if(c>=a && c>=b) {System.out.println(c+" is larger");}

		
	}

}
