package br.fesa.ec7.markettracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ResultadosPesquisaController {
	
	@RequestMapping("/resultadosPesquisa")
	public String form() {
		return "formResultadoPesquisa";
	}
}
