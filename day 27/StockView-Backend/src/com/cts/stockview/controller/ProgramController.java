package com.cts.stockview.controller;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.cts.stockview.model.Developer;
import com.cts.stockview.model.Technology;

public class ProgramController {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction transaction = s.beginTransaction();
//
//		Developer developer1 = new Developer();
//		developer1.setName("Vishal");
//
//		Developer developer2 = new Developer();
//		developer2.setName("Yogesh");
//
//		Developer developer3 = new Developer();
//		developer3.setName("Virendra");
//
//		Technology technology1 = new Technology();
//		technology1.setLanguage("Java");
//
//		Technology technology2 = new Technology();
//		technology2.setLanguage("Bigdata");
//
//		Set<Technology> technologies = new HashSet<Technology>();
//		technologies.add(technology1);
//		technologies.add(technology2);
//
//		developer1.setTechnology(technologies);
//		developer2.setTechnology(technologies);
//		developer3.setTechnology(technologies);
//
//		s.save(developer1);
//		s.save(developer2);
//		s.save(developer3);
//		transaction.commit();
//		s.close();
		Criteria criteria = s.createCriteria(Developer.class);
		criteria.add(Restrictions.eq("id", 25L));
		Developer developer = (Developer) criteria.uniqueResult();
		System.out.println(developer);
		Set<Technology> tech = developer.getTechnology();
		for(Technology technology : tech){
		  System.out.println(technology);
		}
		transaction.commit();
		s.close();
		
		
	}

}
