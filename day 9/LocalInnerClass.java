	package com.cts.day9.program;

//import com.cts.day9.Outer.Inner;

public class LocalInnerClass {

		public static void main(String[] args) {
			
			
			Outer out=new Outer();
			Outer.Inner in=out.new Inner();
			in.display();
		
		}

	}

	class Outer{
		int x=10;
		static int y=20;
		 class Inner{
			public void display() {
				//System.out.println(x); //we cant call x as its not static 
				System.out.println(y);
			}
		}
	}

