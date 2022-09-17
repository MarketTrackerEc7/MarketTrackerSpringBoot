package br.fesa.ec7.markettracker.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.fesa.ec7.markettracker.models.ProdutoObtidoAPI;
import br.fesa.ec7.markettracker.services.ProdutoService;

@Controller
public class ResultadosPesquisaController {
	
	@Autowired
	ProdutoService produtoService;
	
	@RequestMapping("/resultadosPesquisa")
	
	@GetMapping("/")
	public String home(ModelMap model) {
		
		//ProdutoObtidoAPI[] produtos = produtoService.getProdutos();
		
		//model.addAttribute("produtos",produtos);
		
		return "formResultadoPesquisa";
	}
}
