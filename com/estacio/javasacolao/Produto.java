package com.estacio.javasacolao;

public class Produto {
	
	//	Atributos
	private String nome;
	private Double precoCompra;
	private Double lucro = .0;
	
	//	Construtor
	public Produto(String nome, Double precoCompra, Double lucro) {
		this.nome = nome;
		this.precoCompra = precoCompra;
		this.lucro = lucro;
	}
	
	//	Gets e Sets
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPrecoCompra() {
		return precoCompra;
	}
	public void setPrecoCompra(Double precoCompra) {
		this.precoCompra = precoCompra;
	}
	public Double getLucro() {
		return lucro;
	}
	public void setLucro(Double lucro) {
		this.lucro = lucro;
	}
	
}
