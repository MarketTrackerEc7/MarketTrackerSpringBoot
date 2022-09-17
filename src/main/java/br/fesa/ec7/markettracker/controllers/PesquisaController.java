package br.fesa.ec7.markettracker.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.fesa.ec7.markettracker.models.ProdutoObtidoAPI;
import br.fesa.ec7.markettracker.services.ProdutoService;

@Controller
public class PesquisaController {
	
	@Autowired
	ProdutoService produtoService;
	
	@RequestMapping("/pesquisarProduto")
    public String form(ModelMap model) {
		

    	String produtoDigitado = "cerveja";
    		 
    	ProdutoObtidoAPI[] produtos = produtoService.getProdutos(produtoDigitado);
    	model.addAttribute("produtos",produtos);


        return "formTelaPesquisa";
    }
	

}
