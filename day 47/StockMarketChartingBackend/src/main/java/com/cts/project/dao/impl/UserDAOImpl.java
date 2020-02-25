package com.cts.project.dao.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.project.bean.User;
import com.cts.project.dao.UserDAO;

@CrossOrigin(origins = "http://localhost:4000")
@RestController
public class UserDAOImpl {

	@Autowired
	UserDAO userDao;
	
	@Autowired
	JavaMailSender jms;

	@GetMapping("/user")
	public List<User> getUsers() {
		return userDao.findAll();
	}

	@GetMapping("/user/{id}")
	public User getUserById(@PathVariable int id) {

		Optional<User> userList = userDao.findById(id);
		User user = userList.get();
		return user;

	}
 
	@PostMapping("/user")
	public User saveUser(@RequestBody User user) {
		User newUser = userDao.save(user);
			try {
				SimpleMailMessage sm = new SimpleMailMessage();
				sm.setFrom("hameem28061995@gmail.com");
				sm.setTo(newUser.getEmail());
				sm.setSubject("Testing Mail");
				sm.setText("This is testing mail");
				sm.setText("Account created click on <a href ='http://localhost:4200/activate?"+newUser.getEmail()+"'>Click</a>");
				jms.send(sm);
			
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			return newUser;
	}

	@DeleteMapping("/user/{id}")
	public void deleteUser(@PathVariable int id) {

		userDao.deleteById(id);
	}

	@PutMapping("/user")
	public User updateUser(@RequestBody User user) {
		User updateuser = userDao.save(user);
		return updateuser;
	}

}

