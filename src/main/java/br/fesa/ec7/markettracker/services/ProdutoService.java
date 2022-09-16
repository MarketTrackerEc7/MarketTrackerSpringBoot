package br.fesa.ec7.markettracker.services;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.fesa.ec7.markettracker.models.ProdutoObtido;
import br.fesa.ec7.markettracker.models.ProdutoObtidoAPI;

@Service
public class ProdutoService {
	
	public ProdutoObtidoAPI[] getProdutos() {
		
		RestTemplate restTemplate = new RestTemplate();
		RestTemplateBuilder restTemplateBuilder = new RestTemplateBuilder();
		restTemplate = restTemplateBuilder.build();
		
		ProdutoObtidoAPI[] produtos = restTemplate.getForObject("http://markettrackerec7-001-site1.etempurl.com/Api/BaseDeProdutos/BuscarProduto/coca",ProdutoObtidoAPI[].class);
		
		return produtos;
	}
	

}
