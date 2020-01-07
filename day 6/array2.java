/*2. Write a program in C to find the sum of all elements of the array.
Test Data : 
Input the number of elements to be stored in the array :3 
Input 3 elements in the array : 
element - 0 : 2 
element - 1 : 5 
element - 2 : 8 
Expected Output : 
Sum of all elements stored in the array is : 15 
//8

*/

import java.util.*;
import java.io.*;

class array2{
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int arr[],size,sum=0;
		System.out.println("Enter the size");
		size= sc.nextInt();
		arr=new int[size];
		System.out.println("enter the numbers");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}
		System.out.println("the sum of elements in array is "+sum);

	}
}