package com.cts.day9.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraySort {

	public static void main(String[] args) {
		
		ArrayList<Integer> list= new ArrayList<Integer>(Arrays.asList(12,4,22,67,15,18,7));//can use elements as asList
		System.out.println(list);
		
		Collections.sort(list);//Collections is the class and collection is the interface
		System.out.println(list);//ascending order
		
		
	}

}
