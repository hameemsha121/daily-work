package com.cts.training.lambda;

public class Lambdaexpressions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		Hello hello=new Hello()
//				{
//					@Override
//					public void display()
//					{
//						System.out.println("This is lambda");
//					}
//				};
//				hello.display();
	
//	Hello h=()->{
//		System.out.println("This is lambda");
//	};
//	h.display();

		Runnable r = ()->{
			System.out.println("I am runnable ");
		
		
		};
		Thread t=new Thread(r);
		t.start();
		
		Hello h=(a,b)->a+b;
		
			System.out.println(h.add(10, 20));

		Hello2 h2=(a,b)->a-b;
		System.out.println(h2.sub(10, 5));
			
		
		
	}

}


interface Hello
{
	public int add(int a,int b);
}

interface Hello2
{
	public int sub(int a,int b);
}
