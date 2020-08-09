package com.hw.stock.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Entity
public class Stock {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO,generator="stockapp_sequence")
	@Column(name = "stockid")
	private Integer id;

	@Column(name = "name", nullable = false)
	private String name;

	@Column(name = "quantity", nullable = false)
	@Min(1)
	@Max(1000000)
	private Integer quantity;

	@Column(name = "price", nullable = false)
	@Min(1)
	private Float price;

}
