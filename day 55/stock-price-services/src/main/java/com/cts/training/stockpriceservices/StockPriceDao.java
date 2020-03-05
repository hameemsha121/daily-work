package com.cts.training.stockpriceservices;

import org.springframework.data.jpa.repository.JpaRepository;



public interface StockPriceDao  extends JpaRepository<StockPrice, Integer>{

}
