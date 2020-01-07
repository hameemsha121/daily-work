/*
Write a program in C to find the second largest element in an array.
Test Data : 
Input the size of array : 5 
Input 5 elements in the array : 
element - 0 : 2 
element - 1 : 9 
element - 2 : 1 
element - 3 : 4 
element - 4 : 6 
Expected Output : 
The Second largest element in the array is : 6 
*/


import java.util.*;
import java.io.*;

public class array8 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int arr[],size,second=0,max=0;
		System.out.println("Enter the size");
		size=sc.nextInt();
		arr=new int[size];
		System.out.println("Enter the elements:");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		//second=arr[0];
		max=arr[0];
		for(int i=0;i<size;i++) {
			if(arr[i]>=max)
			{
				max=arr[i];
			}
		}
		for (int i=0;i<size;i++)
		{
			if(arr[i]<max && arr[i]>=second)
				second=arr[i];
		}
		
		System.out.println("The second largest :"+second);
		
	}
}
