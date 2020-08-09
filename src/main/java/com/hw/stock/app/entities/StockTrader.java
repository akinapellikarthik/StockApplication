package com.hw.stock.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="stocktrader")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class StockTrader {

	@Column(name = "stockid")
	private Integer stockid;

	@Column(name = "name")
	private String name;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "traderid")
	private Integer traderid;

	@Column(name = "stockname")
	private String stockname;

	@Column(name = "quantity")
	private Integer quantity;

}
