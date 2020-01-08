/*
 * Write a program which takes input as a string and sort all the alphabets in string.
    Example :
    1) If user gives input "helloword" then output string should be "dehllloorw".
    2) If user gives input "PROGRAMR" then output string should be "AGMOPRRR".
 */


package cts.com.test;

import java.util.Scanner;

public class SortString {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Word");
		String word=sc.nextLine();
		int size=word.length(); 
		char arr[],temp=0;
		arr=new char[size];
		
		for(int i=0;i<size;i++)
		{
			arr[i]=word.charAt(i);
		}
		
		for(int i=0;i<size-1;i++)
			for(int j=i+1;j<size;j++)
			{
				if(arr[i]>arr[j])
				{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}
			}
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
