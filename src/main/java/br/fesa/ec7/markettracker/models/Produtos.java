package br.fesa.ec7.markettracker.models;

public class Produtos {
	
	private int id;
	private String nome;
	private String cod_barras;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String descricao) {
		this.nome = descricao;
	}
	public String getCod_Barras() {
		return cod_barras;
	}
	public void setCod_Barras(String fabricante) {
		this.cod_barras = fabricante;
	}

}
