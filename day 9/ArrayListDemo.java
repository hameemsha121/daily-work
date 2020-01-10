package com.cts.day9.list;
import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {


	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();//default size is 10
		list.add(1000);
		list.add(2020);
		list.add(13200);
		list.add(1200);
		list.add(1,111);
		list.remove(111);
		
		//System.out.println(list);//order is preserved
		//System.out.println(list.size());
		ArrayList<Integer> names=new ArrayList<>();
		names.add(100);
		names.add(200);
		names.add(300);
		list.addAll(names);
		//System.out.println(list.contains("hameem"));
		//System.out.println(list);
		
		
		
		//for traversing two methods 1.Iterator interface 2. Enhanced for loop (java 6--)
		//1.Inside java.util package....used to traverse elements in forward direction only
		
		Iterator<Integer> itr=list.iterator();//method one
		
		while(itr.hasNext())
		{
			Object obj=itr.next();
			System.out.println(obj);
		}
		
		for(Object obj:list)// method 2
		{
			System.out.println(obj);
		}
		
		ListIterator<Integer> lit=list.listIterator();//method three
		System.out.println("forward direction");
		while(lit.hasNext())
		{
			System.out.println(lit.next());
			if(lit.next()==100)
			{
				break;
			}
		}
		
		System.out.println("backward direction");
		while(lit.hasPrevious())
		{
			System.out.println(lit.next());
			if(lit.next()==100)
			{
				break;
			}
		}
		
		
	}

}
