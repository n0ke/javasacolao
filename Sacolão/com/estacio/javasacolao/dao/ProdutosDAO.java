package com.estacio.javasacolao.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import com.estacio.javasacolao.dto.ProdutosDTO;
import com.estacio.javasacolao.jdbc.JavaConnect;


public class ProdutosDAO {
	
	public void inserir(ProdutosDTO produtosDTO) {
		try {
		
			Connection connection = JavaConnect.getInstance().getConnection();
			
			String sql = "INSERT INTO bancojava(id_Product, nome, precoCompra, lucro) VALUES(?, ?)";
			
			PreparedStatement statement = connection.prepareStatement(sql);
			
			statement.setInt(1, ProdutosDTO.getId_produtos());
			statement.setString(2, produtosDTO.getNome());
			statement.setDouble(3, produtosDTO.getPrecoCompra());
			statement.setDouble(3, produtosDTO.getLucro());
			
			statement.execute();
			statement.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void remover (int idProdutos) {
		try {
			Connection connection = JavaConnect.getInstance().getConnection();
			
			String sql = "DELETE FROM Produtos WHERE id_Product = ?";
			
			PreparedStatement statement = connection.prepareStatement(sql);
			
			statement.setInt(1, idProdutos);
			statement.execute();
			statement.close();
			
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		ProdutosDTO produtosDTO = new ProdutosDTO();
		produtosDTO.setNome("Test");
		
		ProdutosDAO produtosDAO = new ProdutosDAO();
		produtosDAO.inserir(produtosDTO);
		
	}
	
	
	
/*	public List<ProdutosDTO> listarTodos(){
		List<ProdutosDTO> listaProdutos = new ArrayList<ProdutosDTO>();
		try {
			Connection connection = JavaConnect.getInstance().getConnection();
			
			String sql = "SELECT * FROM bancojava";
			
			PreparedStatement statement = connection.prepareStatement(sql);
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/

}
