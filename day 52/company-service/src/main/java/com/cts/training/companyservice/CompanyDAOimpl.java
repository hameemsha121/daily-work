package com.cts.training.companyservice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins="*")
@RestController
public class CompanyDAOimpl {
	
	@Autowired
	CompanyDAO companyDao;
	
	@Autowired
	CompanyService companyService;
	
	@GetMapping("/company")
	public List<Company> getAllCompany()
	{
		return companyDao.findAll();
	}
	
	
	@GetMapping("/company/{id}")
	public Company getCompanyById(@PathVariable int id)
	{
		Optional<Company> companyList=companyDao.findById(id);
		Company company=companyList.get();
		return company;
	}
	
//	@PostMapping("/company")
//	public Company saveCompany(@RequestBody Company company)
//	{
//		Company newCompany=companyDao.save(company);
//		return newCompany;
//	}
//	
//	@DeleteMapping("/company/{id}")
//	public void deleteCompany(@PathVariable int id)
//	{
//		companyDao.deleteById(id);
//	}
//	
//	@PutMapping("/company")
//	public Company updateCompany(@RequestBody Company company)
//	{
//		Company updateCompany=companyDao.save(company);
//		return updateCompany;
//	}

	@PostMapping("/company")
	public ResponseEntity<Company> save(@RequestBody Company company)
	{
		companyService.insert(company);
		return new ResponseEntity<Company>(company,HttpStatus.CREATED); 
	}
	
	@PutMapping("/company")
	public ResponseEntity<Company> update(@RequestBody Company company)
	{
		companyService.update(company);
		return  new ResponseEntity<Company>(HttpStatus.OK);
	}
	
	@DeleteMapping("/company/{id}")
	public ResponseEntity<Company> delete(@PathVariable int id)
	{
		companyService.delete(id);
		return new ResponseEntity<Company>(HttpStatus.MOVED_PERMANENTLY);
	}
	
	
	
	
}
