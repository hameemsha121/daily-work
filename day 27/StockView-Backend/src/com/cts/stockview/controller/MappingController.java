package com.cts.stockview.controller;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.cts.stockview.model.PassportDetails;
import com.cts.stockview.model.Person;

public class MappingController {

	public static void main(String[] args) {
		
			Configuration cfg=new Configuration();
			cfg.configure();
			SessionFactory sf=cfg.buildSessionFactory();
			Session s=sf.openSession();
			Transaction tx=s.beginTransaction();
//			Person person=new Person();
//			person.setName("hameemsha");
//			
//			PassportDetails pDetails=new PassportDetails();
//			pDetails.setPassportNumber("56789098765467");
//			pDetails.setPerson(person);
//			person.setPassport(pDetails);
//			
//			s.save(person);
			
			Criteria criteria = s.createCriteria(Person.class);
//			Person p=(Person)criteria.uniqueResult();
//			System.out.println(p.getName());
			List<Person> persons =criteria.add(Restrictions.eq("name","hameemsha")).list();//out all the lists with name hameemsha
			for(Person p:persons)
			{
				System.out.println(p.getPassport().getPassportNumber());
			}
			tx.commit();
			s.close();
			
	}

}
