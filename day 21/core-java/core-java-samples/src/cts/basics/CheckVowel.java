package cts.basics;

import java.util.Scanner;

public class CheckVowel {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character");
		String a=sc.nextLine();
		
		if(a.charAt(0) =='a'||a.charAt(0)=='e'||a.charAt(0)== 'i'||a.charAt(0)== 'o'||a.charAt(0)=='u'||a.charAt(0)=='A'||a.charAt(0)=='E'||a.charAt(0)=='I'||a.charAt(0)=='O'||a.charAt(0)=='U')
		{
			System.out.println("vowel");
		}
		else
			System.out.println("consonant");

	}

}