
package com.cts.Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cts.main.Calculator;

public class CalculatorTest {
		
	static Calculator calculator;
		
		@BeforeClass	
		public static void init()
		{
			calculator=new Calculator();
			System.out.println("calculator object created");
			
		}
		@AfterClass
		public static void destroy()
		{
			calculator=null;
			System.out.println("calculator object destroyed");
			
		}
		
		@Test
		public void testAddNumber()
		{
			assertEquals(5,calculator.add(2, 3));
		}
		@Test
		public void testSubNumber()
		{
			assertEquals(-1,calculator.sub(2, 3));
		}
		

	}

