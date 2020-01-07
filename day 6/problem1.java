import java.io.*;
import java.util.*;

class problem1
{
	public static void main(String[] args)
	{
		System.out.println("enter the number\n");
		Scanner sc= new Scanner(System.in);
		int num= sc.nextInt();
		if(num<0)
			System.out.println("The number is negative");
		else if(num>0)
			System.out.println("The number is positive");
		else
			System.out.println("zero");
	}
}