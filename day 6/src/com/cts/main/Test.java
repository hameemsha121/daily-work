package com.cts.main;
import com.cts.test.Calculator;

public class Test {
		
		public static void main(String[] args)
		{
		Calculator calculator= new Calculator();
		int sum=calculator.add(2,4);
		System.out.println("The sum is "+sum);
		}
}