package com.cts.training.stockpriceservices;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;



public interface StockPriceDao  extends JpaRepository<StockPrice, Integer>{
	
	@Query("From StockPrice where companyCode =?1 and stockExchange=?2 and date=?3 and time=?4 ")
	public Optional<StockPrice> getIfAlreadyExists(String companyCode,String stockExchange,LocalDate date,LocalTime time);

}