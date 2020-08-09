package com.hw.stock.app.utilities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hw.stock.app.dto.StockDTO;
import com.hw.stock.app.dto.StockTraderDTO;
import com.hw.stock.app.entities.Stock;
import com.hw.stock.app.entities.StockTrader;
import com.hw.stock.app.mapper.StockAppModelMapper;

@Component
public class StockAppUtilities {
	
	@Autowired
	private StockAppModelMapper stockAppModelMapper;
	
	public Stock stockDtoToEntityConverter(StockDTO stockdto) {
		return stockAppModelMapper.modelMapper().map(stockdto,Stock.class);
	}

	public StockTrader stockTraderDTOToEntityConverter(StockTraderDTO stockTraderDTO) {
		return stockAppModelMapper.modelMapper().map(stockTraderDTO,StockTrader.class);
	}
	
}
