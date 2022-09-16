package br.fesa.ec7.markettracker.models;

import java.util.Date;

public class ProdutoObtido {
	
    private int id;
    private int iD_MERCADO;
    private int iD_PRODUTO;
    private Date datA_HORA_REGISTRO;
    private double preco;
    private Mercado mercado;
    private Produto produto;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getiD_MERCADO() {
		return iD_MERCADO;
	}
	public void setiD_MERCADO(int iD_MERCADO) {
		this.iD_MERCADO = iD_MERCADO;
	}
	public int getiD_PRODUTO() {
		return iD_PRODUTO;
	}
	public void setiD_PRODUTO(int iD_PRODUTO) {
		this.iD_PRODUTO = iD_PRODUTO;
	}
	public Date getDatA_HORA_REGISTRO() {
		return datA_HORA_REGISTRO;
	}
	public void setDatA_HORA_REGISTRO(Date datA_HORA_REGISTRO) {
		this.datA_HORA_REGISTRO = datA_HORA_REGISTRO;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public Mercado getMercado() {
		return mercado;
	}
	public void setMercado(Mercado mercado) {
		this.mercado = mercado;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}

}
