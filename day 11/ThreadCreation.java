package com.cts.training.thread;

public class ThreadCreation {

	public static void main(String[] args) {
		
		
		System.out.println("Main Thread");//By main method--only 1 thread
		
		FirstThread fi=new FirstThread();
		fi.start();//it will automatically call run()
		SecondThread s2=new SecondThread();
		s2.start();
		/*for(int i=1;i<=10;i++)
		{
			
			System.out.println("main thread"+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/
		
		

	}

}
class FirstThread extends Thread
{
	@Override
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			if(i%2!=0)
			{
			System.out.println("First Thread--"+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	
}
}
class SecondThread extends Thread
{
	@Override
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
			{
			System.out.println("Second Thread--"+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}
	}
	
	
	
}