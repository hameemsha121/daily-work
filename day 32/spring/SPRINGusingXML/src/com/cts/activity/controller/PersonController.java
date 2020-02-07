package com.cts.activity.controller;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.cts.activity.model.Person;

public class PersonController {

		public static void main(String[] args) {
			
			ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
			Person person=(Person)context.getBean("person");
			System.out.println("----------access list----------");
			List<String> list=person.getList();
			System.out.println(list.get(0));
			System.out.println(list.get(1));
			//access set
			System.out.println("-----------Access set-------------");
			Set<String> set=person.getSet();
			Iterator<String>itr=set.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
			//access map
			System.out.println("------Access map-------");
			Map<Integer, String> map=person.getMap();
			System.out.println(map.get(0));
			System.out.println(map.get(1));
			//access properties
			System.out.println("--------------------Access properies------------");
			Properties prop=person.getProperties();
			System.out.println(prop.getProperty("propKeyA"));
			System.out.println(prop.getProperty("propKeyB"));
			//Access book list
			System.out.println("--------Access address List-------");
			System.out.println(person.getAddressList().get(0).getHouseNo());
			System.out.println(person.getAddressList().get(1).getState());
		}
}

