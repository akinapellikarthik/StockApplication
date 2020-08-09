package com.hw.stock.app.repo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.hw.stock.app.entities.StockTrader;

public interface StockTraderRepo extends JpaRepository<StockTrader, Integer> {
	
	@Transactional
	@Modifying
	@Query(value = "update stocktrader set quantity = quantity - :quantity where stockid=:stockid", nativeQuery = true)
	public int sellTraderStocks(@Param("quantity") Integer quantity, @Param("stockid") Integer stockid);

}
