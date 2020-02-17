package com.cts.training.controller;

import java.nio.file.AccessDeniedException;
import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	


	@RequestMapping("/")
	public String indexPage(Model model) {
		
		model.addAttribute("name","Home Page");
		model.addAttribute("description", "unsecured page!");
		return "index";
	}

	@RequestMapping("/admin")
	public String adminPage(Model model,Principal principal) {
		String loggedInUserName=principal.getName();
		model.addAttribute("user", loggedInUserName);
		model.addAttribute("name", "Spring security");
		model.addAttribute("description", "page is protected");
		return "admin";
	}
	
	
	@RequestMapping(value="/login",method = RequestMethod.GET)
	public String login(ModelMap model) {
		return "login";
	}
	
	@RequestMapping(value = "/logout",method = RequestMethod.GET)
	public String logout(ModelMap model)
	{
		model.addAttribute("message", "successfully logged out");
		return "logout";
	}

	@RequestMapping(value="/loginError",method = RequestMethod.GET)
	public String loginError(ModelMap model)
	{
		model.addAttribute("error", "true");
		return "login";
	}
	
	@RequestMapping(value = "/accessdenied",method = RequestMethod.GET)
	public ModelAndView accessDenied(Principal user) {
		ModelAndView model=new ModelAndView();
		if(user!=null) {
			model.addObject("msg","Hi "+user.getName()+",you do not have permission to access this page!");
		}
		else {
			model.addObject("msg","You do not have the  permission to access this page!");
		}
		model.setViewName("accessdenied");
		return model;
	}


}
