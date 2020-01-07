/*

You have to write a Program that accepts the product name and quantity as input
   and displays the total price using the unit prices already stored in the system.

*/

import java.io.*;
import java.util.*;

class problem3{
	public static void main(String[] args)
	{
		System.out.println("The available products are 1)milk and 2)curd What do u want 1or2?");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("How many litres do u want?");
		int qua=sc.nextInt();
		if(num==1)
		{
			int price=qua*22;
			System.out.println("The amount is "+price);
		}
		if(num==2)
		{
			int price=qua*35;
			System.out.println("the amount is "+price);
		}
		
	}
	
}