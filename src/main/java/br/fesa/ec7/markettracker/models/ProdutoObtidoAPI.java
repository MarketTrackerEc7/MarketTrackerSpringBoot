package br.fesa.ec7.markettracker.models;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ProdutoObtidoAPI{

	
    public int id;
    public int iD_MERCADO;
    public int iD_PRODUTO;
    public Date datA_HORA_REGISTRO;
    public double preco;
	
	@JsonProperty("mercado")
	public Mercado mercado;
	
	@JsonProperty("produto")
	public Produto produto;
	

}

