package com.hw.stock.app.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hw.stock.app.dto.StockTraderDTO;
import com.hw.stock.app.entities.Stock;
import com.hw.stock.app.entities.StockTrader;
import com.hw.stock.app.service.StockAppServices;
import com.hw.stock.app.utilities.StockAppUtilities;

@RestController
@RequestMapping("/v1/api")
public class StockAppController {

	@Autowired
	private StockAppServices stockAppServices;

	@Autowired
	private StockAppUtilities stockAppUtilities;

	@GetMapping("/alive")
	public String appAlive() {
		return "I am alive";
	}

	@GetMapping("/stocks")
	public List<Stock> stocks() {
		return stockAppServices.getAllStocks();
	}

	@PostMapping("/buystock")
	public StockTrader buy(@Valid @RequestBody StockTraderDTO stockTraderDTO) {
		StockTrader st = stockAppUtilities.stockTraderDTOToEntityConverter(stockTraderDTO);
		return stockAppServices.buyStock(st);
	}

	@PutMapping("/sellstock")
	public String sell(@Valid @RequestBody StockTraderDTO stockTraderDTO) {
		StockTrader st = stockAppUtilities.stockTraderDTOToEntityConverter(stockTraderDTO);
		return stockAppServices.sellStock(st) > 0 ? "Success" : "Failure";
	}

}
