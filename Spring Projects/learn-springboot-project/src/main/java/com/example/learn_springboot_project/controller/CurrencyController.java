package com.example.learn_springboot_project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.learn_springboot_project.configuration.CurrencyServiceConfiguration;

@RestController
public class CurrencyController {
	@Autowired
	private CurrencyServiceConfiguration currencyConfig;
	
	@RequestMapping("/currency")
	public CurrencyServiceConfiguration retriveAllCurrencies() {
		return currencyConfig;
	}
}
