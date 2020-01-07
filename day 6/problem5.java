/*
   Consider a scenario where all candidates have to take two tests before appearing for an
   interview. A candidate is selected for the interview round, based on the scores of the two
   tests. The individual score in each test should be greater than 75, and the average
   score for the two tests should be a minimum of 80. A call letter for the interview is to
   be sent to candidates who have been selected, and a rejection letter is to be sent to
   the rest.
*/

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