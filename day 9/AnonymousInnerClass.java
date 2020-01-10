package com.cts.day9.program3;
import java.util.*;
import java.util.Scanner;

public class AnonymousInnerClass {

	public static void main(String[] args) {
		Test t=new Test()
		{
			
			public void display()
			{
				System.out.println("good morning");
			}
			
		};
		t.display();
	
	}

}

/*abstract class Test
{
	abstract public void display();
	/*{
		System.out.println("Hello");
	}*/
 
interface Test
{
	void display();
}
