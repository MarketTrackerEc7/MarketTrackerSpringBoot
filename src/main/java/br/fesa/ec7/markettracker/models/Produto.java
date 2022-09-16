package br.fesa.ec7.markettracker.models;

public class Produto {
	
	private int id;
    private String nome;
    private String coD_BARRAS;
    
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCoD_BARRAS() {
		return coD_BARRAS;
	}
	
	public void setCoD_BARRAS(String coD_BARRAS) {
		this.coD_BARRAS = coD_BARRAS;
	}

}
