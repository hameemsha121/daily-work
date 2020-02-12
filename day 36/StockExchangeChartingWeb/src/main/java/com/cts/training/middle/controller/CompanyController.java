package com.cts.training.middle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cts.training.dao.CompanyDAO;
import com.cts.training.dao.RegisterDAO;
import com.cts.training.model.Company;
import com.cts.training.model.Register;

@Controller
public class CompanyController {

	@Autowired
	CompanyDAO companyDAO;
	
	
	@GetMapping("/company-home")
	public String companyPage(Model model)
	{
		List<Company> companies=companyDAO.getAllCompanies();
		model.addAttribute("list", companies);
		model.addAttribute("company", new Company());//user will work as a model attribute in a form
		return "companyoperations";
	}
	
	@PostMapping("/company/save")
	//or @RequestMapping(value="/user/save",method=RequestMethod.post)
	public String addUser(@ModelAttribute("company") Company company)
	{
		companyDAO.saveCompany(company);
		return "redirect:/company-home";
	}
	@GetMapping("/remove")//{}----path variable
	public String deleteUser(@RequestParam("id")int id) {
		Company company=companyDAO.getCompanyById(id);
		companyDAO.deleteCompany(company);
		return "redirect:/company-home";
		
	}
}


