package com.helloword.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping
	public String hello() {
		return "Minha primeira aplicação::: "
				+ "Para essa atividade foi necessário uso das habildades e mentalidades: \n"
				+ "Persistencia, responsabilidade pessoal e atenção aos detalhes.";
	}

}
