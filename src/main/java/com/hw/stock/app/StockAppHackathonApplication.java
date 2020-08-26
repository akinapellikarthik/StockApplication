package com.hw.stock.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.hw.*")
public class StockAppHackathonApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(StockAppHackathonApplication.class, args);
	}

}
