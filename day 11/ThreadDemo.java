package com.cts.training.thread;

public class ThreadDemo {

	//Daemon thread
	public static void main(String[] args) {

		
		
		Thread thread = Thread.currentThread();
		System.out.println(thread);
		System.out.println(thread.getName());
		thread.setName("CTS thread");
		System.out.println(thread.getName());
		System.out.println(thread.isDaemon());
		System.out.println(thread.isAlive());
		System.out.println(thread.getState());
		System.out.println(thread.getId());
		System.out.println(thread.getPriority());
		
		
		
	}

}
