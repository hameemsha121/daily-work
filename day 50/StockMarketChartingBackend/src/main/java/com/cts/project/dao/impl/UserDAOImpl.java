package com.cts.project.dao.impl;

import java.util.List;
import java.util.Optional;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.project.bean.User;
import com.cts.project.bean.UserDTO;
import com.cts.project.dao.UserDAO;
import com.cts.project.service.UserService;

@CrossOrigin(origins = "*")
@RestController
public class UserDAOImpl {

	@Autowired
	UserDAO userDao;
	
	@Autowired
	UserService us;
	
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
	public ResponseEntity<UserDTO> save(@RequestBody UserDTO user){
		us.insert(user);
		return new ResponseEntity<UserDTO>(user,HttpStatus.CREATED);
	}
	
	
	
	
//	@PostMapping("/user")
//	public User saveUser(@RequestBody User user) {
//		User newUser = userDao.save(user);
//			try {
//				MimeMessage mimeMessage=jms.createMimeMessage();
//				MimeMessageHelper helper=new MimeMessageHelper(mimeMessage,"utf-8");
//				
//				helper.setFrom("hameem28061995@gmail.com");
//				helper.setTo(newUser.getEmail());
//				helper.setSubject("Activate");
//				//sm.setText("This is testing mail");
//				helper.setText("Account created click on <a href='http://localhost:4200/activate?"+newUser.getEmail()+"'>Click</a>",true);
//				jms.send(mimeMessage);
//			
//			}
//			catch(Exception e) {
//				e.printStackTrace();
//			}
//			newUser.setRegStatus("ok");
//			return newUser;
//	}
//	
	@PutMapping(value="/useractivate")
	public String activateUser(@RequestBody String e) {
		String temp = e.split(":")[1];
		String email=temp.split("\"")[1];
		User user = userDao.findByEmail(email);
		if(user.getActive().equals("no")) {
			user.setActive("yes");
			userDao.save(user);
			return "{\"result\":\"1\"}";
		}
		else
		return "{\"result\":\"0\"}";
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

