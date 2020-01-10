package com.cts.day9.program4;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class SetDemo {

		public static void main(String[] args) {
			
			//HashSet<String> set=new Hashset<String>();//output not always in the same order
 			//LinkedHashSet<String> set = new LinkedHashSet<String>();
			//TreeSet<String> set=new TreeSet<String>(); //ascending according to ascii code
			PriorityQueue<String> set=new PriorityQueue<String>();
			set.add("bangalore");
			set.add("mumbai");
			set.add("chennai");				
			set.add("hyderabad");
			set.add("delhi");
			set.remove("bangalore");
			//set.removeAll(set);
			System.out.println(set);
			System.out.println(set.peek());
			System.out.println(set.poll());
			//System.out.println(set.element());
			
		}
	
}
