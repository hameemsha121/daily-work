/*
 * Given a number we need to find the number of times its digits need
 to be added so it becomes a single digit number .
    Example 91=9+1=10
    10=1+0=1
    So two times.
    Sample Input
    91
    output
    2
 */

package com.test;

import java.util.Scanner;

public class AddToOneDigit {

	public static void main(String[] args) {
	
		System.out.println("Enter the number :");
		Scanner sc=new Scanner(System.in);
		int num = sc.nextInt();
		int r=0,sum=0;
		while(num>0 || sum>=10)
		{
			 if (num==0) { 
	                num=sum; 
	                sum=0; 
	                } 
			
			r=num%10;
			sum=sum+r;
			num=num/10;
			
		
		}
	System.out.println(sum);


		
		
	}
}

