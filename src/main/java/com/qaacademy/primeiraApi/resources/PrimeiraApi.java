package com.qaacademy.primeiraApi.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class PrimeiraApi {
	
	@GetMapping("/primeiraApi")
	public String primeiraapi() {
		return "Retorno da API com sucesso!!!";
	}
	@GetMapping("/primeiraApiV1")
	public String primeiraApiQueryParam(@RequestParam String palavra) {
		return palavra;
	}
	@GetMapping("/primeiraApiV2/{valor}")
	public String primeiraApiPathParam(@PathVariable (value="valor")String variavelPath) {
		return variavelPath;
	}
}
