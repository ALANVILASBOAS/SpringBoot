package com.helloword.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello2")
public class HelloController2 {
	
	@GetMapping
	public String hello() {
		return "Minha segunda aplicação::: "
				+ "Quero treinar minha comunicação e exercitar atividades para conscentração e motivação.";
	}

}
