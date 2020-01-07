import java.util.*;
import java.io.*;

class problem5
{
	public static void main(String[] args)
	{
		System.out.println("Enter the first and second test marks");
		Scanner sc= new Scanner(System.in);
		int mark1=sc.nextInt();
		int mark2=sc.nextInt();
		if(mark1>=75 && mark2>=75)
		{
			int average=(mark1+mark2)/2;
			if(average>=80)
				System.out.println("You passed");
			else
				System.out.println("average not met, so rejected");
		}
		else
			System.out.println("Marks not sufficient,so rejected");
	}
}