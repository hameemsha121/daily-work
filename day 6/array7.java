/*
Write a program in C to sort elements of array in ascending order.
Test Data : 
Input the size of array : 5 
Input 5 elements in the array : 
element - 0 : 2 
element - 1 : 7 
element - 2 : 4 
element - 3 : 5 
element - 4 : 9 
Expected Output : 
Elements of array in sorted ascending order: 
2 4 5 7 9


*/

import java.io.*;
import java.util.*;

class array7{
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int arr[],size,temp=0;
		System.out.println("Enter the size");
		size= sc.nextInt();
		arr=new int[size];
		System.out.println("enter the numbers");
		
		for(int i=0;i<size;i++)
			arr[i]=sc.nextInt();
		
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
		}
		System.out.println("the array is");
			for(int i=0;i<size;i++)
				System.out.println(arr[i]);
				
			
		
		
	}

}