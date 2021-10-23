package com.qaacademy.primeiraApi.resources;

import java.text.DecimalFormat;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/exercicios")
public class Exercicio2 {
	DecimalFormat df = new DecimalFormat("#,###.00");

	@GetMapping("/calcularsalario/{salariodigitado}")
	public String calculaSalario(@PathVariable(value = "salariodigitado") double salario) {

		if (salario < 1903.99) {
			return "Você está isento";

		} else if (salario > 1903.98 && salario < 2826.66) {
			return "O Salário BRUTO é: R$ " + df.format(salario) + "\nO imposto é: R$ "
					+ df.format((salario * 0.075) - 142.80) + "\nE o salário líquido é: R$ "
					+ df.format(salario - salario * 0.075 + 142.80);

		} else if (salario > 2826.65 && salario < 3751.06) {
			return "O Salário BRUTO é: R$ " + df.format(salario) + "\nO imposto é: R$ "
					+ df.format((salario * 0.075) - 142.80) + "\nE o salário líquido é: R$ "
					+ df.format(salario - salario * 0.15 + 354.80);

		} else if (salario > 3751.05 && salario < 4664.69) {
			return "O Salário BRUTO é: R$ " + df.format(salario) + "\nO imposto é: R$ "
					+ df.format((salario * 0.075) - 142.80) + "\nE o salário líquido é: R$ "
					+ df.format(salario - salario * 0.225 + 636.13);
		} else {
			return "O Salário BRUTO é: R$ " + df.format(salario) + "\nO imposto é: R$ "
					+ df.format((salario * 0.075) - 142.80) + "\nE o salário líquido é: R$ "
					+ df.format(salario - salario * 0.275 + 869.36);
		}
	}
}