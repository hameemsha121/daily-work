package com.cts.day9;

public class InnerClass {

	public static void main(String[] args) {
		
		Outer.Inner inn=new Outer.Inner();
		inn.display();
	
	}

}

class Outer{
	int x=10;
	static int y=20;
	static class Inner{
		public void display() {
			//System.out.println(x); //we cant call x as its not static 
			System.out.println(y);
		}
	}
}
