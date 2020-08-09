package com.hw.stock.app.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class StockTraderDTO {

	@NotNull(message = "stock id cannot be empty")
	private Integer stockid;

	@NotNull(message = "trader name cannot be empty")
	private String name;

	@NotNull(message = "trader id cannot be empty")
	private Integer traderid;

	@NotNull(message = "stock name cannot be empty")
	private String stockname;

	@NotNull(message = "stock price quantity cannot be empty")
	@Min(1)
	@Max(1000000)
	private Integer quantity;

}
