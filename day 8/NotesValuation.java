/*
 * A cash dispenser can dispense currency notes of valuation 2000,500,200,100.
 *   It should be configured to dispense minimal number of currency notes.
 *   Write a program to help me on this.
 *   Assume amount will be given as multiple of 100.  
	Sample Input 4500 Sample Output 2000 2 500 1  
	Sample Input 3700 Sample Output 2000 1 500 3 200 1  
 */
package com.test;

import java.util.Scanner;

public class NotesValuation {

	public static void main(String[] args) {
		
		System.out.println("Enter the amount u want to dispense");
		Scanner sc=new Scanner(System.in);
		int amount=sc.nextInt();
		//int notesnumber=0;
		int notes[]= {2000,500,200,100};
		int rem=0;
		for(int i=0;i<4;i++)
		{
			rem=amount%notes[i];
			amount=amount/notes[i];
			if(amount!=0)
			{
			System.out.println(notes[i]+"\t"+amount);
			}
			amount=rem;
			
			
		}
		
		

	}

}

