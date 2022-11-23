package br.fesa.ec7.markettracker.models;

import java.util.ArrayList;

public class ResultadoBuscaMercado {
	
	 private String mercado;
	 private String enderecO_MERCADO;
	 private float distancia;
	 private float valoR_TOTAL;
	 ArrayList < Object > produtoS_DISPONIVEIS = new ArrayList < Object > ();

	 public String getMercado() {
	  return mercado;
	 }

	 public String getEnderecO_MERCADO() {
	  return enderecO_MERCADO;
	 }

	 public float getDistancia() {
	  return distancia;
	 }

	 public float getValoR_TOTAL() {
	  return valoR_TOTAL;
	 }

	 public void setMercado(String mercado) {
	  this.mercado = mercado;
	 }

	 public void setEnderecO_MERCADO(String enderecO_MERCADO) {
	  this.enderecO_MERCADO = enderecO_MERCADO;
	 }

	 public void setDistancia(float distancia) {
	  this.distancia = distancia;
	 }

	 public void setValoR_TOTAL(float valoR_TOTAL) {
	  this.valoR_TOTAL = valoR_TOTAL;
	 }
}
