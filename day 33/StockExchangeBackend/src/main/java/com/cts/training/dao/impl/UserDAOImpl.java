package com.cts.training.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cts.training.dao.UserDAO;

import com.cts.training.model.User;

@Transactional
@Repository(value="userDAO")
public class UserDAOImpl implements UserDAO {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public boolean saveUser(User user) {
		try {
			sessionFactory.getCurrentSession().save(user);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean updateUser(User user) {
		try {
			sessionFactory.getCurrentSession().update(user);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	
		
	}

	@Override
	public boolean daleteUser(User user) {
		try {
			sessionFactory.getCurrentSession().delete(user);
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
		return false;
	}

	@Override
	public User getUserById(int id) {
		try {
			return sessionFactory.getCurrentSession().get(User.class, id);
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}
	@Override
	public List<User> getAllUsers() {
		try {
			return sessionFactory.getCurrentSession().createQuery("FROM User").list();
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@Override
	public boolean validateUser(String username, String password) {
		try {
			Query query = sessionFactory.getCurrentSession()
					.createQuery("from User where username= :username and password= :password");
			query.setString("username", username);
			query.setString("password", password);
			List<User> users = query.list();
			if (users.size() > 0) {
				return true;
			} else {
				return false;
			}
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}



}
