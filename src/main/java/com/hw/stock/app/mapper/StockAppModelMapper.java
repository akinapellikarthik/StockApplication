package com.hw.stock.app.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class StockAppModelMapper {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}