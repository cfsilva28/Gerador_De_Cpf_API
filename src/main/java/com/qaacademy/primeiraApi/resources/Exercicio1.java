package com.qaacademy.primeiraApi.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/exercicios")
public class Exercicio1 {

	@GetMapping("/parOuImpar")
	public String verificarParImpar(@RequestParam int numero) {
		if (numero % 2 == 0) {
			return " O numero " + (numero) + " é par ";
		} else {
			return " O numero " + (numero) + " é impar ";
		}

	}
}