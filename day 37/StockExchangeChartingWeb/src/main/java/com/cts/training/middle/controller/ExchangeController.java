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
import com.cts.training.dao.StockExchangeDAO;
import com.cts.training.model.Company;
import com.cts.training.model.StockExchangeEntity;

@Controller
public class ExchangeController {

	@Autowired
	StockExchangeDAO stockDAO;
	
	
	@GetMapping("/exchange-home")
	public String exchangePage(Model model)
	{
		List<StockExchangeEntity> stock=stockDAO.getAllStockExchanges();
		model.addAttribute("list", stock);

		model.addAttribute("exchange", new StockExchangeEntity());//user will work as a model attribute in a form
		return "exchangeoperations";
	}
	
	@PostMapping("/exchange/save")
	//or @RequestMapping(value="/user/save",method=RequestMethod.post)
	public String addUser(@ModelAttribute("exchange") StockExchangeEntity stock)
	{
		stockDAO.saveOrUpdateStockExchange(stock);
		return "redirect:/exchange-home";
	}
	@GetMapping("/delete")//{}----path variable
	public String deleteUser(@RequestParam("id")int id) {
		StockExchangeEntity stock=stockDAO.getStockExchangeById(id);
		stockDAO.deleteStockExchange(stock);
		return "redirect:/exchange-home";
		
	}
	@GetMapping("/exchangeupdate")
	public String updateUser(@RequestParam("id") int id, Model model)
	{
		StockExchangeEntity stockExchange= stockDAO.getStockExchangeById(id);
		model.addAttribute("exchange",stockExchange);
		List<StockExchangeEntity> stock=stockDAO.getAllStockExchanges();
		model.addAttribute("list", stock);
		return "exchangeoperations";
	}
	
}
