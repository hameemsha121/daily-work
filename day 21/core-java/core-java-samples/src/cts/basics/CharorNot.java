package cts.basics;

import java.util.Scanner;

public class CharorNot {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter character");
		String a=sc.nextLine();
		char b=a.charAt(0);
		
		if(b>='a' && b<='z' || b>='A' && b<='Z')
			{
				System.out.println("its an alphabet");
				
			}
		else
			System.out.println("not an alphabet");
			
		

	}

}
