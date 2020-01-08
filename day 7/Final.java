package com.cts.excercise;

public class Final {

	
	public static void main(String[] args) {
	
		 X x1=new X();
		 X x2=new X(20);
		 System.out.println(x1.PI);
		 System.out.println(x2.PI);
		 
	}

}

class X{
	public final double PI;
	public X()
	{
		PI=4.45;
	}
	public X(int a)
	{
		PI=5.5;
	}
}

/*
class X{
public static final double PI;

static
{
	PI=3.14;

}


*/