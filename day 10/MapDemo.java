package com.cts.day10;


import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class MapDemo {

	public static void main(String[] args) {
		
		//Map<String,Integer> map=new HashMap<String,Integer>(); 
		LinkedHashMap<String, Integer> map =new LinkedHashMap<String,Integer>();// allows null in key value
		
		//Hashtable<String, Integer> map=new Hashtable<String,Integer>();//Hashtable doesnot allow null to be present in the key or value
		map.put("java", 8000);
		map.put("python", 10000);
		map.put("Angular", 1000);
		map.put("java", 2000);
		map.put(null, 100); 
		
		System.out.println(map);
		System.out.println(map.get("java"));
		System.out.println(map.containsKey("java"));
		System.out.println(map.containsValue(2000));
		System.out.println(map.replace("java", 2000, 3000));
		map.put("java", 20000);
		System.out.println(map);
		
		
		Set<Entry<String, Integer>> entries = map.entrySet(); //for getting key value pairs
		/*for(Map.Entry<String, Integer> entry : map.entrySet() )
		{
			System.out.println(entry.getKey()+"-------------"+entry.getValue());// get key and values
		}*/
		for(Entry<String,Integer> entry : entries)
		{
			System.out.println(entry.getKey()+"-------------"+entry.getValue());
		}
		
	}

}
