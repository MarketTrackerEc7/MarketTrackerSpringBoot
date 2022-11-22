package br.fesa.ec7.markettracker.services;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.fesa.ec7.markettracker.models.ProdutoObtido;
import br.fesa.ec7.markettracker.models.ProdutoObtidoAPI;

@Service
public class ProdutoService {
	
	public ProdutoObtidoAPI[] getProdutos(String produto) {
		
		RestTemplate restTemplate = new RestTemplate();
		RestTemplateBuilder restTemplateBuilder = new RestTemplateBuilder();
		restTemplate = restTemplateBuilder.build();
		
		ProdutoObtidoAPI[] produtos = null;
		
		try {
			//produtos = restTemplate.getForObject("http://markettrackerec7-001-site1.etempurl.com/Api/BaseDeProdutos/BuscarProduto/" + produto,ProdutoObtidoAPI[].class);
			produtos = restTemplate.getForObject("http://markettracker-001-site1.btempurl.com/Api/BaseDeProdutos/BuscarProdutoByTextoAndLatLong/" + produto + "/-23.74012891225548/-46.583675091845784",ProdutoObtidoAPI[].class);
		}
		catch(Exception ex) {
			
		}
		
		return produtos;
	}
	

}
