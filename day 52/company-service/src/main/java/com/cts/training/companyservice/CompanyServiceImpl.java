package com.cts.training.companyservice;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CompanyServiceImpl implements CompanyService{

	@Autowired
	CompanyDAO companyDao;
	
	
	
	@Override
	public Company insert(Company comp) {
		Company company=new Company();
		BeanUtils.copyProperties(comp, company);
		companyDao.save(company);
		return comp;
	}

	@Override
	public Company update(Company comp) {
		Company company=new Company();
		BeanUtils.copyProperties(comp, company);
		BeanUtils.copyProperties(companyDao.save(company), comp);
		return comp;
	}

	@Override
	public void delete(int id) {
		companyDao.deleteById(id);
		
	}

}
