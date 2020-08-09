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
public class StockDTO {
	
	
	
	@NotNull(message="stock name cannot be empty")
	private String name;

	@NotNull(message="stock price quantity cannot be empty")
	@Min(1)
	@Max(1000000)
	private Integer quantity;

	@NotNull(message="stock price cannot be null")
	@Min(1)
	private Float price;

}
