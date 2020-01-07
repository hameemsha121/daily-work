/*
 Write a program in C to copy the elements of one array into another array.
Test Data : 
Input the number of elements to be stored in the array :3 
Input 3 elements in the array : 
element - 0 : 15 
element - 1 : 10 
element - 2 : 12 
Expected Output : 
The elements stored in the first array are : 
15 10 12 
The elements copied into the second array are : 
15 10 12 
*/

import java.util.*;
import java.io.*;

class array3{
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int arr[],size,sum,arr2[];
		System.out.println("Enter the size");
		size= sc.nextInt();
		arr=new int[size];
		arr2= new int[size];
		System.out.println("enter the numbers");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
			arr2[i]=arr[i];
		}
		System.out.println("The second array is");
		for(int i=0;i<size;i++)
			System.out.println(arr2[i]);
		
		
			
		

	}
}
