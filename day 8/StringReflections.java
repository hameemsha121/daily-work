/*
 * Given a string say "abcdef" all the characters need to be replaced
 by their reflections . Like a is replaced with z , b with y etc. The
 input string is guaranteed to have all lowercase characters.
    Sample Input:
     abcd
     Output:
     zyxw
 */
package com.test;

import java.util.Scanner;

public class StringReflections {

	public static void main(String[] args) {
		
		System.out.println("Enter the string");
		Scanner sc=new Scanner(System.in);
		String a = sc.nextLine();
		int len=a.length();
		
		char[] data;
		int b;
		
		data= new char[len];
		for(int i=0;i<len;i++)
		{
			data[i]=a.charAt(i);
			//System.out.println(data[i]);
			if(Character.isLowerCase(data[i]))
			
				{
				int value='z'-a.charAt(i);
				System.out.print((char)('a'+ value));
				}
			else
			{
				int value='Z'-a.charAt(i);
				System.out.print((char)('A' + value));
			}


			
		}
		
		

	}

}
