package br.fesa.ec7.markettracker.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.fesa.ec7.markettracker.models.Produto;
import br.fesa.ec7.markettracker.models.ProdutoObtidoAPI;
import br.fesa.ec7.markettracker.models.Texto;
import br.fesa.ec7.markettracker.services.ProdutoService;

@Controller
public class PesquisaController {
	
	@Autowired
	ProdutoService produtoService;
	//@RequestMapping("/pesquisarProduto")
	
	@GetMapping("/pesquisarProduto")
    public String form(final Model model) {
		
		model.addAttribute(new Texto());

        return "formTelaPesquisa";
    }
	
	@PostMapping("/listarProdutos")
	public String form(@ModelAttribute Texto t, ModelMap model) {
		
		String produtoDigitado = t.getTexto();
		
		if(produtoDigitado.length() > 0) {
			ProdutoObtidoAPI[] produtos = produtoService.getProdutos(produtoDigitado);
	    	model.addAttribute("produtos",produtos);
			
			return "formTelaPesquisa";
		}else {
			return "formTelaPesquisa";
		}

	}
	
	

}
