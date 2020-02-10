package com.cts.training.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.training.dao.UserDAO;
import com.cts.training.dao.impl.UserDAOImpl;
import com.cts.training.model.User;

public class UserUnitTest {

	
	private static AnnotationConfigApplicationContext context;
	@Autowired
	private static UserDAO userDAO;
	private static User user;
	
	@BeforeClass
	public static void init()
	{
		context =new AnnotationConfigApplicationContext();
		context.scan("com.cts.training");
		context.refresh();
		user=(User)context.getBean("user");
		userDAO=(UserDAO) context.getBean("userDAO");
		
	}
	
	
	@Test
	public void testGetAllUsers() {
		List<User> users=userDAO.getAllUsers();
		assertEquals(1, users.size());
	}

}
