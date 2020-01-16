package com.cts.day12;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {

	public static void main(String[] args) {

		
		List<String> names=new ArrayList<String>();
		
		addNames(names);
		
		//names.forEach(System.out::println);
		
		List<String> lengthScale = names.stream().filter(s -> s.length() >= 5).collect(Collectors.toList());
		System.out.println("the names with length scale 5 are");
		
		List<String> capName =names.stream().map(name -> name.toUpperCase()).collect(Collectors.toList());
		lengthScale.forEach(System.out::println);
		
		capName.forEach(System.out::println);
	}

	private static void addNames(List<String> names) {
		
		names.add("abin");
		names.add("jjjj");
		names.add("aaaa");
		names.add("hhhhqhsndkjdn");
		names.add("kjwnk");
		
	}

}
