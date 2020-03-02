package com.cts.training.exchangeservice;

import java.util.List;


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
public class StockExchangeDAOImpl {
	
	@Autowired
	StockExchangeDAO exchangeDAO;
	
	@Autowired
	ExchangeService exchangeService;
	
	@GetMapping("/exchange")
	public List<StockExchange> getAllStockExchange()
	{
		return exchangeService.getAllStockExchange();
	}
	
	@PostMapping("/exchange")
	public StockExchange saveStockExchange(@RequestBody StockExchange exchange)
	{
		StockExchange newExchange=exchangeService.saveStockExchange(exchange);
		return newExchange;
	}
	
	@GetMapping("/exchange/{id}")
	public StockExchange getExchangeById(@PathVariable int id)
	{
		StockExchange exchangeList=exchangeService.getExchangeById(id);
		return exchangeList;
	}
	
	@DeleteMapping("/exchange/{id}")
	public void deleteStockExchange(@PathVariable int id)
	{
		exchangeService.deleteStockExchange(id);
	}

	
	@PutMapping("/exchange")
	public StockExchange updateExchange(@RequestBody StockExchange exchange)
	{
		StockExchange updateExchange=exchangeService.saveStockExchange(exchange);
		return updateExchange;
	}
}
