package com.estacio.javasacolao;

import java.util.ArrayList;
import java.util.Scanner;

public class CalculadoraSacolao {
	public static void main(String[] args) {
		
		//	Utilitários
		Scanner s = new Scanner(System.in);
		s.useDelimiter("\n");
		ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
		
		boolean continuar = true;
		
		//	Loop principal
		while (continuar) {
			
			Integer opcao = Entrada.menuSelecao(s);
         
			switch (opcao) {
			
				case 1: Entrada.menuCadastro(listaProdutos, s); break;
			
            	case 2: Entrada.menuEditarCadastro(listaProdutos, s); break;
               
            	case 3: Entrada.menuConsulta(listaProdutos); break;
            	
            	case 4: Entrada.menuConsultaPlus(listaProdutos, s); break;
            	
            	case 5:
            		
            		continuar = false;
            		s.close();
            		
            	break;
            	
            	//	Prevenção de usuario burro
            	default: System.out.println("Opção inválida! Tente novamente."); 
            	
			}
		}
	}
}
