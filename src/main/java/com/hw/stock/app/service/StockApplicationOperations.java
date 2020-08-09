package com.hw.stock.app.service;

import java.util.List;

import com.hw.stock.app.entities.Stock;
import com.hw.stock.app.entities.StockTrader;

public interface StockApplicationOperations {

	public List<Stock> getAllStocks();

	public StockTrader buyStock(StockTrader s);

	Integer sellStock(StockTrader st);

}
