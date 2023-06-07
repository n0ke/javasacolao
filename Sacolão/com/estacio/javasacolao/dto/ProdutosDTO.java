package com.estacio.javasacolao.dto;

public class ProdutosDTO {
		
	private static int id_produtos;
	private String nome;
	private Double precoCompra;
	private Double lucro = .0;
	
	public static int getId_produtos() {
		return id_produtos;
	}
	public static void setId_produtos(int id_produtos) {
		ProdutosDTO.id_produtos = id_produtos;
	}
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
