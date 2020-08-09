package com.hw.stock.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hw.stock.app.entities.Stock;
import com.hw.stock.app.entities.StockTrader;
import com.hw.stock.app.repo.StockRepo;
import com.hw.stock.app.repo.StockTraderRepo;

@Service
public class StockAppServices implements StockApplicationOperations {

	@Autowired
	private StockRepo stockRepo;

	@Autowired
	private StockTraderRepo stockTraderRepo;

	@Override
	public List<Stock> getAllStocks() {
		return stockRepo.findAll();
	}

	@Override
	public StockTrader buyStock(StockTrader st) {
		StockTrader stck = stockTraderRepo.saveAndFlush(st);
		stockRepo.buyStocks(st.getQuantity(), st.getStockid());
		return stck;
	}

	@Override
	public Integer sellStock(StockTrader st) {
		Integer sellQuantity = st.getQuantity();
		Integer sellStockId = st.getStockid();
		Integer rows = stockTraderRepo.sellTraderStocks(sellQuantity, sellStockId);
		stockRepo.sellStocks(sellQuantity, sellStockId);
		return rows;
	}

}
