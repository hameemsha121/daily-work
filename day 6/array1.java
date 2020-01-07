/* 1. Write a program in C to read n number of values in an array and display it in reverse order
Test Data : 
Input the number of elements to store in the array :3 
Input 3 number of elements in the array : 
element - 0 : 2 
element - 1 : 5 
element - 2 : 7
Expected Output : 
The values store into the array are : 
2 5 7 
The values store into the array in reverse are : 
7 5 2 */

import java.io.*;
import java.util.*;

class array1{
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int arr[],size;
		System.out.println("Enter the size");
		size= sc.nextInt();
		arr=new int[size];
		System.out.println("enter the numbers");
		
		for(int i=0;i<size;i++)
			arr[i]=sc.nextInt();
		System.out.println("The numbers in reverse order ");
		for(int i=size-1;i>=0;i--)
			System.out.println(arr[i]);
	}

}