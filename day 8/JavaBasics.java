/*
 * Consider the string str="Global Warming"
    Write statements in Java to implement the following
    a) To display the last four characters.
    b) To display the substring starting from index 4 and ending at index 8.
    c) To check whether string has alphanumeric characters or not.
    d) To trim the last four characters from the string.
    e) To trim the first four characters from the string.
    f) To display the starting index for the substring "Wa".
    g) To change the case of the given string.
    h) To check if the string is in title case.
    i) To replace all the occurrences of letter "a" in the string with "*"
 */
package com.cts.day8;

public class JavaBasics {

	public static void main(String[] args)
	{
	String str="Global Warming";
	int len=str.length();
	System.out.println(str.substring(len-4));//solution a
	System.out.println(str.substring(4,9));//solution b
	System.out.println(str.matches("[a-zA-Z0-9]+"));//solution c
	System.out.println(str.substring(0,(len-4)));//solution d
	System.out.println(str.substring(len-(len-4)));//solution e
	System.out.println(str.indexOf("Wa"));//solution f
	

	System.out.println(str.toLowerCase());//solution g
	System.out.println(str.toUpperCase());//solution g

	StringBuffer sb=new StringBuffer();
	for(int i=0;i<len;i++) {
		char letter=str.charAt(i);
		if(Character.isUpperCase(letter)) {
			sb.append(Character.toLowerCase(letter));
		}else if(!Character.isUpperCase(letter)) {				//solution g
			sb.append(Character.toUpperCase(letter));
		}else {
			sb.append(" ");
		}
	}
	System.out.println(sb);
	

	String first=str.substring(0,1);

	String[] data=str.split(" ");
	
	String remaining=data[0];
	//System.out.println(remaining);
	String a=remaining.substring(1,remaining.length());
	//System.out.println(a);
	
	if(first.matches("[A-Z]") && a.matches("[a-z0-9]+"))
	{
		System.out.println("Title case");//solution h
	}
	else
		System.out.println("not title case");
	
	
	char[] choice=new char[len];
	for(int i=0;i<len;i++)
	{
	choice[i]=str.charAt(i); 
	if(choice[i]=='a')
	{
		choice[i]='*';		
								//solution i
	}
	
	System.out.print(choice[i]);
	
	}
	
	
	
	
	
	
	}
	
	
}
