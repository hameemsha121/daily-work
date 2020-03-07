package com.cts.training.stockpriceservices;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;


public interface StockPriceService {


	
	public List<StockPrice> getAllStockPrice();
	public StockPrice getstockPriceById(int id);
	public StockPrice saveStockPrice(StockPrice sp);
	public void deleteStockPrice(int id);
	public StockPrice updateCompany(StockPrice sp);
	public ImportSummary addStockPricesFromExcelSheet(MultipartFile file) throws Exception;


	
}
