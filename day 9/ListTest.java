package com.cts.day9.program3;


import java.util.*;
import java.util.Deque;

class ListTest
{
public static void main(String ... args)
{
 LinkedList list=new LinkedList();
 list.add("Start");
 list.add(200);
 list.add(30.25);
 list.add(20.20f);
 list.add(true);
 list.add("Start");
 list.add("End");
 System.out.println(list.get(2));
 System.out.println(list.contains(true));
 System.out.println(list);
 list.remove(true);	
 list.add(2,"Inserted");
 list.addFirst("Hello");
 list.addLast("java");

 
ListIterator lit=list.listIterator();
while(lit.hasNext())
{
	System.out.println(lit.next());
	
}
System.out.println("---------Now In backward---------");
while(lit.hasPrevious())
{
	System.out.println(lit.previous());
	
}
System.out.println("first element :"+list.getFirst());

}
}