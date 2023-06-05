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
	public Double getPrecoCompra(int n) {
		return precoCompra * n;
	}
	public void setPrecoCompra(Double precoCompra) {
		this.precoCompra = precoCompra;
	}
	public Double getPrecoVenda(int n) {
		return ((this.precoCompra * n) * (this.lucro + 1));
	}
	public Double getLucro() {
		return lucro;
	}
	public void setLucro(Double lucro) {
		this.lucro = lucro;
	}
	
}
