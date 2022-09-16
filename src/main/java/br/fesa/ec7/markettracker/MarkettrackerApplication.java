package br.fesa.ec7.markettracker;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.fesa.ec7.markettracker.models.ProdutoObtidoAPI;
import br.fesa.ec7.markettracker.utils.Utilitarios;

@SpringBootApplication
public class MarkettrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarkettrackerApplication.class, args);
		
		try {
			ObjectMapper om = new ObjectMapper();
			ProdutoObtidoAPI[] produtos = om.readValue(Utilitarios.jsonTeste, ProdutoObtidoAPI[].class);
			System.out.println(produtos);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
