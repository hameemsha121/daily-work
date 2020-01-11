/*
 * There are 3 labs in the CSE department(L1, L2 and L3) with different seating capacities.
 *  A single lab needs to be allocated to a class of 'n' students. The labs need to be utilized
 *   to the maximum i.e the number of systems that are not being used should be minimal. 
 *   Which lab needs to be allocated to this class? 
	
	The input consists of four numbers separated by comma where first three are seating 
	capacity of Labs L1,L2 and L3 and fourth input is number of trainees.  
	If more than one lab satisfies the condition, print all the labs. If none of the
 	lab satisfies the condition, print "No labs" 
Sample Input1 
30,40,20,25  
Sample Output1 
Lab - L1  
Sample Input2 
30,30,30,25  
Sample Output2 
Lab - L1,L2,L3  
Sample Input3 
40,30,40,55  
Sample Output3 
No labs  
 */



package day9;

import java.util.Scanner;

public class LabProblem {


	public static void main(String[] args) {
		
		System.out.println("Enter the lab capacity for L1,L2,L3 and number of trainees separated by commas");
		Scanner sc= new Scanner(System.in);
		String numbers=sc.nextLine();
		String[] data=numbers.split(",");
		int l1=Integer.parseInt(data[0]);
		int l2=Integer.parseInt(data[1]);
		int l3=Integer.parseInt(data[2]);
		int tr=Integer.parseInt(data[3]);
		
		int a=l1-tr;
		int b=l2-tr;
		int c=l3-tr;
		int m=0;
		
		
		if(l1==l2 && l2==l3 && l1>tr)
			System.out.println("labs L1 L2 L3");
		
		else if(l1>tr && l2>tr && l3<tr)
		{
			if(a>b)
			{
				if((a-b)>0)
				{
					System.out.println("Labs L1 L2");
				}
				else
				{
					System.out.println("Labs L2");
				}
			}
			else
			{
				System.out.println("Labs L1");
			}
		}
		else if(l1>tr && l3>tr && l2<tr)
		{
			if(a>c)
			{
				if((a-c)>0)
				{
					System.out.println("Labs L1 L3");
				}
				else
				{
					System.out.println("Labs L3");
				}
			}
			else
			{
				System.out.println("Labs L1");
			}
		}
		else if(l2>tr && l3>tr && l3<tr)
		{
			if(b>c)
			{
				if((b-c)>0)
				{
					System.out.println("Labs L2 L3");
				}
				else
				{
					System.out.println("Labs L3");
				}
			}
			else
			{
				System.out.println("Labs L2");
			}
		}
		
		
		
		
		
		else if(l1>tr && l2<tr && l3<tr)
			System.out.println("Labs L1");
		else if(l2>tr && l1<tr && l3<tr)
			System.out.println("Labs L2");
		else if(l3>tr && l1<tr && l2<tr)
			System.out.println("Labs L3");
		
		
		
		else
		{
			System.out.println("No labs");
		}
		
		
		
		
		
	}

}
