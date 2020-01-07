/*
Write a program in C to separate odd and even integers in separate arrays.
Test Data : 
Input the number of elements to be stored in the array :5 
Input 5 elements in the array : 
element - 0 : 25 
element - 1 : 47 
element - 2 : 42 
element - 3 : 56 
element - 4 : 32 
Expected Output : 
The Even elements are : 
42 56 32 
The Odd elements are : 
25 47
*/

import java.io.*;
import java.util.*;

class array6{
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int arr[],size,arr1,arr2;
		System.out.println("Enter the size");
		size= sc.nextInt();
		arr=new int[size];
		
		//arr1=new int[size];
		//arr2=new int[size];
		System.out.println("enter the numbers");
		
		for(int i=0;i<size;i++)
		{	
		arr[i]=sc.nextInt();
			
		}
		System.out.println("The even numbers are");
		for(int i=0;i<size;i++)
			if(arr[i]%2==0)
		{
			arr1=arr[i];
			System.out.println(arr1);
		}
		System.out.println("The odd numbers are");
		for(int i=0;i<size;i++)
			if(arr[i]%2!=0)
		{
			arr2=arr[i];
			System.out.println(arr2);
		}
		
		
		/*;
		for(int i=0;i<size;i++)
				System.out.println(arr1[i]);
		;
		for(int i=0;i<size;i++)
				System.out.println(arr2[i]);
		
		*/
		
	}

}