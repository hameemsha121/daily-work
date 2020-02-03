package cts.assignment1;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("you want to enter...if yes press any and if no press n ");
		String a=sc.nextLine();
		char b=a.charAt(0);
		int count=0;
		int[] d;	
		;
		while(b!='y'){
			d= new int[count];
			System.out.println("Enter the number");
			int c=Integer.parseInt(sc.nextLine());
			count++;
			d[count]=c;
			System.out.println(d);	
		
		}
		
		
		
		
	
		
		
		
		
		
		
		
		

	}

}
