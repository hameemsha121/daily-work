package com.cts.project.dao.impl;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.cts.project.bean.User;
import com.cts.project.bean.UserDTO;
import com.cts.project.dao.UserDAO;
import com.cts.project.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	
	@Autowired
	UserDAO userDao;
	
	@Autowired
	JavaMailSender jms;
	
	@Override
	public UserDTO insert(UserDTO ud) {
		User u=new User();
		
		try {
			MimeMessage mimeMessage=jms.createMimeMessage();
			MimeMessageHelper helper=new MimeMessageHelper(mimeMessage,"utf-8");
			helper.setFrom("hameem28061995@gmail.com");			
			helper.setTo(ud.getEmail());
			helper.setSubject("Activate");
			//sm.setText("This is testing mail");
			helper.setText("Account created click on <a href='http://localhost:4200/activate?"+u.getEmail()+"'>Click</a>",true);
			jms.send(mimeMessage);
			BeanUtils.copyProperties(ud, u);
			userDao.save(u);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		return ud;
	}

}
