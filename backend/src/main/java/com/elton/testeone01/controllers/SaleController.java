package com.elton.testeone01.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class SaleController {
	
	@GetMapping
	public String test() {
		return "Hello word";
	}

}
