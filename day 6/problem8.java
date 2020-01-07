import java.util.*;
import java.io.*;

class problem8{
	public static void main(String[] args)
	{
		System.out.println("Enter the age");
		Scanner sc= new Scanner(System.in);
		int age=sc.nextInt();
		if(age<5)
			System.out.println("Baby");
		if(age>=5 && age<=12)
			System.out.println("He/she is a child");
		if(age>=13 && age<=19)
			System.out.println("He/she is a Teenager");
		if(age>=20 && age<=35)
			System.out.println("He/she is an Young adult");
		if(age>=36 && age<=45)
			System.out.println("He/she is a mature adult");
		if(age>=46 && age<=55)
			System.out.println("He/she is an elder");
		if(age>=56)
			System.out.println("He/she is a senior citizen");
		
		
		
		
		
	}
}