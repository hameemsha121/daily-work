package com.cts.day9.list;
import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo {


	public static void main(String[] args) {
		ArrayList<Employee> list=new ArrayList<>();
		Employee emp1 =new Employee(211, "abin", "Hyd", 22, 111568, 678809999.00);
		Employee emp2 =new Employee(212, "hasdk", "ker", 21, 2436578, 6782299.00);
		Employee emp3 =new Employee(213, "ahsdk", "and", 23, 122668, 678822999.00);
		Employee emp4 =new Employee(214, "sakjhdk", "mys", 24, 561678, 678119999.00);
		
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		
		System.out.println(list);//internally represents toString method of the class,we get only the address
		System.out.println();
		
		//To sort user defined object we can use the below two interfaces
		//1.comparable
		//		-->it is inside java.lang package
		//		-->it has only method public int compareTo(Object obj), so we need to override the method on the class where
		//		-->we are implementing
		//		-->It returns +ve ,-ve and zero values
		//		-->It compares the object to itself
		//		-->We need to implement this interface on the class which need to be sorted
		//		-->It sort the object on a single property only
				
		//2.comparator
		
		//			-->inside java.lang package
		//			-->two methods in it public int compare(Object obj1,Object 2)
		//			-->and equals()
		//			-->sort the objects based on multiple data members
		//			-->it compares the two objects
		//			-->To implement the interface,create separate classes and implement the interface
		//			and override the compare.so for every property we need to create separate claa
		
		
		SortById sbi=new SortById();
		SortByName sbn=new SortByName();
		Collections.sort(list,sbn);
		
		for(Employee employee : list)
		{
			System.out.println(employee);
		}
		
		
	}

}
