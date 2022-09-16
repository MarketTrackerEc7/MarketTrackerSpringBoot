package br.fesa.ec7.markettracker.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
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
	
    @PostMapping
    public String result(ModelMap model) {
		
		ProdutoObtidoAPI[] produtos = produtoService.getProdutos();
		
		model.addAttribute("produtos",produtos);
		
        return "formTelaPesquisa";
    }

}
