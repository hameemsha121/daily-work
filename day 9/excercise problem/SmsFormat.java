/*
 * SMS Language
SMS language or textese (also known as txt-speak, txtese, chat speak, txt, txtspk, txtk, txto, textinglanguage, txt lingo, SMSish, txtslang,or txt talk) is a term for the abbreviations and slang commonly used with mobile phone text messaging.
Some of the abbreviations used are
•	s for yes
•	u for you
•	2day for today
•	y for why
Many grandpa's have started sending SMSes to their grand children. But they are not familiar withthe SMS lingo.
Can you help them by writing a program that would convert a given text in proper English to SMSlingo? Consider only the 4 words listed above.
Input Format:
Input consists of a single string. Assume that the maximum length of the string is 200 and all letters are in lower-case.
Output Format:
Output consists of a single string.
Sample Input 1:
where were you yesterday?
Sample Output 1:
where were u sterday?
Sample Input 2:
why is today a working day for you?
Sample Output 2:
y is 2day a working day for u?
 */

package day9;

import java.util.Scanner;

public class SmsFormat {
	
	
	

	public static void main(String[] args) {
		
			System.out.println("Enter the sentence ");
			Scanner sc =new Scanner(System.in);
			String sentence=sc.nextLine();
			StringBuffer sb=new StringBuffer(sentence);
			System.out.println(sb);
			//char[] a;
			//a=new char[sentence.length()];
			//String []words = {"yes","you","today","why"};
			
			int pos=0;
			for(int i=0;i<sb.length();i++)
			{
				
				if(sb.toString().contains("yes"))
				{
					pos=sentence.indexOf("yes");
					sb.replace (pos,pos+3,"s");
					
				}
				if(sb.toString().contains("you"))
				{
					pos=sentence.indexOf("you");
					sb.replace (pos,pos+3,"u");
					
				}
				if(sb.toString().contains("today"))
				{
					pos=sentence.indexOf("today");
					sb.replace (pos,pos+5,"2day");
					
				}
				if(sb.toString().contains("why"))
				{
					pos=sentence.indexOf("why");
					sb.replace (pos,pos+3,"y");
					
				}
				
				
				
			}
			System.out.println(sb);
			
			
			
			
			
			

	}

}
