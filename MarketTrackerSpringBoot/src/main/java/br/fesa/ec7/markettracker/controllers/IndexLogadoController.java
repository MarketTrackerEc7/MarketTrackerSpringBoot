package br.fesa.ec7.markettracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexLogadoController {
	
	@RequestMapping("/indexLogado")
	public String index() {
		return "indexLogado";
	}

}
