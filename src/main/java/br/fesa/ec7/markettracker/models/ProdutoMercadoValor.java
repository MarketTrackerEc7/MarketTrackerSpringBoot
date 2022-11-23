package br.fesa.ec7.markettracker.models;

import java.time.LocalDateTime;

public class ProdutoMercadoValor{
	
	private String produto;
	private String mercado;
	private String enderecO_MERCADO;
	private double preco;
	private double distancia;
	private LocalDateTime datA_HORA_REGISTRO;
	
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public String getMercado() {
		return mercado;
	}
	public void setMercado(String mercado) {
		this.mercado = mercado;
	}
	public String getEnderecO_MERCADO() {
		return enderecO_MERCADO;
	}
	public void setEnderecO_MERCADO(String enderecO_MERCADO) {
		this.enderecO_MERCADO = enderecO_MERCADO;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public double getDistancia() {
		return distancia;
	}
	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}
	public LocalDateTime getDatA_HORA_REGISTRO() {
		return datA_HORA_REGISTRO;
	}
	public void setDatA_HORA_REGISTRO(LocalDateTime datA_HORA_REGISTRO) {
		this.datA_HORA_REGISTRO = datA_HORA_REGISTRO;
	}
}

