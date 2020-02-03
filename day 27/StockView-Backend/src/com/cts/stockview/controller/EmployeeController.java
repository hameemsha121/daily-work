package com.cts.stockview.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.cts.stockview.model.ContractualEmployee;
import com.cts.stockview.model.Employee;
import com.cts.stockview.model.PermanentEmployee;

public class EmployeeController {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		Employee emp=new Employee();
		emp.setName("hameem");
		PermanentEmployee pe=new PermanentEmployee();
		pe.setSalary(345678);
		pe.setBonus(21312F);
//		Set<String> emails=new HashSet<>();
//		emails.add("hameem @gmail.com");
//		emails.add("pichi @cts.com");
//		emp.setEmails(emails);;
		ContractualEmployee ce =new ContractualEmployee();
		ce.setPayPerHour(2000);
		ce.setContractperiod(12);
		s.save(emp);
		s.save(pe);
		s.save(ce);
		tx.commit();
		s.close();
		
	}

}
