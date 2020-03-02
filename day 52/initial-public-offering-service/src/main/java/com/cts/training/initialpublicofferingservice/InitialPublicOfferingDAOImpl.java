package com.cts.training.initialpublicofferingservice;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
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
public class InitialPublicOfferingDAOImpl {
	
	@Autowired
	InitialPublicOfferingDAO ipoDAO;
	
	@Autowired
	IpoService ipoService;
	
	@GetMapping("/ipo")
	public List<InitialPublicOffering> getAllIpo()
	{
		return ipoService.getAllIpo();
	}

	@GetMapping("/ipo/{id}")
	public InitialPublicOffering getIpoById(@PathVariable int id) throws NoSuchElementException
	{
		InitialPublicOffering ipoList=ipoService.getIpoById(id);
		return ipoList;
	}
	
	@PostMapping("/ipo")
	public InitialPublicOffering saveIpo(@RequestBody InitialPublicOffering ipo)
	{
		InitialPublicOffering newIpo=ipoService.saveIpo(ipo);
		return newIpo;
	}
	
	@DeleteMapping("/ipo/{id}")
	public void deleteIpo(@PathVariable int id)
	{
		ipoService.deleteIpo(id);
	}
	
	@PutMapping("/ipo/")
	public InitialPublicOffering updateIpo(@RequestBody InitialPublicOffering ipo)
	{
		InitialPublicOffering updateIpo=ipoService.saveIpo(ipo);
		return updateIpo;
	}
}
