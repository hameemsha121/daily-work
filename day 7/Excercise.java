/*
 * Write a program which accepts two integers as a minimum and maximum limit and 
 * calculates total of how many 1s were their within the limit.
    For ex:
    1) if user input 1 11 then it should print 4.
    2) if user input 11 111 then it should print 34.
 */

package com.cts.excercise;

import java.util.*;

public class Excercise {

	public static void main(String[] args) {
		
		int count=0,r=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the minimum limit ");
		int min=sc.nextInt();
		System.out.println("Enter the maximum limit ");
		int max=sc.nextInt();
		for(int i=min;i<=max;i++)
		{
			int n=i;
			while(n!=0)
			{
				r=n%10;
				if(r==1)
				{
					count++;
				}
				n=n/10;
			}	
				
		}
		
		System.out.println(count);
}
		

	}


