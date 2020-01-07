/*
	Write a program in C to find the maximum and minimum element in an array. 
Test Data : 
Input the number of elements to be stored in the array :3 
Input 3 elements in the array : 
element - 0 : 45 
element - 1 : 25 
element - 2 : 21 
Expected Output : 
Maximum element is : 45 
Minimum element is : 21 
*/



import java.util.*;
import java.io.*;

public class array5 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int arr[],size,min=0,max=0;
		System.out.println("Enter the size");
		size=sc.nextInt();
		arr=new int[size];
		System.out.println("Enter the elements:");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		min=arr[0];
		max=arr[0];
		for(int i=0;i<size;i++) {
			if(arr[i]>=max)
			{
				max=arr[i];
			}
			if(arr[i]<=min) {
				min=arr[i];
			}
		}
		System.out.println("The maximum :"+max);
		System.out.println("The minimum:"+min);
	}
}

