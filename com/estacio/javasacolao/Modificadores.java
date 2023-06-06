package com.estacio.javasacolao;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.BevelBorder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Modificadores {
	
	public static void updateTabela(JTable tabela, ArrayList<Produto> lista, int qtt) {
		
		//	Cria tabela vazia
		DefaultTableModel tabelaPronta = new DefaultTableModel(
			new Object[][] {},
			new String[] {"", "Nome", "Pre\u00E7o", "Lucro", "Total"}) {
			
			//	Config das colunas no TableModel
			private static final long serialVersionUID = 1L;
			boolean[] columnEditables = new boolean[] {
				false, true, true, true, false
			};
			
			@Override
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		};

		for(int i = 0; i < lista.size(); i++) {
			Object[] novaLinha = {
				i + 1, lista.get(i).getNome(),
				lista.get(i).getPrecoCompra(qtt),
				lista.get(i).getLucro() * 100,
				lista.get(i).getPrecoVenda(qtt)
			};
			
			//	Aqui é incrementado uma linha de cada vez dentro do array[]
			tabelaPronta.addRow(novaLinha);
		}
		
		//	Insere a "tabela" na tabela (sla)
		tabela.setModel(tabelaPronta);
		
		//	Mudando de tamanho
		tabela.getColumnModel().getColumn(0).setResizable(false);
		tabela.getColumnModel().getColumn(0).setPreferredWidth(21);
		tabela.getColumnModel().getColumn(1).setResizable(false);
		tabela.getColumnModel().getColumn(1).setPreferredWidth(375);
		tabela.getColumnModel().getColumn(2).setResizable(false);
		tabela.getColumnModel().getColumn(3).setResizable(false);
		tabela.getColumnModel().getColumn(4).setResizable(false);
		tabela.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));

	}
	
	public static void updateLista(JTable tabela, ArrayList<Produto> lista, int qtt) {
		
		for(int i = 0; i < lista.size(); i++) {
			Object nome = tabela.getModel().getValueAt(i, 1);
			Object preco = tabela.getModel().getValueAt(i, 2);
			Object lucro = tabela.getModel().getValueAt(i, 3);
			lista.get(i).setNome(nome.toString());
			lista.get(i).setPrecoCompra(Double.parseDouble(preco.toString()) / qtt);
			lista.get(i).setLucro(Double.parseDouble(lucro.toString()) * .01);
		}
	}
}
