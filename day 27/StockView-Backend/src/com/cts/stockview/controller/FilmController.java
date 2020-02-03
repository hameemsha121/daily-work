package com.cts.stockview.controller;

import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.cts.stockview.model.Actor;
import com.cts.stockview.model.Movie;

public class FilmController {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
//		Movie movie=new Movie();
//		movie.setName("ff9");
//		Actor actor1=new Actor();
//		actor1.setActorName("vin Diesel");
//		actor1.setMovie(movie);
//		Actor actor2=new Actor();
//		actor2.setActorName("Paul Walker");
//		actor2.setMovie(movie);
//		s.save(movie);
//		s.save(actor1);
//		s.save(actor2);
		Criteria criteria=s.createCriteria(Movie.class);
		criteria.add(Restrictions.eq("name", "FF9"));
	
		Movie mov=(Movie)criteria.uniqueResult();
		System.out.println(mov);
		
		Set<Actor> actors=mov.getActors();
		for(Actor actor:actors) {
			System.out.println(actor);
		}
	
		tx.commit();
		s.close();
	}
}
