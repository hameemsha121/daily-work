package com.cts.day9;

public class ExceptionDemo {
	public static boolean isValidUser(String name)throws InvalidUser
	{
		if(!name.equals("admin"))
		{
		throw new InvalidUser("You are Invalid");
		}
	return true;
	}
	
	/*public static void division(String arg) throws ArithmeticException{
		
		
		
			System.out.println("Begin");
			int a=Integer.parseInt(arg);
			System.out.println("Got value");
			if(a==10)
			{
				throw new ArithmeticException();
			}
			int b=10/(10-a);
			System.out.println(+b);
			String name="Hrithik";
			System.out.println("Height"+name.length());
			System.out.println("stop");
	 }*/
		 public static void main(String[] args) {
		try {
		//	division(args[0]);
			if(isValidUser("admin"));
			{
				System.out.println("you are valid user");
			}
		}
		catch(InvalidUser ex)
		{
			System.out.println(ex.getMessage());
		}
		 }
		 
	 }

class InvalidUser extends Exception
{
	InvalidUser() {
		
	}
	InvalidUser(String message)
	{
		//System.out.println(message);
	}
	public String getMessage()
	{
		return "Invalid user";
	}




	
}