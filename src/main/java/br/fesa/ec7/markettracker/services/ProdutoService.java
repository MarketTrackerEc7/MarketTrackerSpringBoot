package br.fesa.ec7.markettracker.services;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.fesa.ec7.markettracker.models.Produto;
import br.fesa.ec7.markettracker.models.ProdutoMercadoValor;
import br.fesa.ec7.markettracker.models.ResultadoBuscaMercado;

@Service
public class ProdutoService {
	
	public ProdutoMercadoValor[] getProdutos(String produto) {
		
		RestTemplate restTemplate = new RestTemplate();
		RestTemplateBuilder restTemplateBuilder = new RestTemplateBuilder();
		restTemplate = restTemplateBuilder.build();
		
		ProdutoMercadoValor[] produtos = null;
		
		try {
			//produtos = restTemplate.getForObject("http://markettrackerec7-001-site1.etempurl.com/Api/BaseDeProdutos/BuscarProduto/" + produto,ProdutoObtidoAPI[].class);
			produtos = restTemplate.getForObject("http://markettracker-001-site1.btempurl.com/Api/BaseDeProdutos/BuscarProdutoByTextoAndLatLong/" + produto + "/-23.74012891225548/-46.583675091845784",ProdutoMercadoValor[].class);
		}
		catch(Exception ex) {
			
		}
		
		return produtos;
	}

	public Produto[] getListaProdutos() {
		
		RestTemplate restTemplate = new RestTemplate();
		RestTemplateBuilder restTemplateBuilder = new RestTemplateBuilder();
		restTemplate = restTemplateBuilder.build();
		
		Produto[] produtos = null;
		
		try {
			produtos = restTemplate.getForObject("http://markettracker-001-site1.btempurl.com/Api/BaseDeProdutos/ListarProdutos",Produto[].class);
		}
		catch(Exception ex) {
			
		}
		
		return produtos;
	}
	
	public ResultadoBuscaMercado[] getListaResultadoMercados(String idsProdutos) {
		RestTemplate restTemplate = new RestTemplate();
		RestTemplateBuilder restTemplateBuilder = new RestTemplateBuilder();
		restTemplate = restTemplateBuilder.build();
		
		ResultadoBuscaMercado[] produtos = null;
		
		//idsProdutos = idsProdutos.replace(",", "%2C");
		
		try {
			produtos = restTemplate.getForObject("http://markettracker-001-site1.btempurl.com/Api/BaseDeProdutos/BuscarByProdutosIDsListAndLatLong/-23.74012891225548/-46.583675091845784/" + idsProdutos, ResultadoBuscaMercado[].class);
		}
		catch(Exception ex) {
			
		}
		
		return produtos;
	}
}
