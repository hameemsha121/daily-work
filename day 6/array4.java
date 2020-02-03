/*
	Write a program in C to count a total number of duplicate elements in an array.
Test Data : 
Input the number of elements to be stored in the array :3 
Input 3 elements in the array : 
element - 0 : 5 
element - 1 : 1 
element -
Expected Output : 
Total number of duplicate elements found in the array is : 1 
*/


import java.util.*;
import java.io.*;

class array4{
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int arr[],size,sum,arr2[],count=0;
		System.out.println("Enter the size");
		size= sc.nextInt();
		arr=new int[size];
	
		System.out.println("enter the numbers");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		for(int i=0;i<size;i++)
		{

			for(int j=i+1;j<size;j++)
			{

				if(arr[j]==arr[j-1])
				count=1;
				if(arr[i]==arr[j])
				count++;
			}
		}
		
		System.out.println("The number of duplicate elements in array is: "+count);	
		
		}
		
		
}	
		