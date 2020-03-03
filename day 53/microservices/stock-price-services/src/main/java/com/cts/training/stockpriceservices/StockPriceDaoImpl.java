package com.cts.training.stockpriceservices;

import java.util.List;

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
public class StockPriceDaoImpl {

	@Autowired
	StockPriceDao spDao;
	
	@Autowired
	StockPriceService stockPriceService;
	
//	@GetMapping("/stockprice")
//	public List<StockPrice> getAllStockPrice()
//	{
//		return stockPriceService.getAllStockPrice();
//	}
//	
//	@GetMapping("/stockprice/{id}")
//	public StockPrice getstockPriceById(@PathVariable int id)
//	{
//		StockPrice spList=stockPriceService.getstockPriceById(id);
//		
//		return spList;
//	}
	
	@GetMapping("/stockprice")
	public ResponseEntity<?>getallexchanges() {
		List<StockPrice> list = stockPriceService.getAllStockPrice();
		if(list.size()>0)
		{
			return new ResponseEntity<List<StockPrice>>(list , HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<String>("Not found",HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("/stockprice/{id}")
	public ResponseEntity<?> getElementById(@PathVariable("id") int id) {
		try {
			StockPrice stockprice=stockPriceService.getstockPriceById(id);
			return new ResponseEntity<StockPrice>(stockprice,HttpStatus.OK);
		}catch(NoClassDefFoundError e){
			return new ResponseEntity<String>("Not found",HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/stockprice")
	public ResponseEntity<StockPrice>saveStockPrice(@RequestBody StockPrice sp)
	{
		stockPriceService.saveStockPrice(sp);
		return new ResponseEntity<StockPrice>(sp,HttpStatus.OK);
	}
	
	@DeleteMapping("/stockprice/{id}")
	public ResponseEntity<StockPrice> deleteStockPrice(@PathVariable int id)
	{
		stockPriceService.deleteStockPrice(id);
		return new ResponseEntity<StockPrice>(HttpStatus.OK);
	}
	
	
	@PutMapping("/stockprice/{id}")
	public ResponseEntity<StockPrice> updateCompany(@RequestBody StockPrice sp)
	{
		stockPriceService.saveStockPrice(sp);
		return new ResponseEntity<StockPrice>(sp,HttpStatus.OK);
	}

	
}
