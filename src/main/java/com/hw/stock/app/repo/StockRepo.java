package com.hw.stock.app.repo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hw.stock.app.entities.Stock;

@Repository
public interface StockRepo extends JpaRepository<Stock, Integer> {

	@Transactional
	@Modifying
	@Query(value = "update stock set quantity = quantity - :quantity where stockid=:stockid", nativeQuery = true)
	public int buyStocks(@Param("quantity") Integer quantity, @Param("stockid") Integer stockid);

	@Transactional
	@Modifying
	@Query(value = "update stock set quantity = quantity + :quantity where stockid=:stockid", nativeQuery = true)
	public int sellStocks(@Param("quantity") Integer quantity, @Param("stockid") Integer stockid);

}
