package com.cts.excercise;

public class Trial {
	
	public static void main(String[] args)
	{
		String name="chennai";
		String address="thoraipakkam";
		String name1="chennai";
		String name2=new String("chennai");
		String address1=new String("thoraipakkam");
		String name3=new String("chennai");
		
		
		System.out.println(name.equals(name3));
		System.out.println(name==name3);
		
	}

}
