package com.cts.training.stockpriceservices;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StockPriceServiceImpl implements StockPriceService {

	@Autowired
	StockPriceDao spDao;
	
	@Override
	public List<StockPrice> getAllStockPrice()
	{
		return spDao.findAll();
	}
	
	@Override
	public StockPrice getstockPriceById( int id) throws NoSuchElementException
	{
		Optional<StockPrice> spList=spDao.findById(id);
		StockPrice sp=spList.get();
		return sp;
	}
	
	@Override
	public StockPrice saveStockPrice(StockPrice sp)
	{
		StockPrice newStockPrice=spDao.save(sp);
		return newStockPrice;
	}
	
	@Override
	public void deleteStockPrice(int id)
	{
		spDao.deleteById(id);
	}
	

	@Override
	public StockPrice updateCompany(StockPrice sp)
	{
		StockPrice updateSp=spDao.save(sp);
		return updateSp;
	}

	
}
