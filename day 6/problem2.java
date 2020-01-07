/*Write a Program that accepts the length and breadth of a
   rectangle and displays its area and perimeter.*/

import java.io.*;
import java.util.*;

class problem2
{
	public static void main(String[] args)
	{
		System.out.println("enter the length and breadth\n");
		Scanner sc=new Scanner(System.in);
		int len=sc.nextInt();
		int bre=sc.nextInt();
		int area=len*bre;
		int peri=2*(len+bre);
		System.out.println("The area and peri is "+ area +" "+ peri);
	}

}

